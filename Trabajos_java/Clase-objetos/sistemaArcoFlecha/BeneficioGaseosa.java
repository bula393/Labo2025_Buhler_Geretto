package sistemaArcoFlecha;

import sistemaDeBebidas.Bebida;

import java.util.HashSet;

public class BeneficioGaseosa extends Beneficio implements BeneficioGC{
    HashSet<Bebida> bebidas;

    public BeneficioGaseosa(String nombre, String nombreCreador, HashSet<Bebida> bebidas) {
        super(nombre, nombreCreador);
        this.bebidas = bebidas;
    }

    public HashSet<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(HashSet<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    @Override
    public int aplicarDescuentoExtra() {
        return 1000;
    }
}
