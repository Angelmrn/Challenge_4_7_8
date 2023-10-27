import java.util.ArrayList;

class SimpleLinearRegression {
    public static Modelos SLR(ArrayList<Datos> datosList) {
        // VARIABLES
        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumXX = 0;
        double promX = 0;
        double promY = 0;
        double m;
        double b;

        for (Datos datos : datosList) {
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
        m = (sumXY - ((sumX * sumY) / n)) / (sumXX - ((sumX * sumX) / n));
        b = promY - (m * promX);

        return new Modelos(b, m);
    }
}