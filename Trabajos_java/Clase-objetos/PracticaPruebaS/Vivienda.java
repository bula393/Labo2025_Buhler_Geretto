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
//public Double AplicarDescuento(int anio) {
//    // Obtenemos el año actual
//
//
//    // Si el año ingresado es distinto al actual, procedemos
//    if (anio != anioActual) {
//        // Aquí deberías tener una forma de obtener los kWh del año pasado
//        double kWhAnioPasado = obtenerConsumoPorAnio(anio); // Este es un ejemplo, deberías tenerlo definido
//        double kWhActual = obtenerConsumoPorAnio(anioActual); // Lo mismo aquí
//
//        // Si hubo una reducción de consumo, aplicamos un descuento
//        if (kWhAnioPasado > kWhActual) {
//            double diferencia = kWhAnioPasado - kWhActual;
//            double descuento = calcularDescuento(diferencia); // Define cómo calcular el descuento
//            return descuento;
//        }
//    }
//
//    return 0.0; // No hay descuento
//}
    public Double calcularConsumo(int anio) {
        Double KWhTotal = 0.0;
        HashMap<Mes, Integer> kilowaC = AñokilowaC.get(anio);
        for (Integer wats : kilowaC.values()) {
            KWhTotal += wats;
        }
        return KWhTotal;
    }   public Double AplicarDescueto(int anio)){
        int anioActual = LocalDate.now().getYear();
      if((anio != anioActual)){
          AñokilowaC.get(anio) - anioActual;z|
        }
    }
        public abstract Double calcularCosteConsume(int anio);
}


