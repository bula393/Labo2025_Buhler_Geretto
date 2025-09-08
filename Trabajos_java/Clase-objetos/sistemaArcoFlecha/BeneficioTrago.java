package sistemaArcoFlecha;

import java.util.HashSet;

public class BeneficioTrago extends Beneficio{
    HashSet<String> tragos;

    public BeneficioTrago(String nombre, String nombreCreador, HashSet<String> tragos) {
        super(nombre, nombreCreador);
        this.tragos = tragos;
    }

    public HashSet<String> getTragos() {
        return tragos;
    }

    public void setTragos(HashSet<String> tragos) {
        this.tragos = tragos;
    }
}
