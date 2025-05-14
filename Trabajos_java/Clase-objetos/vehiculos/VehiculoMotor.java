package vehiculos;

public class VehiculoMotor extends Vehiculo {
    private String patente;

    public VehiculoMotor(String marca, String modelo, String color, int cantidad_ruedad, int año_fabricacion, String patente) {
        super(marca, modelo, color, cantidad_ruedad, año_fabricacion);
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
