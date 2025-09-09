package ejercicio_2;

import ejercicio_2.Bateria;

public class Celular {

    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;

    }

    public Bateria getBateria() {
        return bateria;
    }
}
