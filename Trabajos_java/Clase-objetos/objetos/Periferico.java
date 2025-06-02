package objetos;

public class Periferico extends Dispocitivo {
    private int puerto;

    public Periferico(String fabricante, String modelo, double precio, int stock, int puerto) {
        super(fabricante, modelo, precio, stock);
        this.puerto = puerto;
    }

    public Periferico() {
        super("red dragon","af 5",20.5,5);
        puerto = 2;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }
}
