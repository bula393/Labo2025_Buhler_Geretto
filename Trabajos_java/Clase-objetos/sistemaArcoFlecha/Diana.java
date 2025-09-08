package sistemaArcoFlecha;

import java.util.HashMap;

public abstract class Diana {
    private String nombre;
    private NivelDificultad dificultad;
    private HashMap<ColeresDiana,Integer> puntajes;

    public Diana(String nombre, HashMap<ColeresDiana, Integer> puntajes, NivelDificultad dificultad) {
        this.nombre = nombre;
        this.puntajes = puntajes;
        this.dificultad = dificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NivelDificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(NivelDificultad dificultad) {
        this.dificultad = dificultad;
    }

    public HashMap<ColeresDiana, Integer> getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(HashMap<ColeresDiana, Integer> puntajes) {
        this.puntajes = puntajes;
    }

    public abstract Double areaDiana();
}
