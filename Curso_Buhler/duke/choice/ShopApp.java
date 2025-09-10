package duke.choice;

import java.util.ArrayList;
import java.util.Arrays;

public class ShopApp {
    public static void main(String[] args) {
        System.out.println("minimum price: " + Clothing.getMinPrice());
        Customer customer = new Customer("Pinky",3);
        Clothing item1 = new Clothing("Blue jacket",20.9,"M");
        Clothing item2 = new Clothing("Orange T-Shirt", 12.5,"s");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "s");
        ArrayList ropas = new ArrayList();
        ropas.add(item1);
        ropas.add(item2);
        ropas.add(item2);
        ropas.add(item3);
        ropas.add(item4);
        customer.setRopas(ropas);
        System.out.println(customer.getSize());
        System.out.println("hola " + customer.getName());
        System.out.println("promedio:" + customer.precioPromedioPorTalle(customer.getSize()));
        try {
            System.out.println("promedio:" + customer.precioPromedioPorTalle("L"));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        Arrays.sort(customer.getRopas().toArray());
        //item1.print();
        //item2.print();
        //total += ((item1.getPrice() + item2.getPrice()*2)*(1+tax));
        for (Clothing c : customer.getRopas()) {

            if (c.getSize().equalsIgnoreCase(customer.getSize())) {
                c.print();
     //           total = total + c.getPrice();
     //           if (total >= 15) {
   //                 break;
 //               }
            }
        }
        System.out.println("total: " + customer.getTotalClothingCost());
    
    // Server parte
        try {
                ListaPrendas lista = new ListaPrendas(customer.getRopas());
                Routing routing = Routing.builder()
                    .get("/items",lista).build();
                ServerConfiguration config = ServerConfiguration.builder()
                        .bindAddress(InetAddress.getLocalHost())
                        .port(11111).build();
                WebServer ws = WebServer.create(config,routing);
                ws.start();
            } catch (UnknownHostException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
    }
}
