package formas;

public class Circulo extends Figura{
    private float radio;


    public Circulo() {
        this.radio = 2;
    }
    public Circulo(float RADIO) {
        this.radio = RADIO;
    }
    public float getRadio() {
        return radio;
    }
    public void setRadio(float RADIO) {
        this.radio = RADIO;
    }
    public float area() {
        return (float) ((this.radio * this.radio)*3.14);
    }
    public float perimetro() {
        return (float) (2 * this.radio * 3.14);
    }
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(4);
        System.out.println("radio:" + c1.getRadio());
        c2.setRadio(10);
        System.out.println("Area:" + c1.area());;
        System.out.println("Perimetro:" + c1.perimetro());
    }
}

