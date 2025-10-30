package Vehiculos;

public class Vehiculo {

    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String mostrarInfo() {
        return "Marca: " + marca + " Modelo: " + modelo;
    }
}
