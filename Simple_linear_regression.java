import java.util.ArrayList;

class SimpleLinearRegression {
    public static void main(String[] args) {
        ArrayList<Datos> Datoslist = Datos.Benetton();
        SLR(Datoslist);

    }
    public static void SLR(ArrayList<Datos> datosList) {
        // VARIABLES
        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumXX = 0;
        double promX = 0;
        double promY = 0;
        double m;
        double b;

        for (Datos datos:datosList) {
            double x1 = datos.getX1();
            double y = datos.getY();
            sumX += x1;
            sumY += y;
            sumXY += x1 * y;
            sumXX += x1 * x1;
            promX += x1 / datosList.size();
            promY += y / datosList.size();

        }
        int n = datosList.size();
        m = (sumXY - ((sumX * sumY) / n)) / (sumXX - ((sumX * sumX) /n));
        b = promY - (m * promX);


        //Imprimir la Ecuación de Regresión
        System.out.println("----------ECUACION----------");
        System.out.println("Y=B0+(B1X1)");
        System.out.println();
        //Ecuacion de Regresion con valores óptimos
        System.out.println("----------Ecuacion de Regresion con valores óptimos----------");
        System.out.println("La ecuacion es: Y=b+(m * X1)");
        System.out.println("");
        System.out.println("Y= " + b + " + (" + m + " * x)");
        System.out.println("Pendiente: " + m);
        System.out.println("Punto de interseccion: " + b);
        System.out.println("");
        System.out.println("------PREDICCION------");
        //Predecir valor Y dado X
        System.out.println("Prediccion de valor Y");
        System.out.println("Y=" + (b + (m * 100)));
    }
}