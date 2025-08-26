package SimulacionNaveEspacial;

public class NaveEspacial {

    public String nombre;
    public double combustible;

    public void despegar() {
        System.out.println("La nave Esta por Despegar");
    }

    public void avanzar(int distancia) {
        double combustibleNecesario = distancia * 2; // 1KM = 2 litros de combustible
        System.out.println("La nave Esta Avanzando\n 1KM = 2 litros de combustible");

        if (this.combustible < combustibleNecesario) {
            System.out.println("No puede avanzar porque tiene: " + this.combustible + " litros de combustible, Para avanzar: "
                    + distancia + " KM, se necesita: " + combustibleNecesario + " litros de combustible");

        } else {
            System.out
                    .println("Se Puede avanzar porque tiene: " + this.combustible + " litros de combustible, Para avanzar: "
                            + distancia + " KM, se necesita: " + combustibleNecesario + " litros de combustible");
            this.combustible -= combustibleNecesario;
        }

    }

    public void recargarCombustible(int cantidad) {
        final int LIMITE_COMBUSTIBLE = 100;

        System.out.println("LIMITE " + LIMITE_COMBUSTIBLE + " LITROS DE COMBUSTIBLE");
        System.out.println("Usted tiene: " + this.combustible + " litros de combustible");

        if (this.combustible >= LIMITE_COMBUSTIBLE) {
            System.out.println("No puede cargar más, tiene el tanque lleno");
        } else {
            double combustibleDisponible = LIMITE_COMBUSTIBLE - this.combustible;
            double cantidadACargar = Math.min(cantidad, combustibleDisponible);

            this.combustible += cantidadACargar;

            if (cantidadACargar < cantidad) {
                System.out.println("Solo se pudieron cargar " + cantidadACargar + " litros de los " + cantidad + " solicitados");
            } else {
                System.out.println("Se cargaron " + cantidadACargar + " litros de combustible");
            }

            System.out.println("Con su nueva carga, ahora tiene: " + this.combustible + " litros de combustible");
        }

    }

    public void mostrarEstado() {
        System.out.println("La nave de Nombre: " + this.nombre + " tiene: " + this.combustible + ", Litros de combustible");
    }

}
