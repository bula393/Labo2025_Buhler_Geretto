package formas;

public class Rectangulo {
    int base;
    int altura;

    public Rectangulo(int BASE, int ALTURA) {
        this.base = BASE;
        this.altura = ALTURA;
    }
    public int getBase() {
        return base;
    }
    public int getAltura() {
        return altura;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public float calcularArea() {
        return (this.base * this.altura);
    }
    public float calcularPerimetro() {
        return ((this.base*2) + (this.altura*2));
    }

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4, 5);
        Rectangulo r2 = new Rectangulo(4, 6);
        System.out.println("Base:" + r1.getBase());
        System.out.println("Altura" + r1.getAltura());
        r2.setAltura(10);
        r2.setBase(10);
        System.out.println("Area:" + r1.calcularArea());;
        System.out.println("Perimetro:" + r1.calcularPerimetro());
    }
}
