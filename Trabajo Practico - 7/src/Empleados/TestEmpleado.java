package Empleados;

import java.util.ArrayList;

public class TestEmpleado {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta(1000, "Planta"));
        empleados.add(new EmpleadoTemporal(500, "Temporal"));
        empleados.add(new EmpleadoPlanta(2400, "Planta"));

        for (Empleado empleado : empleados) {

            System.out.println(empleado.calcularSueldo());
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println("Empleado Planta");
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.println("Empleado Temporal");
            }
        }
    }

}
