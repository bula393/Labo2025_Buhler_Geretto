package sistemaMasterchef;

public class ErrorNoPuedeUsarUnIngrediente extends RuntimeException {
    public ErrorNoPuedeUsarUnIngrediente() {
        super("alguno de los ingredientes en el plato no lo puede usar el participante");
    }
}
