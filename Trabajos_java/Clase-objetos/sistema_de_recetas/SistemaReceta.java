package sistema_de_recetas;

import java.util.ArrayList;

public class SistemaReceta {
    private ArrayList<Plato> platos;

    public SistemaReceta(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    public ArrayList<Plato> getPlatos() {

        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }
    public void addplato(Plato plato){
        platos.add(plato);
    }
    public void borrarPlato(Plato plato){
        platos.remove(plato);
    }
    public void replace(Plato platoviejo,Plato platoNuevo){
        this.addplato(platoNuevo);
        this.borrarPlato(platoviejo);
    }
    public ArrayList<Plato> buscarPorDificutad(Dificultad dificultad){
        ArrayList<Plato> platosPorDificultad = new ArrayList<>();
        for (Plato plato: platos){
            if (plato.getDificultad()==dificultad){
                platosPorDificultad.add(plato);
            }
        }
        return platosPorDificultad;
    }
    public ArrayList<Plato> buscarPorTipo(Tipo tipo){
        ArrayList<Plato> platosPorDificultad = new ArrayList<>();
        for (Plato plato: platos){
            if (plato.Tipo()==tipo){
                platosPorDificultad.add(plato);
            }
        }
        return platosPorDificultad;
    }
    public int cantidadRecetas(){
        return this.platos.size();
    }
    public Plato platoConMasPasos(){
        Plato platoConMasPasos = platos.get(0);
        for (Plato plato : platos){
            if (platoConMasPasos.cantidadPasos()<plato.cantidadPasos()){
                platoConMasPasos = plato;
            }
        }
        return platoConMasPasos;
    }
}
