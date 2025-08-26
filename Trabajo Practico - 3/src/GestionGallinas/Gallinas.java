package GestionGallinas;

public class Gallinas {

    public int idGallina;
    public int edad;
    public int huevosPuestos;

    public void ponerHuevo(int huevosPuestos) {
        this.huevosPuestos += huevosPuestos;
    }

    public void envejecer() {
        this.edad++;
    }

    public void mostrarEstado() {
        System.out.println("La gallina" + this.idGallina + " tiene una Edad de:" + this.edad + " años, Puso: "
                + this.huevosPuestos + " huevos.");
    }

}
