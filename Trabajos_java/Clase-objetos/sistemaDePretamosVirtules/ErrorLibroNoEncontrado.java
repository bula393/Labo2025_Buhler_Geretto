package sistemaDePretamosVirtules;

public class ErrorLibroNoEncontrado extends RuntimeException {
    public ErrorLibroNoEncontrado() {
        super("No tenemos el libro");
    }
}
