package pago_empleados;

public class Proyecto {
    private String nombre;
    private int ganancia;

    public Proyecto(String nombre, int ganancia) {
        this.nombre = nombre;
        this.ganancia = ganancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }
}
