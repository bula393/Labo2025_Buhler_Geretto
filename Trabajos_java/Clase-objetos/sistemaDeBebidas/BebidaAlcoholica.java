package sistemaDeBebidas;

public class BebidaAlcoholica extends Bebida{
    private int cantidadAlcohol;
    static private int positividad = 0;
    public BebidaAlcoholica(String nombre, int negatividad, int cantidadAlcohol) {
        super(nombre, positividad, (cantidadAlcohol * 20));
        this.cantidadAlcohol = cantidadAlcohol;
    }

    @Override
    public int getPositividad() {
        return positividad;
    }

    public int getCantidadAlcohol() {
        return cantidadAlcohol;
    }

    public void setCantidadAlcohol(int cantidadAlcohol) {
        this.cantidadAlcohol = cantidadAlcohol;
    }

    @Override
    public void setPositividad(int positividad) {
        BebidaAlcoholica.positividad = positividad;
    }
}
