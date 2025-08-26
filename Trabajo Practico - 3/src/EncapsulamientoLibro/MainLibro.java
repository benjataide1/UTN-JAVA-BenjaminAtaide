package EncapsulamientoLibro;

public class MainLibro {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setTitulo("The Lord of the Rings");
        libro1.setAutor("Stephen King");
        libro1.setAnioPublicacion(1998);

        libro1.mostrarInfo();

        libro1.setAnioPublicacion(2001);

        libro1.mostrarInfo();

    }

}
