import duke.choice.Customer1;
import duke.choice.Clothing1;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;
        Customer1 c1 = new Customer1("Pinky", 3);

        System.out.println("Bienvenido");
        System.out.println("Minimum price value: " + Clothing1.MIN_PRICE);

        Clothing1 REM = new Clothing1("Blue Jacket", 20.9, 'M');
        Clothing1 REMO = new Clothing1("Orange T-SHirt", 5.0, 'S');
        Clothing1 scarf = new Clothing1("Green Scarf", 5.0, 'S');
        Clothing1 tshirt = new Clothing1("Blue T-Shirt", 10.5, 'S');

        Clothing1[] items = {REM, REMO, scarf, tshirt};

        c1.addItems(items);

        double total = c1.getTotalClothingCost();

        System.out.println("Total amount including tax: " + total);
    }
}