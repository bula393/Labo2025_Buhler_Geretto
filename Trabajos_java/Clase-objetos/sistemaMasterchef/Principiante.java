package sistemaMasterchef;

import sistemaCalorias.Ingrediente;

import java.time.LocalDate;
import java.util.HashSet;

public class Principiante extends Participante implements platosEntrada{
    HashSet<Ingrediente> ingredientesProhibidos;

    public Principiante(String nombre, String apellido, LocalDate fechaNacimiento, ColorEquipo colorEquipo, String localidad, HashSet<Ingrediente> ingredientesProhibidos) {
        super(nombre, apellido, fechaNacimiento, colorEquipo, localidad);
        this.ingredientesProhibidos = ingredientesProhibidos;
    }

    public HashSet<Ingrediente> getIngredientesProhibidos() {
        return ingredientesProhibidos;
    }

    public void setIngredientesProhibidos(HashSet<Ingrediente> ingredientesProhibidos) {
        this.ingredientesProhibidos = ingredientesProhibidos;
    }

    public String ingredientesProhibidosToString(){
        String ingredientesProhibidos = "";
        for (Ingrediente ingrediente : this.ingredientesProhibidos){
            ingredientesProhibidos += "/n" + ingrediente.toString() ;
        }
        return ingredientesProhibidos;
    }

    @Override
    public String preparandoLaMesa() {
        return "Ya guarde todos los elementos prohibidos y no voy a usar:" + ingredientesProhibidosToString();
    }

    @Override
    public boolean cocinarServirEntrada(Plato entrada) throws ErrorNoPuedeUsarUnIngrediente {
        for (Ingrediente ingrediente : entrada.getIngredientesNecesario().keySet()){
            if (this.ingredientesProhibidos.contains(ingrediente)){
                throw new ErrorNoPuedeUsarUnIngrediente();
            }
        }
        return true;
    }
}
