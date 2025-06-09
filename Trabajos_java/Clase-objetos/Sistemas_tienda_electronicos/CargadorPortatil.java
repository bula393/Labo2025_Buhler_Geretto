package Sistemas_tienda_electronicos;

import objetos.Producto;

public class CargadorPortatil extends ProductoElectronico {
    int CantCargas;
    static Seccion seccion = Seccion.MULTIMEDIA;

    public CargadorPortatil(String nombre, double precio, int stock, int cantCargas) {
        super(nombre, precio, seccion, stock);
        CantCargas = cantCargas;
    }

    public int getCantCargas() {
        return CantCargas;
    }

    public void setCantCargas(int cantCargas) {
        CantCargas = cantCargas;
    }
}
