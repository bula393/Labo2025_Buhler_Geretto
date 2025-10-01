package sistemaDePretamosVirtules;

public class ErrorNoHayStock extends RuntimeException {
    public ErrorNoHayStock() {
        super("no hay stock de ese libro");
    }
}
