package objetos;

public class Cafetera {
    int cantidad_maxima;
    int cantidad_actual;

    public int getCantidad_actual() {
        return cantidad_actual;
    }

    public void setCantidad_actual(int cantidad_actual) {
        this.cantidad_actual = cantidad_actual;
    }

    public int getCantidad_maxima() {
        return cantidad_maxima;
    }

    public void setCantidad_maxima(int cantidad_maxima) {
        this.cantidad_maxima = cantidad_maxima;
    }

    public Cafetera() {
        this.cantidad_maxima = 1000;
        this.cantidad_actual = 0;
    }
    public Cafetera(int cantidad_maxima){
        this.cantidad_maxima = cantidad_maxima;
        this.cantidad_actual = this.cantidad_maxima;
    }

    public Cafetera(int cantidad_maxima, int cantidad_actual) {
        this.cantidad_maxima = cantidad_maxima;
        this.cantidad_actual = cantidad_actual;
        if (cantidad_actual>cantidad_actual){
            this.cantidad_actual=this.cantidad_maxima;
        }
    }
    public void llenarCafetera(){
        this.cantidad_actual = this.cantidad_maxima;
    }
    public void vaciarCafetera(){
        this.cantidad_actual = 0;
    }
    public void servirTaza(int cant){
        this.cantidad_actual-=cant;
    }
    public void agregarCafe(int cant){
        this.cantidad_actual+=cant;
    }

    public static void main(String[] args) {
        Cafetera c1 = new Cafetera();
        Cafetera c2 = new Cafetera(2000);
        Cafetera c3 = new Cafetera(2000,4000);
        c3.vaciarCafetera();
        System.out.println("cantidad cafe:" + c3.getCantidad_actual());
        c1.llenarCafetera();
        System.out.println("cantidad cafe:" + c1.getCantidad_actual());
        c2.servirTaza(200);
        System.out.println("cantidad cafe:" + c2.getCantidad_actual());
        c3.agregarCafe(300);
        System.out.println("cantidad cafe:" + c3.getCantidad_actual());
    }
}
