package RegistroDeEstudiantes;

public class Estudiantes {
  public String nombre;
  public String apellido;
  public String curso;
  public double califacion;

  public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Curso: " + curso);
    System.out.println("Califacion: " + califacion);
  }

  public void subirCalifacion(double puntos) {
    this.califacion += puntos;
    System.out.println("Su califiacion subio a: " + puntos + " puntos, Ahora es: " + this.califacion + " puntos");
  }

  public void bajarCalifacion(double puntos) {
    this.califacion -= puntos;
    System.out.println("Su califiacion bajo a: " + puntos + " puntos, Ahora es: " + this.califacion + " puntos");

  }

}
