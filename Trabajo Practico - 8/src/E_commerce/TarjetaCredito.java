package E_commerce;

public class TarjetaCredito implements Pago, PagoConDescuento {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con tarjeta de crédito por un monto de: " + monto);
    }

    @Override
    public double aplicarDescuent(double monto) {
        System.out.println("Aplicando descuento en tarjeta de crédito");

        return monto * 0.90;
    }
}
