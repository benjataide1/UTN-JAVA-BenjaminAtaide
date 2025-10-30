package Animales;

import java.util.ArrayList;

public class TestAnimal {

    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Ciru", "Callejero"));
        animales.add(new Gato("Michi"));
        animales.add(new Perro("Sebastian", "Bulldog"));
        animales.add(new Gato("Sofia"));

        animales.forEach(animal -> {
            System.out.println(animal.getClass().getSimpleName() + " Hace: ");
            animal.hacerSonido();
        });

    }

}
