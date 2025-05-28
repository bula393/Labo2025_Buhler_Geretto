package objetos;

public class Entrada extends Periferico {
    private String tipoConector;

    public Entrada(String fabricante, String modelo, double precio, int stock, int puerto, String tipoConector) {
        super(fabricante, modelo, precio, stock, puerto);
        this.tipoConector = tipoConector;
    }

    public Entrada() {
        super();
        this.tipoConector = "USB";
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }
}
