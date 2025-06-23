package sistema_de_recetas;

import java.util.ArrayList;

public abstract class Plato {
    private String nombre;
    private Dificultad dificultad;
    private ArrayList<Paso> lista_pasos;

    public Plato(String nombre, Dificultad dificultad, ArrayList<Paso> lista_pasos) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.lista_pasos = lista_pasos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public ArrayList<Paso> getLista_pasos() {
        return lista_pasos;
    }

    public void setLista_pasos(ArrayList<Paso> lista_pasos) {
        this.lista_pasos = lista_pasos;
    }
    public int cantidadPasos(){
        return lista_pasos.size();
    }
    abstract void mostrarPasos();
    abstract void mostrar();
    abstract Tipo Tipo();
}
