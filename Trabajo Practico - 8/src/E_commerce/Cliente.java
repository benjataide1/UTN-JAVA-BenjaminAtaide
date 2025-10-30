package E_commerce;

public class Cliente implements Notificable {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Se notifico al cliente: " + getNombre() + " con el mensaje: " + mensaje);
    }

}
