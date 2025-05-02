package duke.choice;

public class Customer {
    private String name;
    private String size;
    public Customer() {
        this.name = "pepe";
    }

    public Customer(String name, String size) {
        this.name = name;
        this.size = size;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
