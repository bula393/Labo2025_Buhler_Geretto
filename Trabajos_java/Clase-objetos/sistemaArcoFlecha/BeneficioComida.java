package sistemaArcoFlecha;

import java.util.HashSet;

public class BeneficioComida extends Beneficio implements  BeneficioGC{
    private HashSet<String> comidas;

    public BeneficioComida(String nombre, String nombreCreador, HashSet<String> comidas) {
        super(nombre, nombreCreador);
        this.comidas = comidas;
    }

    public HashSet<String> getComidas() {
        return comidas;
    }

    public void setComidas(HashSet<String> comidas) {
        this.comidas = comidas;
    }

    @Override
    public int aplicarDescuentoExtra() {
        return 4500;
    }
}
