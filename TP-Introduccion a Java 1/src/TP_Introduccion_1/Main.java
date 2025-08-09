package TP_Introduccion_1;

import java.util.*;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Ejercicio 3
        String nombre = "Juan";
        int edad = 25;
        double altura = 1.75;
        boolean estudiante = true;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Estudiante: " + estudiante);

        // Ejercicio 4
        programaBasico();

        // Ejercicio 5
        operaciones();

        // Ejercicio 6
        caracterEspecial();

        // Ejercicio 7
        int x = 10; // Línea 1
        x = x + 5; // Línea 2
        System.out.println(x); // Línea 3

        /*
     una expresión es cualquier parte de código que se evalúa para obtener un
     valor (por ejemplo, x + 5). Una instrucción es una orden completa que el
     programa ejecuta y puede contener una o varias expresiones.
         */
        
        
        // Ejercicio 8
        tipoDivision();
        

        // Ejercicio 9
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre1 = scanner.nextLine(); // ERROR

        /*  
     Estamos declarando una variable de tipo String y el scanner espera que
     ingresemos un resultado de tipo int(Entero), para solucionar este problema
     podemos cambiar el "nextInt()" por un "nextLine" 
         */
        
        System.out.println("Hola, " + nombre1);

    }

    public static void programaBasico() {

        System.out.println("Ingresa tu Nombre: ");
        String nombre = input.nextLine();

        System.out.println("Ingresa tu Edad: ");
        int edad = input.nextInt();

        System.out.println("El nombre es: " + nombre + ", Tu edad es: " + edad);

    }

    public static void operaciones() {

        System.out.println("Ingrese el primer numero: ");
        int numero1 = input.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int numero2 = input.nextInt();

        System.out.println("La suma de los numeros es: " + (numero1 + numero2));
        System.out.println("La resta de los numeros es: " + (numero1 - numero2));
        System.out.println("La multiplicacion de los numeros es: " + (numero1 * numero2));
        System.out.println("La division de los numeros es: " + (numero1 / numero2));

    }

    public static void caracterEspecial() {

        String nombre = "Juan Perez";
        int edad = 30;
        String direccion = "Calle Falsa 123";

        System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nDireccion: \"" + direccion + "\"");

    }

    public static void tipoDivision() {
        System.out.println("Ingrese el primer numero:");
        int numero1 = input.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int numero2 = input.nextInt();

        System.out.println("Usando double en lugar de int:");

        System.out.println("Ingrese el primer numero (double):");
        double numero1Double = input.nextDouble();

        System.out.println("Ingrese el segundo numero (double):");
        double numero2Double = input.nextDouble();

        double resultadoDivisionDouble = numero1Double / numero2Double;
        System.out.println("Resultado de la division (double): " + resultadoDivisionDouble);

        System.out.println("Comparando con int:");
        System.out.println("Resultado de la division (int): " + (numero1 / numero2));

    }

}
