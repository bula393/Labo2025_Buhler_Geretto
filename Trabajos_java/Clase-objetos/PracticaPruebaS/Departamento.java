package PracticaPruebaS;
import java.time.LocalDate;
import java.util.HashMap;

public class Departamento extends Vivienda{
    private int cantidadambientes;

    public int getCantidadambientes() {
        return cantidadambientes;
    }

    public void setCantidadambientes(int cantidadambientes) {
        this.cantidadambientes = cantidadambientes;
    }

    public Departamento(int direccion, String codigopostal, Dueño dueño, HashMap<Mes, Integer> kilowaC, int cantidadambientes) {
        super(direccion, codigopostal, dueño, kilowaC);
        this.cantidadambientes = cantidadambientes;
    }
    @Override
    public Double calcularCosteConsume(int anio) {
        return this.calcularConsumo(anio) * 50 ;
    }
}
