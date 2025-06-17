package duke.choice;

import java.util.ArrayList;

public class Clothing {
    private String descripcion;
    private double price;
    private String size;
    private final int minPrice = 10;
    private final double tax = 0.2;
    public Clothing() {
        this.descripcion = "remera";
        this.price = 100;
        this.size = "small";
        if (this.price < Clothing.minPrice) {
            this.price = this.minPrice;
        }
    }
    public Clothing( String descripcion, double price, String size) {
        this.price = price;
        this.size = size;
        this.descripcion = descripcion;
        if (this.price < Clothing.minPrice) {
            this.price = Clothing.minPrice;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrice() {
        return price*(1+tax);
    }

    public void setPrice(double price) {
        this.price = price;
        if (this.price < Clothing.minPrice) {
            this.price = Clothing.minPrice;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void print() {
        System.out.println(this.toString());
    }
    @override
    public String toString() {
        return "descripcion='" + descripcion + ", price=" + price +
                "$, size=" + size;
}
