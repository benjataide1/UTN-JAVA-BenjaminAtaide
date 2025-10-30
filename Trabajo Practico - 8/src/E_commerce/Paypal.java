package E_commerce;

public class Paypal implements Pago {

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con Paypal por un monto de: " + monto);
    }

}
