package sistemaCalorias;

import java.util.HashSet;

public class Plato {
    private String nombre;
    private int calorias;
    private HashSet<Ingrediente> ingredientes;

    public Plato(String nombre, int calorias, HashSet<Ingrediente> ingredientes) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public HashSet<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashSet<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
