package sistemaDeBebidas;

public class ErrorDniExistente extends RuntimeException {
    public ErrorDniExistente(String message) {
        super(message);
    }
}
