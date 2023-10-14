import java.util.ArrayList;

public class SimulacionMultiple {
    public static void main(String[] args) {
        ArrayList<Datos> DatosList = Datos.StartUp();
        MLR(DatosList);
    }

    public static void imprimirMatriz(double[][] matriz) {
        for (double[] doubles : matriz) {
            for (int j = 0; j < doubles.length; j++) {
                System.out.printf("%.12f\t", doubles[j]);
            }
            System.out.println();
        }
    }
    public static void MLR(ArrayList<Datos> datosList) {
        int filas = datosList.size();
        int columnas = 4;


        double[][] matrizY = new double[filas][1];

        double[][] matriz = new double[filas][columnas];
        for (int i = 0; i < filas; i++) {
            matriz[i][0] = datosList.get(i).getInx();
            matriz[i][1] = datosList.get(i).getX1();
            matriz[i][2] = datosList.get(i).getX2();
            matriz[i][3] = datosList.get(i).getX3();
        }

        for (int i =0;i<filas;i++){
            matrizY[i][0] = datosList.get(i).getY();
        }
        //CALCULAR TRANSPUESTA
        double[][] Transpuesta = new double[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                Transpuesta[j][i] = matriz[i][j];
            }
        }
        //CALCULAR MATRIS X TRANSPUESTA
        double[][] matrisXtrans = new double[columnas][filas];
            for (int i = 0; i<columnas;i++){
                for (int j = 0; j<columnas;j++){
                    for (int z=0;z<filas;z++){
                        matrisXtrans[i][j]+=Transpuesta[i][z]*matriz[z][j];
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
        //imprimirMatriz(parteDerecha);

        //CALCULAR TRANSPUESTA DE X * Y
        double[][] TransxXy = new double[Transpuesta.length][matrizY.length];
            for (int i = 0; i < columnas; i++) {
                for (int j = 0; j < Transpuesta[0].length; j++) {
                    double resultado = 0;
                    for (int k = 0; k < matrizY.length; k++) {
                        resultado += Transpuesta[i][k] * matrizY[k][0];
                    }
                    TransxXy[i][j] = resultado;
                }
            }

        //CALULAR INVERSA * TRANSPUESTA DE Y
            double[][] InversaTransY = new double[parteDerecha.length][matrizY[0].length];
            for (int i = 0; i < parteDerecha.length; i++) {
                for (int j = 0; j < matrizY[0].length; j++) {
                    double resultado = 0;
                    for (int k = 0; k < parteDerecha[0].length; k++) { // Usar parteDerecha[0].length en lugar de matrizY[0].length
                        resultado += parteDerecha[i][k] * matrizY[k][j];
                    }
                    InversaTransY[i][j] = resultado;
                }
            }
                 imprimirMatriz(InversaTransY);

        //MOSTRAR TRANSPUESTA
        /*for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(Transpuesta[i][j] + " ");
            }
            System.out.println();
        }*/
        //MOSTRAR MULTIPLICACION MATRIZx * TRANSPUESTA
            /*for (int i =0;i<columnas;i++){
                for (int j = 0; j < columnas; j ++){
                    System.out.print(matrisXtrans[i][j] + " ");
                }
                System.out.println();
            }*/
        //MOSTRAR INVERSA
        //imprimirMatriz(matrizCompleta);

        //MOSTRAR TRANSPUESTA DE X * Y
        //imprimirMatriz(TransxXy);
    }
}
