package Empleados;

public class EmpleadoTemporal extends Empleado {

    private double sueldoTemporal;
    private String tipoContrato;

    public EmpleadoTemporal(double sueldoTemporal, String tipoContrato) {
        this.sueldoTemporal = sueldoTemporal;
        this.tipoContrato = tipoContrato;
    }

    @Override
    public String calcularSueldo() {
        return "Sueldo: " + this.sueldoTemporal + " Tipo de contrato: " + this.tipoContrato;
    }

}
