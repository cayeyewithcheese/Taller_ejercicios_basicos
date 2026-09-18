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
}
