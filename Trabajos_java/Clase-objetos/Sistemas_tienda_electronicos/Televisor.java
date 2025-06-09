package Sistemas_tienda_electronicos;

import enums.Tegnologia;
import objetos.Producto;

public class Televisor extends Multimedia {
    Tegnologia tegnologia;

    public Televisor(String nombre, double precio, int stock, Tegnologia tegnologia) {
        super(nombre, precio, stock);
        this.tegnologia = tegnologia;
    }

    public Tegnologia getTegnologia() {
        return tegnologia;
    }

    public void setTegnologia(Tegnologia tegnologia) {
        this.tegnologia = tegnologia;
    }
}
