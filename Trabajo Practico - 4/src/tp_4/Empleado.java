package tp_4;

public class Empleado {

    private int id;
    String nombre;
    String puesto;
    double salario;
    private static int totalEmpleados = 0;

    public Empleado(String nombre, String puesto, double salario) {
        this.id = totalEmpleados++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100.00;

    }

    public void actualizarSalrio(int porcentaje) {
        this.salario += this.salario * porcentaje / 100;
    }

    public void actualizarSalrio(double monto) {
        this.salario += monto;

    }

    @Override
    public String toString() {
        return "Empleado{"
                + "id=" + id
                + ", nombre='" + nombre + '\''
                + ", puesto='" + puesto + '\''
                + ", salario=" + salario
                + '}';
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

}
