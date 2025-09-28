package UniversidadProfesoryCurso_3;

public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Curso{"
                + "codigo='" + this.codigo + '\''
                + ", nombre='" + this.nombre + '\''
                + ", profesor=" + (this.profesor != null ? this.profesor.toString() : "null")
                + '}';
    }

}
