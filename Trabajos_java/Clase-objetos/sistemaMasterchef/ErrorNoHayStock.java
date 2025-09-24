package sistemaMasterchef;

public class ErrorNoHayStock extends RuntimeException {
    public ErrorNoHayStock() {
        super("no le queda es stock de alguno de los ingredientes");
    }
}
