package vehiculos;

import enums.Color;

public class Auto extends VehiculoMotor{
    private boolean descapotable;

    public Auto(String marca, String modelo, Color color, int cantidad_ruedad, int año_fabricacion, String patente, boolean descapotable) {
        super(marca, modelo, color, cantidad_ruedad, año_fabricacion, patente);
        this.descapotable = descapotable;
    }

    public boolean getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

}
