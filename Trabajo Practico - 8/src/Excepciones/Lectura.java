package Excepciones;

import java.io.*;
import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {

        try {
            System.out.println("Ingrese el Nombre del Archivo: ");

            String nombreArchivo = new Scanner(System.in).next();

            FileReader fr = new FileReader(nombreArchivo);

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            System.out.println(e.getMessage());

        }
    }

}
