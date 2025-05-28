package objetos;

public class Impresora extends Salida {
    String MetodoImpresion;

    public Impresora(String fabricante, String modelo, double precio, int stock, int puerto, String metodoImpresion) {
        super(fabricante, modelo, precio, stock, puerto);
        MetodoImpresion = metodoImpresion;
    }

    public String getMetodoImpresion() {
        return MetodoImpresion;
    }

    public void setMetodoImpresion(String metodoImpresion) {
        MetodoImpresion = metodoImpresion;
    }
}
