
package RegistroDeMascotas;


public class Mascotas {

  public String nombre;
  public String especie;
  public int edad;


  public void mostrarInfo(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Especie: " + especie);
    System.out.println("Edad: " + edad);
  }

  public void cumplirAnios(){
    System.out.println("Estamos en el año 2025!,\n Su mascota tiene: " + edad + " años, Nacio en: " + (2025 - edad) );
  }
}
