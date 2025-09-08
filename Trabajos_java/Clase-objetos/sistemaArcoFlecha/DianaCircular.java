package sistemaArcoFlecha;

import java.util.HashMap;

public class DianaCircular extends Diana{
    private static Double radio = 13.0;

    public DianaCircular(String nombre, HashMap<Integer,ColeresDiana> puntajes, NivelDificultad dificultad) {
        super(nombre, puntajes, dificultad);
    }

    public static Double getRadio() {
        return radio;
    }

    public static void setRadio(Double radio) {
        DianaCircular.radio = radio;
    }

    @Override
    public Double areaDiana() {
        return Math.PI*DianaCircular.radio*DianaCircular.radio;
    }
}
