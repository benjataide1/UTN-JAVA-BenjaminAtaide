/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_1;

/**
 *
 * @author benja
 */
public class Pasaporte {

    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String imagen, String formato, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }
}
