package sistemaBarrios;

import java.util.HashSet;

public class CIudad extends Lugar{
    HashSet<Barrio> barrios;

    public CIudad(String nombre, int codigo, Cordenada cordenada, HashSet<Barrio> barrios) {
        super(nombre, codigo, cordenada);
        this.barrios = barrios;
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }

    @Override
    public int calculaPoblacion() {
        int poblacion = 0;
        for (Barrio barrio : barrios){
            poblacion += barrio.calculaPoblacion();
        }
        return poblacion;
    }
}
