package Sistemas_tienda_electronicos;

public abstract class ProductoElectronico {
    String nombre;
    double precio;
    int stock;
    Seccion seccion;

    public ProductoElectronico(String nombre, double precio, Seccion seccion, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.seccion = seccion;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }
}
