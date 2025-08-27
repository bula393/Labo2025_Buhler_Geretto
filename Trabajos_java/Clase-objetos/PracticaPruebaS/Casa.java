package PracticaPruebaS;
import java.time.LocalDate;
import java.util.HashMap;

public class Casa extends Vivienda{
    private static int precio = 100;
    private int metrosC;
    private int metrosD;

    public Casa(int direccion, String codigopostal, Dueño dueño, HashMap<Integer, HashMap<Mes, Integer>> añokilowaC, int metrosC, int metrosD) {
        super(direccion, codigopostal, dueño, añokilowaC);
        this.metrosC = metrosC;
        this.metrosD = metrosD;
    }

    public int getMetrosC() {
        return metrosC;
    }

    public void setMetrosC(int metrosC) {
        this.metrosC = metrosC;
    }

    public int getMetrosD() {
        return metrosD;
    }

    public void setMetrosD(int metrosD) {
        this.metrosD = metrosD;
    }
    @Override
    public Double calcularCosteConsume(int anio) {
        if (this.conparar_porcentaje_por_mes(anio)){
            return this.calcularConsumo(anio) * precio * 0.95 ;
        }
        return this.calcularConsumo(anio) * precio ;
    }

}
