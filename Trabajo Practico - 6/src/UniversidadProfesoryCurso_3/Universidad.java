package UniversidadProfesoryCurso_3;

import java.util.*;

public class Universidad {

    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }

    public List<Profesor> getProfesores() {
        return this.profesores;
    }

    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        Curso cursoEncontrado = null;
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                cursoEncontrado = curso;
            }
        }
        return cursoEncontrado;
    }

    public Profesor buscarProfesorPorId(String id) {
        Profesor profesorEncontrado = null;
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                profesorEncontrado = profesor;
            }
        }
        return profesorEncontrado;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            curso.setProfesor(profesor);
            profesor.agregarCurso(curso);
        }
    }

    public void listarProfesores() {
        profesores.forEach(profesor -> {
            System.out.println(profesor);
        });
    }

    public void listarCursos() {
        cursos.forEach(curso -> {
            System.out.println(curso);
        });
    }

    public void eliminarCurso(String codigoCurso) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);

        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
        }
    }

    public void eliminarProfesor(String idProfesor) {
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (profesor != null) {
            profesor.getCurso().clear();
            for (Curso c : cursos) {
                if (c.getProfesor() == profesor) {
                    c.setProfesor(null);
                }
            }
            profesores.remove(profesor);
        }
    }

}
