package ejercicio_4;

public class Cliente {

    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjetaDeCredito;

    public Cliente(String nombre, String dni, TarjetaDeCredito tarjetaDeCredito) {
        this.nombre = nombre;
        this.dni = dni;
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

}
