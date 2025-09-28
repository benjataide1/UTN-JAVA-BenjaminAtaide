package BibliotecasYLibros_2;

import java.util.*;

public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();

    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    public void listarLibros() {
        libros.forEach(libro -> {
            System.out.println(libro);
        });
    }

    public void buscarLibroPorIsbn(String isbn) {

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(isbn)) {
                System.out.println(libros.get(i));
            }
        }
    }

    public void eliminarLibro(String isbn) {
        libros.removeIf(libro -> libro.getIsbn().equals(isbn));
        listarLibros();
    }

    public void obtenerCantidadLibross() {
        System.out.println("La cantidad de libros es: " + libros.size());
    }

    public void filtarLibrosPorAnio(int anio) {
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                System.out.println(libro);
            }
        }
    }

    public void mostrarAutoresDisponibles() {
        Set<Autor> autores = new HashSet<>();
        for (Libro libroAutor : libros) {
            autores.add(libroAutor.getAutor());
        }

        autores.forEach(autor -> {
            System.out.println(autor);
        });

    }

}
