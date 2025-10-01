package sistemaDePretamosVirtules;

public class ErrorArticuloNoPrestable extends RuntimeException {
    public ErrorArticuloNoPrestable() {
        super("No se puede dar a prestamo");
    }
}
