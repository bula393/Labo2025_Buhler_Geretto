package Sistemas_tienda_electronicos;

import objetos.Producto;

import java.util.ArrayList;

public class SistemaElectronicos {
    ArrayList<Producto>  productos;

    public SistemaElectronicos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    public void addProducto(Producto producto){
        this.productos.add(producto);
    }
    public void bajaProdcuto(Producto producto){
        this.productos.remove(producto);
    }
    public void modProducto(Producto productoNuevo,Producto productoViejo){
        this.bajaProdcuto(productoViejo);
        this.addProducto(productoNuevo);
    }
    public Producto mayorStrock(){
        Producto mayor=productos.get(0);
        for (Producto producto : productos){
            if (producto.getStock()>mayor.getStock()){
                mayor=producto;
            }
        }
        return mayor;
    }
    public Producto menorStrock()    {
        Producto menor=productos.get(0);
        for (Producto producto : productos){
            if (producto.getStock()<menor.getStock()){
                menor=producto;
            }
        }
        return menor;
    }
}

