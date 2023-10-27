import java.util.ArrayList;
public class Datos {
    int inx;
    double xt;
    double x1;
    double x2;
    double x3;
    double y;

    public Datos(int inx, double x1, double x2, double x3, double y) {
        this.inx = inx;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y = y;

    }

    public static ArrayList<Datos> DatBen = new ArrayList<>();

    public static ArrayList<Datos> Benetton() {

        DatBen.add(new Datos(1, 23.0, 0, 0.0, 651.0));
        DatBen.add(new Datos(1, 26.0, 0, 0, 762.0));
        DatBen.add(new Datos(1, 30.0, 0, 0.0, 856.0));
        DatBen.add(new Datos(1, 34.0, 0, 0, 1063.0));
        DatBen.add(new Datos(1, 43.0, 0, 0.0, 1190.0));
        DatBen.add(new Datos(1, 48.0, 0, 0, 1298.0));
        DatBen.add(new Datos(1, 52.0, 0, 0.0, 1421.0));
        DatBen.add(new Datos(1, 57.0, 0, 0, 1440.0));
        DatBen.add(new Datos(1, 58.0, 0, 0, 1518.0));
        return DatBen;
    }

    //VALORES 50 STARTUPS
    public static ArrayList<Datos> DatStar = new ArrayList<>();
    public static ArrayList<Datos> StartUp() {

        DatStar.add(new Datos(1,165349.2, 136897.8, 471784.1, 192261.83));
        DatStar.add(new Datos(1,162597.7, 151377.59, 443898.53, 191792.06));
        DatStar.add(new Datos(1,153441.51, 101145.55, 407934.54, 191050.39));
        DatStar.add(new Datos(1,144372.41, 118671.85, 383199.62, 182901.99));
        DatStar.add(new Datos(1,142107.34, 91391.77, 366168.42, 166187.94));
        DatStar.add(new Datos(1,131876.9, 99814.71, 362861.36, 156991.12));
        DatStar.add(new Datos(1,134615.46, 147198.87, 127716.82, 156122.51));
        DatStar.add(new Datos(1,130298.13, 145530.06, 323876.68, 155752.6));
        DatStar.add(new Datos(1,120542.52, 148718.95, 311613.29, 152211.77));
        DatStar.add(new Datos(1,123334.88, 108679.17, 304981.62, 149759.96));
        DatStar.add(new Datos(1,101913.08, 110594.11, 229160.95, 146121.95));
        DatStar.add(new Datos(1,100671.96, 91790.61, 249744.55, 144259.4));
        DatStar.add(new Datos(1,93863.75, 127320.38, 249839.44, 141585.52));
        DatStar.add(new Datos(1,91992.39, 135495.07, 252664.93, 134307.35));
        DatStar.add(new Datos(1,119943.24, 156547.42, 256512.92, 132602.65));
        DatStar.add(new Datos(1,114523.61, 122616.84, 261776.23, 129917.04));
        DatStar.add(new Datos(1,78013.11, 121597.55, 264346.06, 126992.93));
        DatStar.add(new Datos(1,94657.16, 145077.58, 282574.31, 125370.37));
        DatStar.add(new Datos(1,91749.16, 114175.79, 294919.57, 124266.9));
        DatStar.add(new Datos(1,86419.7, 153514.11, 0, 122776.86));
        DatStar.add(new Datos(1,76253.86, 113867.3, 298664.47, 118474.03));
        DatStar.add(new Datos(1,78389.47, 153773.43, 299737.29, 111313.02));
        DatStar.add(new Datos(1,73994.56, 122782.75, 303319.26, 110352.25));
        DatStar.add(new Datos(1,67532.53, 105751.03, 304768.73, 108733.99));
        DatStar.add(new Datos(1,77044.01, 99281.34, 140574.81, 108552.04));
        DatStar.add(new Datos(1,64664.71, 139553.16, 137962.62, 107404.34));
        DatStar.add(new Datos(1,75328.87, 144135.98, 134050.07, 105733.54));
        DatStar.add(new Datos(1,72107.6, 127864.55, 353183.81, 105008.31));
        DatStar.add(new Datos(1,66051.52, 182645.56, 118148.2, 103282.38));
        DatStar.add(new Datos(1,65605.48, 153032.06, 107138.38, 101004.64));
        DatStar.add(new Datos(1,61994.48, 115641.28, 91131.24, 99937.59));
        DatStar.add(new Datos(1,61136.38, 152701.92, 88218.23, 97483.56));
        DatStar.add(new Datos(1,63408.86, 129219.61, 46085.25, 97427.84));
        DatStar.add(new Datos(1,55493.95, 103057.49, 214634.81, 96778.92));
        DatStar.add(new Datos(1,46426.07, 157693.92, 210797.67, 96712.8));
        DatStar.add(new Datos(1,46014.02, 85047.44, 205517.64, 96479.51));
        DatStar.add(new Datos(1,28663.76, 127056.21, 201126.82, 90708.19));
        DatStar.add(new Datos(1,44069.95, 51283.14, 197029.42, 89949.14));
        DatStar.add(new Datos(1,20229.59, 65947.93, 185265.1, 81229.06));
        DatStar.add(new Datos(1,38558.51, 82982.09, 174999.3, 81005.76));
        DatStar.add(new Datos(1,28754.33, 118546.05, 172795.67, 78239.91));
        DatStar.add(new Datos(1,27892.92, 84710.77, 164470.71, 77798.83));
        DatStar.add(new Datos(1,23640.93, 96189.63, 148001.11, 71498.49));
        DatStar.add(new Datos(1,15505.73, 127382.3, 35534.17, 69758.98));
        DatStar.add(new Datos(1,22177.74, 154806.14, 28334.72, 65200.33));
        DatStar.add(new Datos(1,1000.23, 124153.04, 1903.93, 64926.08));
        DatStar.add(new Datos(1,1315.46, 115816.21, 297114.46, 49490.75));
        DatStar.add(new Datos(1,0, 135426.92, 0, 42559.73));
        DatStar.add(new Datos(1,542.05, 51743.15, 0, 35673.41));
        DatStar.add(new Datos(1,0, 116983.8, 45173.06, 14681.4));
        return DatStar;
    }

