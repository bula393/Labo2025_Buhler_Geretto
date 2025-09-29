package sistemaMasterchef;

public class ErrorNoHayStockSuficiente extends RuntimeException {
    public ErrorNoHayStockSuficiente(String message) {
        super("no hay stock suficiente de"+message);
    }
}
