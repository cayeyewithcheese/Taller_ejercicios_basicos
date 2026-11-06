public class Main{
    public static double calcularPromedio( double n1, double n2, double n3, double n4, double n5){
        double notaFinal = (n1 * 0.15) + (n2 * 0.20) + (n3 * 0.15) + (n4 * 0.30) + (n5 * 0.20);
        return notaFinal;
    }



    public static void main(String[] args) {
        MisAlgoritmos misAlgoritmos = new MisAlgoritmos();



        misAlgoritmos.punto21();
    }

}