    //SIMULACION 50 START UP
    public static ArrayList<Datos> Simulacion50 = new ArrayList<>();
    public static ArrayList<Datos> SIM50() {

        Simulacion50.add(new Datos(1, 165349.2, 136897.8, 471784.1, 192261.83));
        Simulacion50.add(new Datos(1, 162597.7, 151377.59, 443898.53, 191792.06));
        Simulacion50.add(new Datos(1,1315.46, 115816.21, 297114.46, 49490.75));
        Simulacion50.add(new Datos(1,0, 135426.92, 0, 42559.73));

        return Simulacion50;
    }


    public Datos(double xt, double y){
        this.xt=xt;
        this.y=y;
    }
   public static ArrayList<Datos> DatTutors = new ArrayList<> ();
    public static ArrayList<Datos> Tutors(){
        DatTutors.add(new Datos(-3,7.5));
        DatTutors.add(new Datos(-2,3));
        DatTutors.add(new Datos(-1,0.5));
        DatTutors.add(new Datos(0,1));
        DatTutors.add(new Datos(1,3));
        DatTutors.add(new Datos(2,6));
        DatTutors.add(new Datos(3,14));

        return DatTutors;
    }
    //TUTORS SIMULACION
    public static ArrayList<Datos> SimulacionTutors = new ArrayList<> ();
    public static ArrayList<Datos> SIMTutors(){
        SimulacionTutors.add(new Datos(5,7.5));
        SimulacionTutors.add(new Datos(6,3));
        SimulacionTutors.add(new Datos(9,0.5));
        SimulacionTutors.add(new Datos(20,1));
        SimulacionTutors.add(new Datos(41,3));
        SimulacionTutors.add(new Datos(52,6));
        SimulacionTutors.add(new Datos(63,14));

        return SimulacionTutors;
    }

