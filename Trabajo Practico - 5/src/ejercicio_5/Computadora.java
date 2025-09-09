package ejercicio_5;

public class Computadora {

    private String marca;
    private String numeroSerie;
    private Propietario propietario;
    private PlacaMadre placaMadre;

    public Computadora(String marca, String numeroSerie, Propietario propietario, PlacaMadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.propietario = propietario;
        this.placaMadre = placaMadre;
    }

}
