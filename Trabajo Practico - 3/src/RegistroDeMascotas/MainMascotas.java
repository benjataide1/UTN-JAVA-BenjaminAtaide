
package RegistroDeMascotas;

public class MainMascotas {
  public static void main(String[] args) {
    Mascotas mascota = new Mascotas();

    mascota.nombre = "Firulais";
    mascota.especie = "Mezcla de Labrador";
    mascota.edad = 12;

    mascota.mostrarInfo();
    mascota.cumplirAnios();
  }
  
}
