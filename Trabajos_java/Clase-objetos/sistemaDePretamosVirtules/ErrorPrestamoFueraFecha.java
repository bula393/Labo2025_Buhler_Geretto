package sistemaDePretamosVirtules;

public class ErrorPrestamoFueraFecha extends RuntimeException {
    public ErrorPrestamoFueraFecha(Usuario usuario) {
        super("Prestamo devuelto fuera de fecha");
    }
}
