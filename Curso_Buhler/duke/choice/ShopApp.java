package duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0;
        Customer customer = new Customer("Pinky");
        Clothing item1 = new Clothing("Blue jacket",20.9,"M");
        Clothing item2 = new Clothing("Orange T-Shirt", 12.5,"s");
        System.out.println("hola " + customer.getName());
        item1.print();
        item2.print();
        total += ((item1.getPrice() + item2.getPrice()*2)*(1+tax));
        System.out.println("total: " + total);
    }
}
