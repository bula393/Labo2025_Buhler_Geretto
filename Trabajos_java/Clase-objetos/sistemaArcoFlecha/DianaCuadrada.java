package sistemaArcoFlecha;

import java.util.HashMap;

public class DianaCuadrada extends Diana{
    private Double lado;

    public DianaCuadrada(String nombre, HashMap<ColeresDiana, Integer> puntajes, NivelDificultad dificultad, Double lado) {
        super(nombre, puntajes, dificultad);
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public Double areaDiana() {
        return lado*lado;
    }
}
