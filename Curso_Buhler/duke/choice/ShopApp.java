package duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0;
        Customer customer = new Customer("Pinky");
        Clothing item1 = new Clothing("Blue jacket",20.9,"M");
        Clothing item2 = new Clothing("Orange T-Shirt", 12.5,"s");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "s");
        Clothing[] ropas = new Clothing[5];
        ropas[0] = item1;
        ropas[1] = item2;
        ropas[2] = item2;
        ropas[3] = item3;
        ropas[4] = item4;
        int measurement = 3;
        switch (measurement) {
            case 1,2,3:
                customer.setSize("S");
                break;
            case 4,5,6:
                customer.setSize("M");
                break;
            case 7,8,9:
                customer.setSize("L");
                break;
            default:
                customer.setSize("X");
                break;
        }
        System.out.println(customer.getSize());
        System.out.println("hola " + customer.getName());
        //item1.print();
        //item2.print();
        //total += ((item1.getPrice() + item2.getPrice()*2)*(1+tax));
        for (Clothing c : ropas) {

            if (c.getSize().equalsIgnoreCase(customer.getSize())) {
                c.print();
                total = total + c.getPrice();
                if (total >= 15) {
                    break;
                }
            }
        }
        total *= tax+1;
        System.out.println("total: " + total);
    }
}
