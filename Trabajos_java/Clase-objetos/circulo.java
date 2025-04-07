
public class circulo {
    private float radio;


    public circulo() {
        this.radio = 2;
    }
    public circulo(float RADIO) {
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
        circulo c1 = new circulo();
        circulo c2 = new circulo(4);
        System.out.println("radio:" + c1.getRadio());
        c2.setRadio(10);
        System.out.println("Area:" + c1.area());;
        System.out.println("Perimetro:" + c1.perimetro());
    }
}