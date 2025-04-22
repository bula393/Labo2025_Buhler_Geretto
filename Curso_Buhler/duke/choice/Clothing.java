package duke.choice;

public class Clothing {
    private String descripcion;
    private double price;
    private String size;
    public Clothing() {
        this.descripcion = "remera";
        this.price = 100;
        this.size = "small";
    }
    public Clothing( String descripcion, double price, String size) {
        this.price = price;
        this.size = size;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void print() {
        System.out.println("prenda:" + this.descripcion + ", precio:" + this.price + "$,tamaño:" + this.size);
    }

}
