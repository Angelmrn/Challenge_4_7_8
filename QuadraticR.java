import java.util.ArrayList;
public class QuadraticR {
    public static void main(String[] args) {
        ArrayList<Datos> DatosList = Datos.Tutors();
        ArrayList<Datos> DatosSim = Datos.SIMTutors();
        QR(DatosList);
        System.out.println();
        System.out.println("----SIMULACION----");
        QR(DatosSim);
    }
    public static void imprimirMatriz(double[][] matriz) {
        for (double[] doubles : matriz) {
            for (int j = 0; j < doubles.length; j++) {
                System.out.printf("%.12f\t", doubles[j]);
            }
            System.out.println();
        }
    }
    public static void imprimirResultado(double[][] matrizTutors) {
        for (int i = 0; i < matrizTutors.length; i++) {
            System.out.printf("%.12f%n", matrizTutors[i][3]);
        }
    }

    public static void QR(ArrayList<Datos> datosList) {
        int columnas = 4;
        int filas = 3;
        double sumX = 0, sumY = 0, sumX2 = 0, sumX3 = 0, sumX4 = 0, sumX2Y = 0, sumXY = 0;
        int n = datosList.size();

        double[][] matrizTutors = new double[filas][columnas];
        double[][] matrizSim = new double[filas][columnas];
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

        matrizTutors[0][0] = sumX4;
        matrizTutors[0][1] = sumX3;
        matrizTutors[0][2] = sumX2;
        matrizTutors[1][0] = sumX3;
        matrizTutors[1][1] = sumX2;
        matrizTutors[1][2] = sumX;
        matrizTutors[2][0] = sumX2;
        matrizTutors[2][1] = sumX;
        matrizTutors[2][2] = n;
        //Valores Y
        matrizTutors[0][3] = sumX2Y;
        matrizTutors[1][3] = sumXY;
        matrizTutors[2][3] = sumY;

        //Gauss Jordan
        for (int i = 0; i<  matrizTutors.length; i++){
            double piv = matrizTutors[i][i];
            for (int j = 0; j < matrizTutors[0].length;j++){
                matrizTutors[i][j] /= piv;
            }
            for (int j = 0; j < matrizTutors.length; j++){
                double factor = matrizTutors[j][i];
                if (j != i){
                    for (int k = 0; k < matrizTutors[0].length;k++){
                        matrizTutors[j][k] -= factor * matrizTutors[i][k];
                    }
                }
            }
        }
        System.out.println("-------ECUACION-------");
        System.out.println(" a (2x) b (x) c ");
        System.out.println();
        System.out.println("-----VALORES-----");
        imprimirResultado(matrizTutors);

        }




    public static void QR2 (ArrayList<Datos>datosList){
        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumx2 = 0;
        double sumx3 = 0;
        double sumx4 = 0;
        double sumx2Y = 0;
        double n = datosList.size();

        for (int i = 0; i<datosList.size();i++){
            double x = datosList.get(i).xt;
            double y = datosList.get(i).y;
            sumX += x;
            sumY += y;
            sumx2 += x*x;
            sumXY+= x*y;
            sumx3 += x*x*x;
            sumx4 += x*x*x*x;
            sumx2Y += ((x*x)*y);
        }
        double a = (n*sumx2Y-sumx2*sumY)/(n*sumx4-sumx2*sumx2);
        double b = (n * sumXY - sumX * sumY) / (n * sumx2 - sumX * sumX);
        double c = (sumY -a *sumx2 -b *sumX)/n;

        System.out.println("-------ECUACION-------");
        System.out.println(" a (2x) b (x) c ");
        System.out.println();
        System.out.println("-----Ecuacion Con valores sustituidos-----");
        System.out.println( a + " (2x) " + b + " (x) " + c);
        System.out.println();
        //VALOR A SIMULAR
        double val = 4;
        System.out.println("-----La ecuacion con el valor " + val + " es-----");
        System.out.println(a * (val*val) + b * val + c);
    }
}
