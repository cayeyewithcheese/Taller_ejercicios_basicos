import java.util.Scanner;
public class Main{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal:");
        double numero = sc.nextDouble();
        int parteEntera = (int) numero;
        double parteDecimal = numero - parteEntera;
        System.out.println("parte entera:" + parteEntera);
        System.out.println("parte decimal:" + parteDecimal);
        sc.close();


    }
}

