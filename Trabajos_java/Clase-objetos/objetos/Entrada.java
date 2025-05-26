package objetos;

public class Entrada extends Periferico {
    private String tipoConector;

    public Entrada(int puerto, String tipoConector) {
        super(puerto);
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
