package src.com.github.ej.banco;

public class ContaInativaException extends ContaException {

    public ContaInativaException(String message) {
        super(message);
    }

    public ContaInativaException(String message, Throwable cause) {
        super(message, cause);
    }
}
