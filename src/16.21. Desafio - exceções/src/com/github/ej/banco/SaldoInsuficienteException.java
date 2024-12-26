package src.com.github.ej.banco;

public class SaldoInsuficienteException extends ContaException {

    public SaldoInsuficienteException(String message) {
        super(message);
    }

    public SaldoInsuficienteException(String message, Throwable cause) {
        super(message, cause);
    }
}
