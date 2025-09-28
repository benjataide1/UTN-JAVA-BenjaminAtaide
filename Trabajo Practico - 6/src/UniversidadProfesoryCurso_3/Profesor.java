package UniversidadProfesoryCurso_3;

import java.util.*;

public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return this.id;
    }

    public List<Curso> getCurso() {
        return this.cursos;
    }

    public void agregarCurso(Curso curso) {

        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

    public void eliminarCurso(Curso curso) {
        if (cursos.contains(curso)) {
            cursos.remove(curso);
            if (curso.getProfesor() == this) {
                curso.setProfesor(null);
            }
        }

    }

    public void listarCursos() {
        cursos.forEach(curso -> {
            System.out.println(curso);
        });

    }

    public String toString() {
        return "Profesor{"
                + "id='" + this.id + '\''
                + ", nombre='" + this.nombre + '\''
                + ", especialidad='" + this.especialidad + '\''
                + '}';
    }

}
