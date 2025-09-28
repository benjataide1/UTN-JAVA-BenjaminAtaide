package UniversidadProfesoryCurso_3;

public class MainUniversidad {

    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN");

        Profesor prof1 = new Profesor("P1", "Ana López", "Matemática");
        Profesor prof2 = new Profesor("P2", "Carlos Gómez", "Programación");
        Profesor prof3 = new Profesor("P3", "Laura Torres", "Historia");

        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        Curso c1 = new Curso("C1", "Álgebra", prof1);
        Curso c2 = new Curso("C2", "POO", prof1);
        Curso c3 = new Curso("C3", "Bases de Datos", prof2);
        Curso c4 = new Curso("C4", "Historia Moderna", prof3);
        Curso c5 = new Curso("C5", "Estructuras de Datos", prof3);

        prof1.agregarCurso(c1);
        prof1.agregarCurso(c2);
        prof2.agregarCurso(c3);
        prof3.agregarCurso(c4);
        prof3.agregarCurso(c5);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        System.out.println("-".repeat(30));

        System.out.println("Asignando Profesor a un curso");
        uni.asignarProfesorACurso("C4", "P2");
        uni.listarCursos();

        System.out.println("-".repeat(30));

        System.out.println("Listando Profesores");
        uni.listarProfesores();

        System.out.println("-".repeat(30));

        System.out.println("Listando Cursos");
        uni.listarCursos();

        System.out.println("-".repeat(30));

        System.out.println("Remover un Curso");
        uni.eliminarCurso("C4");
        uni.listarCursos();

        System.out.println("-".repeat(30));

        System.out.println("Eliminar un Profesor");
        uni.eliminarProfesor("P3");
        uni.listarProfesores();
        uni.listarCursos();

        System.out.println("-".repeat(30));

        System.out.println("Mostrar reprote cantidad de cursos por profesor");
        for (Profesor profesor : uni.getProfesores()) {
            System.out.println(profesor + ",Tiene: " + profesor.getCurso().size());
        }

    }
}
