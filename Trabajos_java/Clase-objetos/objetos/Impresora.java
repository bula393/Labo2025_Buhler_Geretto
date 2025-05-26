package objetos;

public class Impresora extends salida {
    String MetodoImpresion;

    public Impresora(int puerto, String metodoImpresion) {
        super(puerto);
        MetodoImpresion = metodoImpresion;
    }

    public String getMetodoImpresion() {
        return MetodoImpresion;
    }

    public void setMetodoImpresion(String metodoImpresion) {
        MetodoImpresion = metodoImpresion;
    }
}
