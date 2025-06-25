public class Clothing1 {
    private String description;
    private double price;
    private char size;
    private static final double MIN_PRICE = 10.0; // Class-level constant
    private static final double TAX_RATE = 0.2;   // Class-level constant

    public Clothing1(String description, double price, char size) {
        this.description = description;
        this.price = (price < MIN_PRICE) ? MIN_PRICE : price;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price * (1 + TAX_RATE);
    }

    public void setPrice(double price) {
        this.price = (price < MIN_PRICE) ? MIN_PRICE : price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return description + "," + getPrice() + "," + size;
    }
}