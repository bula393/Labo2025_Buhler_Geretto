package objetos;

public class Periferico {
    private int puerto;

    public Periferico(int puerto) {
        this.puerto = puerto;
    }
    public Periferico() {
        this.puerto = 2;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }
}
