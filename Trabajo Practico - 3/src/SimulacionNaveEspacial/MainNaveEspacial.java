package SimulacionNaveEspacial;

public class MainNaveEspacial {

    public static void main(String[] args) {

        NaveEspacial nave = new NaveEspacial();
        nave.nombre = "Andromeda";
        nave.combustible = 50;

        nave.avanzar(200);
        nave.recargarCombustible(20);
        nave.avanzar(100);

        nave.mostrarEstado();

    }

}
