package TP_ProgramacionEstructurada_2;

import java.util.*;

public class mainTp {

    static Scanner scanner = new Scanner(System.in);
    static double descuento = 0.10;

    public static void main(String[] args) {

        // Ejercicio 1
        bisiesto();

        // Ejercicio 2
        System.out.println(mayorOmenor());

        // Ejercicio 3
        System.out.println(clasificacionEdad());

        // Ejercicio 4
        System.out.println(descuentoPrecio());

        // Ejercicio 5
        System.out.println(sumaPares());

        // Ejercicio 6
        contadorNumeros();

        // Ejercicio 7
        validacionNota();

        // Ejercicio 8
        calcularPrecioFinal();

        // Ejercicio 9
        calcularCosto();

        // Ejercicio 10
        System.out.print("Ingrese el stock actual: ");
        int stockActual = scanner.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scanner.nextInt();

        actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        // Ejercicio 11
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        calcularDescuentoEspecial(precio);

        // Ejercicio 12
        manejoArrays();

    }

    public static void bisiesto() {

        System.out.print("Ingrese un año: ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("El año es bisiesto: " + year);

        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("El año no es bisiesto: " + year);
        }

    }

    public static String mayorOmenor() {

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int[] numeros = {num1, num2, num3};

        int mayor = 0;
        for (int i : numeros) {
            if (i > mayor) {
                mayor = i;
            }
        }
        return "El número mayor es: " + mayor;

    }

    public static String clasificacionEdad() {

        System.out.print("Ingrese su edad:");
        int edad = scanner.nextInt();

        if (edad < 12) {
            return "Eres un niño";
        } else if (edad > 12 && edad < 17) {
            return "Eres un adolescente";
        } else if (edad > 18 && edad < 59) {
            return "Eres un adulto";
        } else {
            return "Eres un anciano";
        }

    }

    public static String descuentoPrecio() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la categoria (A, B, C): ");
        String categoria = scanner.next();

        if (categoria.equalsIgnoreCase("A")) {
            System.out.println("Descuento aplicado 10%");
            return "Precio Final: " + precio * 0.9;
        } else if (categoria.equalsIgnoreCase("B")) {
            System.out.println("Descuento aplicado 15%");
            return "Precio Final: " + precio * 0.85;
        } else if (categoria.equalsIgnoreCase("C")) {
            System.out.println("Descuento aplicado 20%");
            return "Precio Final: " + precio * 0.8;
        }
        return "Categoría no válida";

    }

    public static int sumaPares() {
        int suma = 0;
        while (true) {
            System.out.println("Ingrese un numero (0 para terminar)");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                suma += num;
            }
            if (num == 0) {
                break;
            }

        }

        return suma;
    }

    public static void contadorNumeros() {
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int i = 1; i <= 10; i++) {

            System.out.print("Ingrese un Numero " + i + " :");
            int num = scanner.nextInt();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else {
                ceros++;
            }

        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }

    public static void validacionNota() {

        do {
            System.out.print("Ingre una nota (0-10): ");
            int nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota invalida");
            } else {
                System.out.println("Nota valida: " + nota);
                break;
            }

        } while (true);

    }

    public static void calcularPrecioFinal() {
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuestoPorcentaje = scanner.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuentoPorcentaje = scanner.nextDouble();

        double impuestoDecimal = impuestoPorcentaje / 100.0;
        double descuentoDecimal = descuentoPorcentaje / 100.0;

        // formula
        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);

        System.out.println("El precio final del producto es: " + precioFinal);
    }

    public static void calcularCosto() {

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg:");
        double pesoPaquete = scanner.nextDouble();

        System.out.print("Ingrese la zona de envio (Nacional o Internacional): ");
        String zonaEnvio = scanner.next();

        double costoEnvio = calcularCostoEnvio(pesoPaquete, zonaEnvio);

        calcularTotalCompra(precioProducto, costoEnvio);

    }

    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0.0;
        if (zona.equalsIgnoreCase("Nacional")) {
            costoEnvio = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoEnvio = peso * 10;
        }

        return costoEnvio;

    }

    public static void calcularTotalCompra(double precio, double costoEnvio) {

        System.out.println("El costo del envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + (precio + costoEnvio));

    }

    public static void actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {

        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;

        System.out.println("El nuevo stock es: " + nuevoStock);

    }

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuento;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento aplicado es: " + descuentoAplicado);

        System.out.println("El precio final con descuento es: " + precioFinal);

    }

    public static void manejoArrays() {

        while (true) {
            System.out.print("Ingrese la cantidad de Elementos de un Array: ");
            int elementos = scanner.nextInt();

            double[] precios = new double[elementos];

            for (int i = 0; i < elementos; i++) {
                System.out.print("Ingrese el precio del Array en la posicion [" + i + "] : ");
                precios[i] = scanner.nextDouble();
            }

            System.out.println("Precios Originales");
            for (double precio : precios) {
                System.out.println("Precio: $" + precio);
            }

            System.out.print("Deseas modificar algun precio?");
            String respuesta = scanner.next();

            if (respuesta.equalsIgnoreCase("si")) {
                System.out.print("Ingrese el numero/posicion que desea cambiar: ");
                int posicion = scanner.nextInt();
                System.out.print("Ingrese el nuevo precio: ");
                double nuevoPrecio = scanner.nextDouble();
                precios[posicion] = nuevoPrecio;

                System.out.println("Precios Actualizados");
                for (double precio : precios) {
                    System.out.println("Precio: $" + precio);
                }
                break;
            } else {
                break;
            }
        }

    }
}
