package BibliotecasYLibros_2;

public class Libro {

    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public Autor getAutor() {
        return this.autor;
    }

    @Override
    public String toString() {
        return "Libro{"
                + "isbn='" + this.isbn + '\''
                + ", titulo='" + this.titulo + '\''
                + ", anioPublicacion=" + this.anioPublicacion
                + ", autor=" + this.autor
                + '}';
    }

}
