package sistemaPoliticos;

public class DispocitivoElectronico {
    private int nSerie;
    private String fabricante;
    private String modelo;
    private Boolean encendido;


    public DispocitivoElectronico(int nSerie, String fabricante, String modelo, Boolean encendido) {
        this.nSerie = nSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.encendido = encendido;
    }

    public int getnSerie() {
        return nSerie;
    }

    public void setnSerie(int nSerie) {
        this.nSerie = nSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getEncendido() {
        return encendido;
    }

    public void setEncendido(Boolean encendido) {
        this.encendido = encendido;
    }
}
