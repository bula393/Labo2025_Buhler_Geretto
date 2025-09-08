package sistemaArcoFlecha;

import java.util.HashMap;

public class DianaRectangular extends Diana{
    private Double base;
    private Double altura;

    public DianaRectangular(String nombre, HashMap<Integer,ColeresDiana> puntajes, NivelDificultad dificultad, Double base, Double altura) {
        super(nombre, puntajes, dificultad);
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double areaDiana() {
        return base*altura;
    }
}
