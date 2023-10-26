import java.util.ArrayList;

public class PolynomialR {
    public static void main(String[] args) {
        ArrayList<Datos> DatosList = Datos.Machine();
        ArrayList<Datos> DatosSIM = Datos.MachineSIM();
        System.out.println("--------Ecuacion Regresion Multiple--------");
        System.out.println("(B0+B1+X1+B2+X2)");
        System.out.println();
        PR(DatosList);
        System.out.println("");
        System.out.println("--------SIMULACION--------");
        System.out.println("(B0+B1+X1+B2+X2+B3+X3)");
        System.out.println();
        PR(DatosSIM);
    }
    public static void PR(ArrayList<Datos>datosList)  {

        double sumX = 0, sumY = 0, sumX2 = 0, sumX3 = 0, sumX4 = 0, sumX2Y = 0, sumXY = 0;
        int n = datosList.size();

        double[][] matrizx = new double[3][3];
        double[][] matrrizy = new  double[3][1];
        for (Datos datos : datosList) {
            double xt = datos.getxt();
            double y = datos.getY();
            sumX += xt;
            sumY += y;
            sumX2 += xt * xt;
            sumX3 += xt * xt * xt;
            sumX4 += xt * xt * xt * xt;
            sumX2Y += (xt * xt) * y;
            sumXY += xt * y;
        }

        matrizx[0][0] = sumX4;
        matrizx[0][1] = sumX3;
        matrizx[0][2] = sumX2;
        matrizx[1][0] = sumX3;
        matrizx[1][1] = sumX2;
        matrizx[1][2] = sumX;
        matrizx[2][0] = sumX2;
        matrizx[2][1] = sumX;
        matrizx[2][2] = n;

        //Valores Y
        matrrizy[0][0] = sumX2Y;
        matrrizy[1][0] = sumXY;
        matrrizy[2][0] = sumY;

        int filas = matrizx.length;
        int columnas = matrizx[0].length;
        //CALCULAR TRANSPUESTA
        double[][] Transpuesta = new double[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < matrizx[0].length; j++) {
                Transpuesta[j][i] = matrizx[i][j];
            }
        }
        //CALCULAR MATRIS X TRANSPUESTA
        double[][] matrisXtrans = new double[columnas][filas];
        for (int i = 0; i<columnas;i++){
            for (int j = 0; j<columnas;j++){
                for (int z=0;z<filas;z++){
                    matrisXtrans[i][j]+=Transpuesta[i][z]*matrizx[z][j];
                }
            }
        }
        //CALCULAR INVERSA
        double[][] matrizIdentidad = new double[columnas][columnas];
        for (int i = 0; i < columnas; i++) {
            matrizIdentidad[i][i] = 1.0;
        }
        double[][] matrizCompleta = new double[columnas][2 * columnas];
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizCompleta[i][j] = matrisXtrans[i][j];
                matrizCompleta[i][j + columnas] = matrizIdentidad[i][j];
            }
        }
        for (int i=0;i< matrizCompleta.length; i++) {
            double carry = matrizCompleta[i][i];
            for (int j = 0; j < matrizCompleta.length * 2; j++) {
                matrizCompleta[i][j] /= carry;
            }
            for (int z = 0; z < matrizCompleta.length; z++) {
                if (z != i) {
                    double FactSolt = matrizCompleta[z][i];
                    for (int j = 0; j < matrizCompleta.length * 2; j++) {
                        matrizCompleta[z][j] -= FactSolt * matrizCompleta[i][j];
                    }
                }
            }
        }
        double[][] parteDerecha = new double[matrizCompleta.length][matrizCompleta[0].length/2];

        for (int i = 0; i < matrizCompleta.length; i++) {
            for (int j = 0; j < matrizCompleta.length; j++) {
                parteDerecha[i][j] = matrizCompleta[i][j + matrizCompleta[0].length/2];
            }
        }

        //CALCULAR TRANSPUESTA DE X * Y
        double[][] TransxXy = new double[Transpuesta.length][matrrizy.length];
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < Transpuesta[0].length; j++) {
                double resultado = 0;
                for (int k = 0; k < matrrizy.length; k++) {
                    resultado += Transpuesta[i][k] * matrrizy[k][0];
                }
                TransxXy[i][j] = resultado;
            }
        }

        //CALULAR (X^T * X)^-1) X^T * Y
        double[] Total = new double[parteDerecha.length];
        for (int i = 0; i < parteDerecha.length; i++) {
            double resultado = 0;
            for (int k = 0; k < parteDerecha[0].length; k++) {
                resultado += parteDerecha[i][k] * TransxXy[k][0]; // Aquí se usa TransxXy[k][0] ya que es una matriz de 1 columna
            }
            Total[i] = resultado;
        }
        for (int i = 0; i < Total.length; i++) {
            System.out.println("B" + i +  ": " + Total[i]);
        }

    }


}


