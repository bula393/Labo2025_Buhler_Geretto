package objetos;

import SIstemaComputadora.Salida;
import enums.MetodoImpre;

public class Impresora extends Salida {
    MetodoImpre MetodoImpresion;

    public Impresora(String fabricante, String modelo, double precio, int stock, int puerto, MetodoImpre metodoImpresion) {
        super(fabricante, modelo, precio, stock, puerto);
        MetodoImpresion = metodoImpresion;
    }

    public MetodoImpre getMetodoImpresion() {
        return MetodoImpresion;
    }

    public void setMetodoImpresion(MetodoImpre metodoImpresion) {
        MetodoImpresion = metodoImpresion;
    }
}
