package sistemaArcoFlecha;

import java.util.HashSet;

public class SistemaBares {
    private HashSet<Bar> bares;
    private HashSet<String> tiposDianas;
    private HashSet<Beneficio> beneficios;

    public SistemaBares(HashSet<Bar> bares, HashSet<String> tiposDianas, HashSet<Beneficio> beneficios) {
        this.bares = bares;
        this.tiposDianas = tiposDianas;
        this.beneficios = beneficios;
    }

    public HashSet<Bar> getBares() {
        return bares;
    }

    public void setBares(HashSet<Bar> bares) {
        this.bares = bares;
    }

    public HashSet<String> getTiposDianas() {
        return tiposDianas;
    }

    public void setTiposDianas(HashSet<String> tiposDianas) {
        this.tiposDianas = tiposDianas;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }


}
