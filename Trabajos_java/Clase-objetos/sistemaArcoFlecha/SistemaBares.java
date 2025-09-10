package sistemaArcoFlecha;

import java.util.HashMap;
import java.util.HashSet;

public class SistemaBares {
    private HashSet<Bar> bares;
    private HashSet<Diana> tiposDianas;
    private HashSet<Beneficio> beneficios;

    public SistemaBares(HashSet<Bar> bares, HashSet<Diana> tiposDianas, HashSet<Beneficio> beneficios) {
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

    public HashSet<Diana> getTiposDianas() {
        return tiposDianas;
    }

    public void setTiposDianas(HashSet<Diana> tiposDianas) {
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
        DianaCircular dci = new DianaCircular("dianaredonda",new HashMap<>(),NivelDificultad.DIFICIL);
        DianaCuadrada dcu = new DianaCuadrada("dianaCuadrada",new HashMap<>(),NivelDificultad.MEDIO,25.2);
        BeneficioTrago t1 = new BeneficioTrago("descuentoFernet","franco",new HashSet<>());
        BeneficioComida c1 = new BeneficioComida("2x1Hamburguesas","sanga",new HashSet<>());
        HashSet<Diana> dianas = new HashSet<>();
        dianas.add(dci);
        dianas.add(dcu);
        Bar b1 = new Bar(dianas,new HashSet<>(),new HashSet<>(),20.45,10);
        b1.addBeneficio(t1);
        b1.addBeneficio(c1);
        b1.cantBeneficios();
        HashSet<Bar> bares = new HashSet<>();
        bares.add(b1);
        HashSet<Beneficio> beneficios = new HashSet<>();
        beneficios.add(t1);
        beneficios.add(c1);
        SistemaBares s1 = new SistemaBares(bares,dianas,beneficios);
        System.out.println(s1.masPuntajes().getNombre());
        dci.areaDiana();
        dci.cantPuntajes();
    }

}
