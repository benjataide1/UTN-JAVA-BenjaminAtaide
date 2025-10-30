package Animales;

public class Animal {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void hacerSonido() {
        System.out.println("Sonido Animal");
    }

    ;

  public void describirAnimal() {

        System.out.println("Soy un Animal llamado: " + this.nombre);
    }
;

}
