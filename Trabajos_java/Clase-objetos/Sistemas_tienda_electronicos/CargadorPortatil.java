package Sistemas_tienda_electronicos;

public class CargadorPortatil extends Cargador {
    int CantCargas;

    public CargadorPortatil(String nombre, double precio, int stock, int cantCargas) {
        super(nombre, precio, stock);
        CantCargas = cantCargas;
    }

    public int getCantCargas() {
        return CantCargas;
    }

    public void setCantCargas(int cantCargas) {
        CantCargas = cantCargas;
    }
}
