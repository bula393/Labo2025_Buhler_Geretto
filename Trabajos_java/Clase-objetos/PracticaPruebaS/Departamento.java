package PracticaPruebaS;
import java.time.LocalDate;
import java.util.HashMap;

public class Departamento extends Vivienda{
    private static int precio = 50;
    private int cantidadambientes;

    public int getCantidadambientes() {
        return cantidadambientes;
    }

    public void setCantidadambientes(int cantidadambientes) {
        this.cantidadambientes = cantidadambientes;
    }

    public Departamento(int direccion, String codigopostal, Dueño dueño,HashMap<Integer, HashMap<Mes, Integer>> kilowaC) {
        super(direccion, codigopostal, dueño, kilowaC);
        this.cantidadambientes = cantidadambientes;
    }
    @Override
    public Double calcularCosteConsume(int anio) {
        if (this.conparar_porcentaje_por_mes(anio)){
            return this.calcularConsumo(anio) * precio * 0.95 ;
        }
        return this.calcularConsumo(anio) * precio ;
    }
}
