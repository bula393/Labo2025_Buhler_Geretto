package sistemaDeBebidas;

public class BebidaAzucarada extends Bebida{
    private int cantidadAzucar;
    static private int positividad = 1;

    public BebidaAzucarada(String nombre, int negatividad, int cantidadAzucar) {
        super(nombre, positividad, (cantidadAzucar * 10));
        this.cantidadAzucar = cantidadAzucar;
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    @Override
    public int getPositividad() {
        return positividad;
    }

    @Override
    public void setPositividad(int positividad) {
        BebidaAzucarada.positividad = positividad;
    }

}
