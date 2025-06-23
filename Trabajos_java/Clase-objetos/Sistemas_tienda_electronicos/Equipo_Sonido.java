package Sistemas_tienda_electronicos;
import objetos.Producto;

public class Equipo_Sonido extends ProductoElectronico {
    private Boolean blutooth;
    private static Seccion seccion = Seccion.CARGADOR;

    public Equipo_Sonido(String nombre, float precio, int stock, Boolean blutooth) {
        super(nombre, precio,seccion, stock);
        this.blutooth = blutooth;
    }

    public Boolean getBlutooth() {
        return blutooth;
    }

    public void setBlutooth(Boolean blutooth) {
        this.blutooth = blutooth;
    }
}
