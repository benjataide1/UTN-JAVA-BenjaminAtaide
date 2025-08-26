
package RegistroDeEstudiantes;

public class MainEstudiantes {
  public static void main(String[] args) {
    Estudiantes estudiante = new Estudiantes();

    estudiante.nombre = "Pedro";
    estudiante.apellido = "Garcia";
    estudiante.curso = "Tercero C";
    estudiante.califacion = 7.38;


    estudiante.subirCalifacion(2.72);
    estudiante.bajarCalifacion(3.45);
    estudiante.mostrarInfo();

  }
  
}
