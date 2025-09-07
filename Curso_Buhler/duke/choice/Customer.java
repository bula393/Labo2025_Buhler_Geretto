package duke.choice;

import java.security.AlgorithmParameterGenerator;
import java.util.ArrayList;

public class Customer {
    private String name;
    private String size;
    ArrayList<Clothing> ropas ;
    public Customer() {
        this.name = "pepe";
    }

    public Customer(String name, String size) {
        this.name = name;
        this.size = size;
        this.ropas = new ArrayList<>();
    }

    public Customer(String name, int measurement) {
        this.name = name;
        this.setSize(measurement);
        this.ropas = new ArrayList<>();
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void setSize(int measurement) {
        switch (measurement) {
            case 1,2,3:
                this.size ="S";
                break;
            case 4,5,6:
                this.size = "M";
                break;
            case 7,8,9:
                this.size = "L";
                break;
            default:
                this.size = "X";
                break;
        }
    }

    public String getName() {
        return name;
    }
    public ArrayList<Clothing> getRopas() {
        return ropas;
    }

    public void setRopas(ArrayList<Clothing> ropas) {
        this.ropas = ropas;
    }

    public void additem(Clothing c) {
        this.ropas.add(c);
    }
    public void removeitem(int index) {
        this.ropas.remove(index);
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getTotalClothingCost(){
        double total = 0;
        for (Clothing c : ropas) {

                   if (c.getSize().equalsIgnoreCase(this.size)) {
                       total = total + c.getPrice();
        }
    }
        return total;
    }
    public double precioPromedioPorTalle(String size) throws ArithmeticException {
        double total = 0;
        int contador = 0;
        for (Clothing c : ropas) {
            if (c.getSize().equalsIgnoreCase(size)) {
                contador++;
                total = total + c.getPrice();
            }
        }
        return total/ropas.size();
    }
}
