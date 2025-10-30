package Figuras;

import java.util.ArrayList;

public class TestFigura {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Rectangulo(10, 20));
        figuras.add(new Circulo(10));

        figuras.forEach(figura -> {
            System.out.println("Area: " + figura.calcularArea());
        });
    }

}
