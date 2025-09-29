package sistemaMasterchef;

import sistemaCalorias.Ingrediente;

import java.time.LocalDate;
import java.util.HashMap;

public class Intermedio extends Participante implements PlatoPrincipal{
    HashMap<Ingrediente,Integer> ingredienteStock;

    public Intermedio(String nombre, String apellido, LocalDate fechaNacimiento, ColorEquipo colorEquipo, String localidad, HashMap<Ingrediente, Integer> ingredienteStock) {
        super(nombre, apellido, fechaNacimiento, colorEquipo, localidad);
        this.ingredienteStock = ingredienteStock;
    }

    public HashMap<Ingrediente, Integer> getIngredienteStock() {
        return ingredienteStock;
    }

    public void setIngredienteStock(HashMap<Ingrediente, Integer> ingredienteStock) {
        this.ingredienteStock = ingredienteStock;
    }

    public boolean hayStock(int stock){ return stock>=1; }

    @Override
    public String preparandoLaMesa() {
        String mensaje = "Mi stock a utilizar es de" + "/n";

        for (Ingrediente ingrediente : ingredienteStock.keySet()){
            if (hayStock(this.ingredienteStock.get(ingrediente))){
                mensaje += ingrediente.toString() + "/n";
            }
        }


        return mensaje;
    }

    public void bajarstock(Plato plato){
        for (Ingrediente ingrediente : plato.getIngredientesNecesario().keySet()){
            this.ingredienteStock.put(ingrediente,(this.ingredienteStock.get(ingrediente)-plato.getIngredientesNecesario().get(ingrediente)));
        }
    }

    @Override
    public boolean cocinarServirPrincipal(Plato platoprincipal) throws ErrorNoHayStock,ErrorNoHayStockSuficiente{
        for (Ingrediente ingrediente : platoprincipal.getIngredientesNecesario().keySet()){
            if (!this.ingredienteStock.containsKey(ingrediente)){
                throw new ErrorNoHayStock();
            }
            else {
                if (!hayStock(this.ingredienteStock.get(ingrediente)-platoprincipal.getIngredientesNecesario().get(ingrediente))){
                    throw new ErrorNoHayStockSuficiente(ingrediente.toString());
                }
            }
        }
        bajarstock(platoprincipal);
        return true;
    }
}
