package sistemaBarrios;

public class Barrio extends Lugar {
    private int poblacion;

    public Barrio(String nombre, int codigo, Cordenada cordenada, int poblacion) {
        super(nombre, codigo, cordenada);
        this.poblacion = poblacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public void addLugar() {

    }

    @Override
    public int calculaPoblacion() {
        return poblacion;
    }
}
