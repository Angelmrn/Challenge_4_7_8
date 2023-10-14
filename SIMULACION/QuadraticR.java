import java.util.ArrayList;

public class QuadraticR {
    public static void main(String[] args) {
        ArrayList<Datos> DatosList = Datos.Tutors();
        QR(DatosList);

    }
    public static void  QR(ArrayList<Datos>datosList){
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
