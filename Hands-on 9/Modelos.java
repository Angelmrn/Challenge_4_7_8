import java.util.ArrayList;

public class Modelos {
    public static void main(String[] args) {
        int metodo = 4;
        if (metodo==1){
            //Regresion Simple
            ArrayList<Datos> datosList = Datos.Benetton();
            modelos.add(SimpleLinearRegression.SLR(datosList));
            ImprimirSimple(modelos.get(0)); // Imprimir el primer modelo
        }else if (metodo==2){
            //Regresion Multiple
            ArrayList<Datos> DatosList = Datos.StartUp();
            ArrayList<Datos> DatosSim = Datos.SIM50();
            modelos.add(SimulacionMultiple.MLR(DatosList));
            ImprimirMultiple(modelos.get(0));
        }else if (metodo==3){
            //Regresion Quadratica
            ArrayList<Datos> DatosList = Datos.Tutors();
            ArrayList<Datos> DatosSim = Datos.SIMTutors();
            modelos.add(QuadraticR.QR(DatosList));
            ImprimirQuadratic(modelos.get(0));
        }else if (metodo==4){
            //Regresion Polinomial
            ArrayList<Datos> DatosList = Datos.Machine();
            ArrayList<Datos> DatosSIM = Datos.MachineSIM();
            modelos.add(PolynomialR.PR(DatosList));
            ImprimirPolynomialR(modelos.get(0));
        }
    }
    double B0, B1,B2;

    public static ArrayList<Modelos> modelos = new ArrayList<>();

    public Modelos(double B0, double B1) {
        this.B0 = B0;
        this.B1 = B1;
    }
    public Modelos(double B0, double B1, double B2) {
        this.B0 = B0;
        this.B1 = B1;
        this.B2 = B2;
    }

    public static void ImprimirSimple(Modelos modelo) {
        // Imprimir la Ecuación de Regresión
        System.out.println("----------ECUACION----------");
        System.out.println("Y = B0 + (B1 * X1)");
        System.out.println();
        // Ecuación de Regresión con valores óptimos
        System.out.println("----------Ecuacion de Regresion con valores óptimos----------");
        System.out.println("La ecuacion es: Y = B0 + (B1 * X1)");
        System.out.println("");
        System.out.println("Y = " + modelo.B0 + " + (" + modelo.B1 + " * x)");
        System.out.println("B1 : " + modelo.B1);
        System.out.println("B0 : " + modelo.B0);
        System.out.println("");
        System.out.println("------SIMULACION------");
        // Predecir valor Y dado X
        System.out.println("Predicción de valor Y para X = 100: " + (modelo.B0 + (modelo.B1 * 100)));
    }
    public static void ImprimirMultiple(Modelos modelo){

        // Imprimir la Ecuación de Regresión
        System.out.println("----------ECUACION----------");
        System.out.println("Y = B0 + (B1 * X1)");
        System.out.println();
        // Ecuación de Regresión con valores óptimos
        System.out.println("----------Ecuacion de Regresion con valores óptimos----------");
        System.out.println("La ecuacion es: Y = (B0 + B1 * X1 + B2 * X2)");
        System.out.println("");
        System.out.println("Y = " + modelo.B0 + " + " + modelo.B1 + " * X1 " + modelo.B2 + " * X2");
        System.out.println("B2 : " + modelo.B2);
        System.out.println("B1 : " + modelo.B1);
        System.out.println("B0 : " + modelo.B0);
        System.out.println("");
        System.out.println("------SIMULACION------");
        // Predecir valor Y dado X
        System.out.println("Predicción de valor Y para X1 = 100, X2 = 50: " + (modelo.B0 + (modelo.B1 * 100) + (modelo.B2 * 50)));

    }
    public static void ImprimirQuadratic(Modelos modelos){
        System.out.println("-------ECUACION-------");
        System.out.println("Y = B0 + (B1 * X1) + (B2 * X1^2)");
        System.out.println();
        System.out.println("-----Ecuacion Con valores sustituidos-----");
        System.out.println("Y = " + modelos.B0 + " (+) " + modelos.B1 + " * (X1) + " + modelos.B2 + " * x^2");
        System.out.println();
        //VALOR A SIMULAR
        double val = 4;
        System.out.println("-----La ecuacion con el valor " + val + " es-----");
        System.out.println(modelos.B0 * (val*val) + modelos.B1 * val + modelos.B2);
    }
    public static void  ImprimirPolynomialR(Modelos modelos){
        System.out.println("-------ECUACION-------");
        System.out.println("Y = B0 + (B1 * X1) + (B2 * X1^2)");
        System.out.println();
        System.out.println("-----Ecuacion Con valores sustituidos-----");
        System.out.println("Y = " + modelos.B0 + " (+) " + modelos.B1 + " * (X1) + " + modelos.B2 + " * x^2");
        System.out.println();
        //VALOR A SIMULAR
        double val = 4;
        System.out.println("-----La ecuacion con el valor " + val + " es-----");
        System.out.println(modelos.B0 * (val*val) + modelos.B1 * val + modelos.B2);
    }
}
