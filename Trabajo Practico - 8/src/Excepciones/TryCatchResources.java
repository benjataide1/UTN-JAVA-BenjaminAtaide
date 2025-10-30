package Excepciones;

import java.io.*;

public class TryCatchResources {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            System.out.println("Leyendo archivo");
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error no se encontro el archivo");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            e.getCause();
        }
    }

}
