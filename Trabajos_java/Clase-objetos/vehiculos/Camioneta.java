package vehiculos;

public class Camioneta extends VehiculoMotor{
   private int capacidad_carga_max;
   private int carga;

    public Camioneta(String marca, String modelo, String color, int cantidad_ruedad, int año_fabricacion, String patente, int capacidad_carga_max, int carga) {
        super(marca, modelo, color, cantidad_ruedad, año_fabricacion, patente);
        this.capacidad_carga_max = capacidad_carga_max;
        this.carga = carga;
        this.verificar_carga();
    }

    public int getCapacidad_carga_max() {
        return capacidad_carga_max;
    }

    public void setCapacidad_carga_max(int capacidad_carga_max) {
        this.capacidad_carga_max = capacidad_carga_max;
        this.verificar_carga();
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
        this.verificar_carga();
    }
    public void verificar_carga(){
        if (capacidad_carga_max<carga){
            carga=capacidad_carga_max;
        }
    }
    public void cargar(int carga){
        this.carga+=carga;
        this.verificar_carga();
    }

}
