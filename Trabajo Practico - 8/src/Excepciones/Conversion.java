package Excepciones;

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {

        try {
            System.out.println("Ingrese su mensaje: ");
            String mensage = new Scanner(System.in).nextLine();

            int mensage1 = Integer.parseInt(mensage);
            System.out.println(mensage1);

        } catch (NumberFormatException e) {
            System.out.println("No se puede cambiar de Texto a Numero");
            System.out.println(e.getMessage());
        }
    }
}
