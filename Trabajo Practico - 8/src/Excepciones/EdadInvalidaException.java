package Excepciones;

public class EdadInvalidaException extends Exception {

    public EdadInvalidaException() {
        super();
    }

    public EdadInvalidaException(String message) {
        super(message);
    }

    public EdadInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }

    public EdadInvalidaException(Throwable cause) {
        super(cause);
    }
}
