package BibliotecasYLibros_2;

public class MainBiblioteca {

    public static void main(String[] args) {
        Autor a1 = new Autor("A1", "Gabriel García Márquez", "Colombiano");
        Autor a2 = new Autor("A2", "Julio Cortázar", "Argentino");
        Autor a3 = new Autor("A3", "Jane Austen", "Británica");

        Libro l1 = new Libro("L1", "Cien años de soledad", 1967, a1);
        Libro l2 = new Libro("L2", "Rayuela", 1963, a2);
        Libro l3 = new Libro("L3", "Orgullo y prejuicio", 1813, a3);
        Libro l4 = new Libro("L4", "El amor en los tiempos del cólera", 1985, a1);
        Libro l5 = new Libro("L5", "Bestiario", 1951, a3);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional");

        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);
        biblioteca.agregarLibro(l3);
        biblioteca.agregarLibro(l4);
        biblioteca.agregarLibro(l5);

        System.out.println("Listando Libros");
        biblioteca.listarLibros();

        System.out.println("-".repeat(30));

        System.out.println("Mostrar Libro por Isbn");
        biblioteca.buscarLibroPorIsbn("L2");

        System.out.println("-".repeat(30));
        System.out.println("Libro por anio Especifico");
        biblioteca.filtarLibrosPorAnio(1967);

        System.out.println("-".repeat(30));

        System.out.println("Eliminar Libro por Isbn");
        biblioteca.eliminarLibro("L3");

        System.out.println("-".repeat(30));

        biblioteca.obtenerCantidadLibross();

        System.out.println("-".repeat(30));

        biblioteca.mostrarAutoresDisponibles();
    }

}
