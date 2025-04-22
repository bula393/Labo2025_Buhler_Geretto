package duke.choice;

public class Customer {
    private String name;
    public Customer() {
        this.name = "pepe";
    }
    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
