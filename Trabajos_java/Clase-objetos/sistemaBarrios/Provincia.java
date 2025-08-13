package sistemaBarrios;

import java.util.HashSet;

public class Provincia extends Lugar{
    private HashSet<CIudad> ciudades;

    public HashSet<CIudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<CIudad> ciudades) {
        this.ciudades = ciudades;
    }

    public Provincia(String nombre, int codigo, Cordenada cordenada, HashSet<CIudad> ciudades) {
        super(nombre, codigo, cordenada);
        this.ciudades = ciudades;
    }
    @Override
    public int calculaPoblacion() {
        int poblacion = 0;
        for (CIudad ciudad : ciudades){
            poblacion += ciudad.calculaPoblacion();
        }
        return poblacion;
    }
}
