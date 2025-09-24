package sistemaMasterchef;

public class ErrorNohaytiempo extends RuntimeException {
    public ErrorNohaytiempo() {
        super("no le queda suficiente tiempo para hace la receta");
    }
}
