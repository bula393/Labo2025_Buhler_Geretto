package sistemaMasterchef;

import sistemaCalorias.Ingrediente;

import java.util.HashMap;

public class Plato {
    private HashMap<Ingrediente,Integer> ingredientesNecesario;
    private int tiempoDeCoccion;

    public Plato(HashMap<Ingrediente, Integer> ingredientesNecesario, int tiempoDeCoccion) {
        this.ingredientesNecesario = ingredientesNecesario;
        this.tiempoDeCoccion = tiempoDeCoccion;
    }

    public HashMap<Ingrediente, Integer> getIngredientesNecesario() {
        return ingredientesNecesario;
    }

    public void setIngredientesNecesario(HashMap<Ingrediente, Integer> ingredientesNecesario) {
        this.ingredientesNecesario = ingredientesNecesario;
    }

    public int getTiempoDeCoccion() {
        return tiempoDeCoccion;
    }

    public void setTiempoDeCoccion(int tiempoDeCoccion) {
        this.tiempoDeCoccion = tiempoDeCoccion;
    }
}
