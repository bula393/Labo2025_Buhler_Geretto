public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    public Coche(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad=0;
    }

    public int getVelocidad(){return  velocidad; }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setVelocidad(int velocidad){ this.velocidad = velocidad; }
    public void acelerar(){
        this.velocidad+=25;
    }
    public void frenar(){
        this.velocidad=0;
    }
    public void mostrarvelocidad(){
        System.out.println(this.getVelocidad());
    }

    public static void main(String[] args) {
        Coche a1= new Coche("ferrari", "Ferrari 488 GTB", "rojo") ;
        a1.setColor("negro");
        a1.setVelocidad(10);
        a1.setMarca("lambo");
        a1.setModelo("huracan");
        System.out.println(a1.getMarca());
        System.out.println(a1.getColor());
        System.out.println(a1.getModelo());
        System.out.println(a1.getVelocidad());
        a1.acelerar();
        a1.acelerar();
        a1.mostrarvelocidad();
        a1.frenar();
        a1.mostrarvelocidad();
    }
}
