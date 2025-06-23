package Sistemas_tienda_electronicos;

import enums.Tegnologia;
import objetos.Producto;

import java.util.Stack;

public class Televisor extends ProductoElectronico {
    private Tegnologia tegnologia;
    private static Seccion seccion = Seccion.MULTIMEDIA;

    public Televisor(String nombre, double precio, int stock, Tegnologia tegnologia) {
        super(nombre, precio,seccion, stock);
        this.tegnologia = tegnologia;
    }

    public Tegnologia getTegnologia() {
        return tegnologia;
    }

    public void setTegnologia(Tegnologia tegnologia) {
        this.tegnologia = tegnologia;
    }
}
