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
        Scanner teclado = new Scanner(System.in);
        int n, num1, num2, num3, suma;
        System.out.println("Ingrese un digito:");
        n = teclado.nextInt();

        num1 = n;
        num2 = n * 11;
        num3 = n * 111;
        suma = num1 + num2 + num3;
        System.out.println("Primer numero:" + num1);
        System.out.println("Segundo numero:" + num2);
        System.out.println("Tercer numero:" + num3);
        System.out.println("La suma es:" + suma);

    }
    void punto14(){
        Scanner teclado = new Scanner(System.in);
        int segundos, horas , minutos;
        System.out.println("Ingrese la cantidad de segundos:");
        segundos = teclado.nextInt();
        horas = segundos / 3600;
        segundos = segundos % 3600;
        minutos = segundos / 60;
        segundos = segundos % 60;
        System.out.println("La hora es:" + horas + ":" + minutos + ":" + segundos);
    }

    void punto15(){
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero:");
        numero = teclado.nextInt();
        if ( numero % 2 == 0) {
            System.out.println("El numero es par:");
        } else {
            System.out.println("El numero es impar:");
        }
    }
    void punto16(){
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero:");
        numero = teclado.nextInt();
        if ( numero > 0) {
            System.out.println("El numero es positivo:");
        } else {
            System.out.println("El numero es negativo:");
        }

    }
    double calcularIvapunto17(double venta){
        double iva;
        iva = venta * 0.19;
        return iva;
    }

    void punto17(){
        Scanner teclado = new Scanner(System.in);
        double venta, descuento = 0, iva,total;
        System.out.println("Ingrese el valor de la venta:");
        venta = teclado.nextDouble();
        if ( venta > 150000) {
            descuento = venta * 0.05;
        }
        venta = venta - descuento;
        iva = calcularIvapunto17(venta);
        total = venta + iva;
        System.out.println("El descuento es :" + descuento);
        System.out.println("El iva es :" + iva);
        System.out.println("El total a pagar es :" + total);
    }

    void punto18(){
        Scanner teclado = new Scanner(System.in);
        double n1, n2, n3, n4, n5, notaFinal;

        System.out.println("Ingrese su primera nota: ");
        n1 = teclado.nextDouble();
        System.out.println("Ingrese su segunda nota: ");
        n2 = teclado.nextDouble();
        System.out.println("Ingrese su tercera nota: ");
        n3 = teclado.nextDouble();
        System.out.println("Ingrese su cuarta nota: ");
        n4 = teclado.nextDouble();
        System.out.println("Ingrese su quinta nota: ");
        n5 = teclado.nextDouble();
        notaFinal = calcularPromedio(n1, n2, n3, n4, n5);
        System.out.println("La nota final es" + notaFinal);
        if (notaFinal < 2.0) {
            System.out.println("No puede habilitar:");
        } else if (notaFinal < 3.0) {
            System.out.println("Reprobo");
        } else {
            System.out.println("Aprobo");
            if (notaFinal > 4.5){
                System.out.println("Felicitaciones wow");
            }
        }

    }
    void punto19(){
        Scanner teclado = new Scanner(System.in);
        double a, b, c, discriminante, x1, x2;
        System.out.println("Ingrese el valor de a : ");
        a = teclado.nextDouble();
        System.out.println("Ingrese el valor de b : ");
        b = teclado.nextDouble();
        System.out.println("Ingrese el valor de c : ");
        c = teclado.nextDouble();

        if (a == 0) {
            System.out.println("No es una ecuacion cuadratica: ");
        } else {
            discriminante = b * b - 4 * a * c;
            if (discriminante >= 0) {
                x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Primera solucion : " + x1);
                System.out.println("Segunda solucion : " + x2);
            } else {
                System.out.println("No tiene soluciones reales ");
            }
        }

    }
    void punto20(){
        Scanner teclado = new Scanner(System.in);
        String usuario, contrasena;
        System.out.println("Ingrese su usuario : ");
        usuario = teclado.nextLine();
        System.out.println("Ingrese su contrasena : ");
        contrasena = teclado.nextLine();
        if (usuario.equals("carlos") && contrasena.equals("1234")) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Usuario o contrasena incorrectos");
        }
    }
    void punto21(){
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero de 0 y 10: ");
        numero = teclado.nextInt();
        switch (numero){
            case 0:
                System.out.println("Cero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6: System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;
            default:
                System.out.println("Numero fuera de rango");
                break;
        }
    }
    void punto22(){
        Scanner teclado = new Scanner(System.in);

        int numero, contador = 0;

        System.out.println("Ingrese un numero menor que 100000:");
        numero = teclado.nextInt();

        if (numero < 0 || numero >= 100000) {
            System.out.println("Numero fuera de rango");
        } else {
            if (numero == 0) {
                contador = 1;
            } else {
                while (numero > 0) {
                    numero = numero / 10;
                    contador++;
                }
            }

            System.out.println("El numero tiene " + contador + " digitos");
        }
    }

    void punto23(){
        Scanner teclado = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Ingrese el primer numero:");
        n1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero:");
        n2 = teclado.nextInt();

        System.out.println("Ingrese el tercer numero:");
        n3 = teclado.nextInt();

        if (n1 < n2 && n2 < n3) {
            System.out.println("Esta incrementando");
        } else if (n1 > n2 && n2 > n3) {
            System.out.println("Esta disminuyendo");
        } else {
            System.out.println("Ni se incrementa ni se disminuye");
        }
    }
    void punto24(){
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese un numero entre 1 y 7:");
        numero = teclado.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero fuera de rango");
                break;
        }
    }
    String invertirTexto(String texto) {
        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido = invertido + texto.charAt(i);
        }

        return invertido;
    }
    void punto25(){
        Scanner teclado = new Scanner(System.in);

        String texto, resultado;

        System.out.println("Ingrese un texto:");
        texto = teclado.nextLine();

        resultado = invertirTexto(texto);

        System.out.println("Texto invertido: " + resultado);
    }

    void punto26(){
        Scanner teclado = new Scanner(System.in);

        String texto, resultado = "";

        System.out.println("Ingrese un texto:");
        texto = teclado.nextLine();

        boolean mayuscula = true;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra != ' ') {
                if (mayuscula) {
                    resultado = resultado + Character.toUpperCase(letra);
                    mayuscula = false;
                } else {
                    resultado = resultado + letra;
                }
            } else {
                resultado = resultado + letra;
                mayuscula = true;
            }
        }

        System.out.println("Texto con mayusculas: " + resultado);

    }
    void punto27(){
        Scanner teclado = new Scanner(System.in);

        String texto, palabras[];

        System.out.println("Ingrese un texto:");
        texto = teclado.nextLine();

        palabras = texto.trim().split("\\s+");

        if (palabras.length < 2) {
            System.out.println("Debe ingresar al menos dos palabras");
        } else {
            System.out.println("La penultima palabra es: "
                    + palabras[palabras.length - 2]);
        }

    }
    void punto28(){
        Scanner teclado = new Scanner(System.in);

        String texto1, texto2;

        System.out.println("Ingrese el primer texto:");
        texto1 = teclado.nextLine();

        System.out.println("Ingrese el segundo texto:");
        texto2 = teclado.nextLine();

        if (texto2.contains(texto1)) {
            System.out.println("El segundo texto contiene el primero");
        } else {
            System.out.println("El segundo texto no contiene el primero");
        }
    }
    boolean esPalindromo(String palabra) {
        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida = invertida + palabra.charAt(i);
        }

        return palabra.equalsIgnoreCase(invertida);
    }
    void punto29(){
        Scanner teclado = new Scanner(System.in);

        String palabra;

        System.out.println("Ingrese una palabra:");
        palabra = teclado.nextLine();

        if (esPalindromo(palabra)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }

    }
    double calcularArea(double perimetro, double apotema) {
        double area;

        area = (perimetro * apotema) / 2;

        return area;
    }
    void punto30(){
        Scanner teclado = new Scanner(System.in);

        double perimetro, apotema, area;

        System.out.println("Ingrese el perimetro del poligono:");
        perimetro = teclado.nextDouble();

        System.out.println("Ingrese la apotema del poligono:");
        apotema = teclado.nextDouble();

        area = calcularArea(perimetro, apotema);

        System.out.println("El area del poligono es: " + area);

    }
    void punto31(){
        
    }
}

