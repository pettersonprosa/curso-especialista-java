package src.com.github.ej.banco;

public class ContaException extends RuntimeException {

    public ContaException(String message) {
        super(message);
    }

    public ContaException(String message, Throwable cause) {
        super(message, cause);
    }
}
