package Excepciones;

public class ExcepcionPersonalizada {

    public static void main(String[] args) {

        try {
            validarEdad(0);
        } catch (EdadInvalidaException e) {
            e.getCause();
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {

        if (edad <= 0 || edad > 100) {
            throw new EdadInvalidaException("La edad no es valida");
        } else {
            System.out.println("La edad es valida");
        }
    }
}
