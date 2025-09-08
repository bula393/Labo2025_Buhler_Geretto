package sistemaArcoFlecha;

import java.util.HashMap;

public class DianaCircular extends Diana{
    private Double radio;

    public DianaCircular(String nombre, HashMap<ColeresDiana, Integer> puntajes, NivelDificultad dificultad, Double radio) {
        super(nombre, puntajes, dificultad);
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double areaDiana() {
        return Math.PI*radio*radio;
    }
}
