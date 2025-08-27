package PracticaPruebaS;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;


public abstract class  Vivienda {
    private int direccion;
    private String codigopostal;
    private Dueño dueño;
    private HashMap<Integer,HashMap<Mes,Integer>> AñokilowaC;
  //  private HashMap<Integer, Date> FechaInsert;


    public HashMap<Integer, HashMap<Mes, Integer>> getAñokilowaC() {
        return AñokilowaC;
    }

    public void setAñokilowaC(HashMap<Integer, HashMap<Mes, Integer>> añokilowaC) {
        AñokilowaC = añokilowaC;
    }



    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public Vivienda(int direccion, String codigopostal, Dueño dueño, HashMap<Integer, HashMap<Mes, Integer>> añokilowaC) {
        this.direccion = direccion;
        this.codigopostal = codigopostal;
        this.dueño = dueño;
        AñokilowaC = añokilowaC;
    }

    public Double calcularConsumo(int anio) {
        Double KWhTotal = 0.0;
        HashMap<Mes, Integer> kilowaC = AñokilowaC.get(anio);
        for (Integer wats : kilowaC.values()) {
            KWhTotal += wats;
        }
        return KWhTotal;
    }
    public boolean conparar_porcentaje_por_mes(int anio){
        HashMap<Mes,Integer> mesesAnioActual = AñokilowaC.get(anio);
        HashMap<Mes,Integer> mesesAnioPasado = AñokilowaC.get(anio-1);
        for (Mes mes : Mes.values()){
            if (mesesAnioActual.get(mes)>= (mesesAnioPasado.get(mes)*0.9) ){
                return true;
            }
        }
        return false;
    }
        public abstract Double calcularCosteConsume(int anio);
}


