package tp_4;

public class MainEmpleado {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jorge", "Administrador", 13.000);
        Empleado empleado2 = new Empleado("Francisco", "Contador");

        empleado1.actualizarSalrio(10.000);
        empleado2.actualizarSalrio(30);

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());

        System.out.println(Empleado.mostrarTotalEmpleados());
    }

}
