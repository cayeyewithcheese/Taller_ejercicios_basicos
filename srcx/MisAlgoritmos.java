import java.util.Scanner;
public class MisAlgoritmos {
    void punto1() {
        String texto1 = "Hola ";
        String texto2 = "Mundo";
        String Resultado = texto1 + "" + texto2;
        System.out.println(Resultado);
    }

    void punto2() {
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

    void punto3() {
        int numero = 4;
        int cuadrado = numero * numero;

        System.out.println("El cuadrado de :" + numero + " es : " + cuadrado);
    }

    void punto4() {
        int numero1 = 4;
        int numero2 = 5;
        int suma = numero1 + numero2;

        System.out.println("La suma es: " + suma);
    }

    void punto5() {
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

    void punto6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero decimal:");
        double numero = sc.nextDouble();
        int parteEntera = (int) numero;
        double parteDecimal = numero - parteEntera;
        System.out.println("parte entera:" + parteEntera);
        System.out.println("parte decimal:" + parteDecimal);
        sc.close();
    }

    public static double calcularPromedio(double n1, double n2, double n3, double n4, double n5) {
        double resultado = (n1 * 0.15) + (n2 * 0.20) + (n3 * 0.15) + (n4 * 0.30) + (n5 * 0.20);
        return resultado;
    }

    void punto7() {

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

    public static double calcularIVA(double precioBruto) {
        double iva = precioBruto * 0.19;
        double precioConIVA = precioBruto + iva;
        return precioConIVA;
    }

    void punto8() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el precio bruto:");
        double precioBruto = teclado.nextDouble();
        double precioConIVA = calcularIVA(precioBruto);
        double valorIVA = precioBruto * 0.19;
        System.out.println("Precio bruto:" + precioBruto);
        System.out.println("valor de iva:" + valorIVA);
        System.out.println("precio con iva: " + precioConIVA);

    }

    private static final double radius = 4.7;

    void punto9() {
        double perimetro = 2 * Math.PI * radius;

        double area = Math.PI * radius * radius;

        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El area del circulo es:  " + area);

    }

    public static double calcularAreaHexagono(double lado) {
        double area = (3 * Math.sqrt(3) * lado * lado) / 2;
        return area;
    }

    void punto10() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el lado del hexagono:");
        double lado = teclado.nextDouble();
        double area = calcularAreaHexagono(lado);
        System.out.println("El area del hexagono es: " + area);
    }

    void punto11() {
        Scanner teclado = new Scanner(System.in);
        int n;
        double numero, suma = 0, promedio;
        System.out.println("Cuantos numeros va a ingresar:");
        n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Ingrese un numero:");
            numero = teclado.nextDouble();
            suma = suma + numero;
        }
        promedio = suma / n;
        System.out.println("El promedio es:" + promedio);

    }
    void punto12() {
        Scanner teclado = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;
        System.out.println("Ingrese x1:");
        x1 = teclado.nextDouble();
        System.out.println("Ingrese y1:");
        y1 = teclado.nextDouble();
        System.out.println("Ingrese x2:");
        x2 = teclado.nextDouble();
        System.out.println("Ingrese y2:");
        y2 = teclado.nextDouble();

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1,2));
        System.out.println("La distancia es:" + distancia);
    }
    void punto13(){

    }
}

