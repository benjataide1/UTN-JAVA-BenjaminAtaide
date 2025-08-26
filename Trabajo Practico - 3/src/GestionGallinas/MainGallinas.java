package GestionGallinas;

public class MainGallinas {

    public static void main(String[] args) {

        Gallinas gallina1 = new Gallinas();
        Gallinas gallina2 = new Gallinas();

        gallina1.idGallina = 1;
        gallina1.edad = 3;
        gallina1.huevosPuestos = 10;

        gallina1.mostrarEstado();

        gallina1.envejecer();
        gallina1.ponerHuevo(2);
        gallina1.mostrarEstado();

        System.out.println("----------------------------");

        gallina2.idGallina = 2;
        gallina2.edad = 2;
        gallina2.huevosPuestos = 5;

        gallina2.mostrarEstado();

        gallina2.envejecer();
        gallina2.ponerHuevo(1);
        gallina2.mostrarEstado();

    }

}
