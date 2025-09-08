package sistemaArcoFlecha;

import java.util.HashSet;

public class SistemaBares {
    private HashSet<Bar> bares;
    private HashSet<Diana> tiposDianas;
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
    public Diana masPuntajes(){
        Diana masPuntajes = (Diana) tiposDianas.stream().toArray()[0];
        for (Diana d : tiposDianas){
            if (d.cantPuntajes() > masPuntajes.cantPuntajes()){
                masPuntajes = d;
            }
        }
        return masPuntajes;
    }
    public static void main(String[] args) {
        DianaCircular dci = new DianaCircular();
        DianaCuadrada dcu = new DianaCuadrada();
        BeneficioTrago t1 = new BeneficioTrago();
        BeneficioComida c1 = new BeneficioComida();
        Bar b1 = new Bar();

    }

}
