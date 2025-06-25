import duke.choice.Clothing1;

public class Customer1 {
    private String nombre;
    private String size;
    private Clothing1[] items;

    public Customer1(String nombre, int measurement) {
        this.nombre = nombre;
        setSize(measurement);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {
        switch (measurement) {
            case 1, 2, 3:
                size = "S";
                break;
            case 4, 5, 6:
                size = "M";
                break;
            case 7, 8, 9:
                size = "L";
                break;
            default:
                size = "X";
                break;
        }
    }

    public void addItems(Clothing1[] items) {
        this.items = items;
    }

    public Clothing1[] getItems() {
        return items;
    }

    public double getTotalClothingCost() {
        double total = 0;
        if (items != null) {
            for (Clothing1 item : items) {
                if (item.getSize() == size.charAt(0)) {
                    System.out.println(item.toString());
                    total += item.getPrice();
                    if (total > 15) {
                        break;
                    }
                }
            }
        }
        return total;
    }
}