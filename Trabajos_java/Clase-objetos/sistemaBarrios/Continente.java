package sistemaBarrios;

import java.util.HashSet;

public class Continente extends Lugar{
    private HashSet<Pais> paises;

    public Continente(String nombre, int codigo, Cordenada cordenada, HashSet<Pais> paises) {
        super(nombre, codigo, cordenada);
        this.paises = paises;
    }

    public HashSet<Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }

    @Override
    public int calculaPoblacion() {
        int poblacion = 0;
        for (Pais pais : paises){
            poblacion += pais.calculaPoblacion();
        }
        return poblacion;
    }
    public Pais paisMasPoblacion(){
        Pais paisMasPoblacion = new Pais("",0,new Cordenada(0,0),new HashSet<>());
        for (Pais pais : paises){
            if (paisMasPoblacion.calculaPoblacion() < pais.calculaPoblacion()){
                paisMasPoblacion = pais;
            }
        }

        return paisMasPoblacion;
    }
    public Pais paisMenosPoblacion(){
        Pais paisMenosPoblacion = new Pais("",0,new Cordenada(0,0),new HashSet<>());
        for (Pais pais : paises){
            if (paisMenosPoblacion.calculaPoblacion() > pais.calculaPoblacion()){
                paisMenosPoblacion = pais;
            }
        }

        return paisMenosPoblacion;
    }
}
