package ejercicio_4;

public class TarjetaDeCredito {

    private String numero;
    private String fechaVencimiento;
    private Banco banco;
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        this.cliente = cliente;
    }

}
