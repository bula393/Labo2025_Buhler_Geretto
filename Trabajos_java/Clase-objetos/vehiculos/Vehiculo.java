package vehiculos;

import enums.Color;

public abstract class Vehiculo {
    String marca;
    String modelo;
    Color color;
    CantRueda cantidad_ruedad;
    int año_fabricacion;

    public Vehiculo(String marca, String modelo, Color color, CantRueda cantidad_ruedad, int año_fabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantidad_ruedad = cantidad_ruedad;
        this.año_fabricacion = año_fabricacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CantRueda getCantidad_ruedad() {
        return cantidad_ruedad;
    }

    public void setCantidad_ruedad(CantRueda cantidad_ruedad) {
        this.cantidad_ruedad = cantidad_ruedad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAño_fabricacion() {
        return año_fabricacion;
    }

    public void setAño_fabricacion(int año_fabricacion) {
        this.año_fabricacion = año_fabricacion;
    }
}
