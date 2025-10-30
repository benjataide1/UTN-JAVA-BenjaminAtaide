package Empleados;

public class EmpleadoPlanta extends Empleado {

    private double sueldoPlanta;
    private String tipoContrato;

    public EmpleadoPlanta(double sueldoPlanta, String tipoContrato) {
        this.sueldoPlanta = sueldoPlanta;
        this.tipoContrato = tipoContrato;
    }

    @Override
    public String calcularSueldo() {
        return "Sueldo: " + this.sueldoPlanta + " Tipo de contrato: " + this.tipoContrato;
    }

}
