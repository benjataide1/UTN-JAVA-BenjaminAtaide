package BibliotecasYLibros_2;

public class Autor {

    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Autor{"
                + "id='" + this.id + '\''
                + ", nombre='" + this.nombre + '\''
                + ", nacionalidad='" + this.nacionalidad + '\''
                + '}';
    }
}
