package sistemaArcoFlecha;

import java.util.HashMap;

public abstract class Diana {
    private String nombre;
    private NivelDificultad dificultad;
    private HashMap<Integer,ColeresDiana> puntajes;

    public Diana(String nombre, HashMap<Integer,ColeresDiana> puntajes, NivelDificultad dificultad) {
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

    public HashMap<Integer,ColeresDiana> getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(HashMap<Integer,ColeresDiana> puntajes) {
        this.puntajes = puntajes;
    }

    public abstract Double areaDiana();
    public int cantPuntajes(){
        return puntajes.size();
    }
}
