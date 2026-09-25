import java.util.Scanner;
public class MisAlgoritmos {
    void punto1(){
        String texto1 = "Hola ";
        String texto2 = "Mundo";
        String Resultado = texto1 + "" + texto2;
        System.out.println(Resultado);
    }
    void punto2(){
            int num1 = 9;
            int num2 = 2;
            int suma = num1 + num2;
            int resta = num1 - num2;
            int multiplicacion = num1 * num2;
            int division = num1 / num2;
            int residuo = num1 % num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese su nombre");
        String nombre = sc.nextLine();

        System.out.println("Hola" + " " + nombre);

    }
    void punto3(){
        int numero = 4;
        int cuadrado = numero * numero;

        System.out.println("El cuadrado de :" + numero +" es : " + cuadrado);
    }
    void punto4(){
        int numero1 = 4;
        int numero2 = 5;
        int suma = numero1 + numero2;

        System.out.println("La suma es: " + suma);
    }
    void punto5(){
        int num1 = 9;
        int num2 = 2;
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;
        int residuo = num1 % num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
        System.out.println("La residuo es: " + residuo);
    }
    void punto6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal:");
        double numero = sc.nextDouble();
        int parteEntera = (int) numero;
        double parteDecimal = numero - parteEntera;
        System.out.println("parte entera:" + parteEntera);
        System.out.println("parte decimal:" + parteDecimal);
        sc.close();
    }
    public static double calcularPromedio( double n1, double n2, double n3, double n4, double n5){
        double resultado = (n1 * 0.15) + (n2 * 0.20) + (n3 * 0.15) + (n4 * 0.30) + (n5 * 0.20);
        return resultado;
    }
    void punto7(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese sus notas: ");
        System.out.println("Ingrese su primera nota: ");
        double n1 = teclado.nextDouble();
        System.out.println("Ingrese su segunda nota: ");
        double n2 = teclado.nextDouble();
        System.out.println("Ingrese su tercera nota: ");
        double n3 = teclado.nextDouble();
        System.out.println("Ingrese su cuarta nota: ");
        double n4 = teclado.nextDouble();
        System.out.println("Ingrese su quinta nota: ");
        double n5 = teclado.nextDouble();
        double notaFinal = calcularPromedio(n1, n2, n3, n4, n5);
        System.out.println("Su promedio de notas es:" + notaFinal);
    }
    public static double calcularIVA(double precioBruto){
        double iva = precioBruto * 0.19;
        double precioConIVA = precioBruto + iva;
        return precioConIVA;
    }
    void punto8(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio bruto:");
        double precioBruto = teclado.nextDouble();
        double precioConIVA = calcularIVA(precioBruto);
        double valorIVA = precioBruto * 0.19;
        System.out.println("Precio bruto:" + precioBruto);
        System.out.println("valor de iva:" + valorIVA);
        System.out.println("precio con iva: " + precioConIVA);

    }

}
