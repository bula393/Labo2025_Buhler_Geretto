public class rectangulo {
    int base;
    int altura;

    public rectangulo(int BASE, int ALTURA) {
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
        rectangulo r1 = new rectangulo(4, 5);
        rectangulo r2 = new rectangulo(4, 6);
        System.out.println("Base:" + r1.getBase());
        System.out.println("Altura" + r1.getAltura());
        r2.setAltura(10);
        r2.setBase(10);
        System.out.println("Area:" + r1.calcularArea());;
        System.out.println("Perimetro:" + r1.calcularPerimetro());
    }
}
