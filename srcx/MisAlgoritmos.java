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
    void punto(){
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
}
