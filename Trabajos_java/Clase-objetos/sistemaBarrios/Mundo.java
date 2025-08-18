package sistemaBarrios;

import java.util.HashMap;
import java.util.HashSet;

public class Mundo {
    HashSet<Continente> continentes;
    HashMap<Integer,Lugar> lugares;

    public Mundo(HashSet<Continente> continentes, HashMap<Integer,Lugar> lugares) {
        this.continentes = continentes;
        this.lugares = lugares;
    }

    public HashMap<Integer,Lugar> getLugares() {
        return lugares;
    }

    public void añadirL (Lugar l){
        lugares.put(l.getCodigo(),l);
    }
    public void eliminarL (Lugar l){
        lugares.remove(l);
    }
    public void replace(int codigo,Lugar l){
        lugares.put(codigo,l);
    }
    public int BuscarPoblacionPorCodigo(int codigo){
        return lugares.get(codigo).calculaPoblacion();
    }
    public void setLugares(HashMap<Integer,Lugar> lugares) {
        this.lugares = lugares;
    }

    public HashSet<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }
    public void addContinente(Continente continente){
        this.continentes.add(continente);
    }
    public Pais paisMasPoblacion(){
        Pais paisMasPoblacion = new Pais("",0,new Cordenada(0,0),new HashSet<>());
        for (Continente continente : continentes){
            if (paisMasPoblacion.calculaPoblacion() < continente.paisMasPoblacion().calculaPoblacion()){
                paisMasPoblacion = continente.paisMasPoblacion();
            }
        }

        return paisMasPoblacion;
    }
    public Pais paisMenosPoblacion(){
        Pais paisMenosPoblacion = null;
        for (Continente continente : continentes){
            if (paisMenosPoblacion == null || paisMenosPoblacion.calculaPoblacion() > continente.paisMasPoblacion().calculaPoblacion()){
                paisMenosPoblacion = continente.paisMasPoblacion();
            }
        }

        return paisMenosPoblacion;
    }
    public Continente continenteMasPoblacion(){
        Continente masPoblacion = new Continente("",0,new Cordenada(0,0),new HashSet<>());
        for (Continente continente : continentes){
            if (masPoblacion.calculaPoblacion() < continente.calculaPoblacion()){
                masPoblacion = continente;
            }
        }
        return masPoblacion;
    }
    public Continente continenteMenosPoblacion(){
        Continente MenosPoblacion = (Continente) continentes.toArray()[0];
        for (Continente continente : continentes){
            if (MenosPoblacion.calculaPoblacion() > continente.calculaPoblacion()){
                MenosPoblacion = continente;
            }
        }
        return MenosPoblacion;
    }

    public static void main(String[] args) {

    }


}