    public Datos(int inx, double x1, double x2, double y) {
        this.inx = inx;
        this.x1 = x1;
        this.x2 = x2;
        this.y = y;

    }
    public static ArrayList<Datos> DatChem = new ArrayList<>();
    public static ArrayList<Datos> Chemical(){
        DatChem.add(new Datos(1, 41.90, 29.1, 251.30));
        DatChem.add(new Datos(1, 43.40, 29.3, 251.30));
        DatChem.add(new Datos(1, 43.90, 29.5, 248.30));
        DatChem.add(new Datos(1, 44.50, 29.7, 267.50));
        DatChem.add(new Datos(1, 47.30, 29.9, 273.00));
        DatChem.add(new Datos(1, 47.50, 30.3, 276.50));
        DatChem.add(new Datos(1, 47.90, 30.5, 270.30));
        DatChem.add(new Datos(1, 50.20, 30.7, 274.90));
        DatChem.add(new Datos(1, 52.80, 30.8, 285.00));
        DatChem.add(new Datos(1, 53.20, 30.9, 290.00));
        DatChem.add(new Datos(1, 56.70, 31.5, 297.00));
        DatChem.add(new Datos(1, 57.00, 31.7, 302.50));
        DatChem.add(new Datos(1, 63.50, 31.90, 304.50));
        DatChem.add(new Datos(1, 65.30, 32.00, 309.30));
        DatChem.add(new Datos(1, 71.10, 32.10, 321.70));
        DatChem.add(new Datos(1, 77.00, 32.50, 330.70));
        DatChem.add(new Datos(1, 77.80, 32.90, 349.00));

        return DatChem;
    }
    //SIMULACION Chemical
    public static ArrayList<Datos> SimulacionChem = new ArrayList<>();
    public static ArrayList<Datos> SIMchem() {
        SimulacionChem.add(new Datos(1, 41.90, 29.1, 251.30));
        SimulacionChem.add(new Datos(1, 43.40, 29.3, 251.30));
        SimulacionChem.add(new Datos(1, 43.90, 29.5, 248.30));

        return SimulacionChem;
    }

    public static ArrayList<Datos> DatMachine = new ArrayList<>();
    public static  ArrayList<Datos> Machine(){
        DatMachine.add(new Datos(108,95));
        DatMachine.add(new Datos(115,96));
        DatMachine.add(new Datos(106,95));
        DatMachine.add(new Datos(97,97));
        DatMachine.add(new Datos(95,93));
        DatMachine.add(new Datos(91,94));
        DatMachine.add(new Datos(97,95));
        DatMachine.add(new Datos(83,93));
        DatMachine.add(new Datos(83,92));
        DatMachine.add(new Datos(78,86));
        DatMachine.add(new Datos(54,73));
        DatMachine.add(new Datos(67,80));
        DatMachine.add(new Datos(56,65));
        DatMachine.add(new Datos(53,69));
        DatMachine.add(new Datos(61,77));
        DatMachine.add(new Datos(115,96));
        DatMachine.add(new Datos(81,87));
        DatMachine.add(new Datos(78,89));
        DatMachine.add(new Datos(30,60));
        DatMachine.add(new Datos(45,63));
        DatMachine.add(new Datos(99,95));
        DatMachine.add(new Datos(32,61));
        DatMachine.add(new Datos(25,55));
        DatMachine.add(new Datos(28,56));
        DatMachine.add(new Datos(90,94));
        DatMachine.add(new Datos(89,93));

        return  DatMachine;
    }

    //Machine SIMULACION
    public static ArrayList<Datos> MachineSIMULACION = new ArrayList<>();
    public static  ArrayList<Datos> MachineSIM() {
        MachineSIMULACION.add(new Datos(108, 95));
        MachineSIMULACION.add(new Datos(115, 96));
        MachineSIMULACION.add(new Datos(106, 95));
        MachineSIMULACION.add(new Datos(97, 97));
        MachineSIMULACION.add(new Datos(95, 93));
        MachineSIMULACION.add(new Datos(91, 94));
        MachineSIMULACION.add(new Datos(97, 95));
        MachineSIMULACION.add(new Datos(83, 93));
        MachineSIMULACION.add(new Datos(83, 92));
        MachineSIMULACION.add(new Datos(83,93));
        MachineSIMULACION.add(new Datos(83,92));
        MachineSIMULACION.add(new Datos(78,86));
        MachineSIMULACION.add(new Datos(54,73));
        MachineSIMULACION.add(new Datos(67,80));
        MachineSIMULACION.add(new Datos(56,65));
        MachineSIMULACION.add(new Datos(53,69));
        MachineSIMULACION.add(new Datos(61,77));
        MachineSIMULACION.add(new Datos(115,96));
        MachineSIMULACION.add(new Datos(81,87));
        MachineSIMULACION.add(new Datos(78,89));
        MachineSIMULACION.add(new Datos(30,60));
        MachineSIMULACION.add(new Datos(45,63));
        MachineSIMULACION.add(new Datos(99,95));
        MachineSIMULACION.add(new Datos(32,61));
        MachineSIMULACION.add(new Datos(25,55));
        MachineSIMULACION.add(new Datos(28,56));
        MachineSIMULACION.add(new Datos(90,94));
        MachineSIMULACION.add(new Datos(89,93));
        return MachineSIMULACION;
    }


    public int getInx() {return inx;}

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX3() {
        return x3;
    }

    public double getY() {
        return y;
    }
    public double getxt(){return  xt;}

}

