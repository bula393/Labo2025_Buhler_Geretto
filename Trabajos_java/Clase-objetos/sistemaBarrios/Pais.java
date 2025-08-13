package sistemaBarrios;

import java.util.HashSet;

public class Pais extends Lugar{
    HashSet<Provincia> provincias;

    public Pais(String nombre, int codigo, Cordenada cordenada, HashSet<Provincia> provincias) {
        super(nombre, codigo, cordenada);
        this.provincias = provincias;
    }

    public HashSet<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<Provincia> provincias) {
        this.provincias = provincias;
    }
    @Override
    public int calculaPoblacion() {
        int poblacion = 0;
        for (Provincia provincia : provincias){
            poblacion += provincia.calculaPoblacion();
        }
        return poblacion;
    }
}
