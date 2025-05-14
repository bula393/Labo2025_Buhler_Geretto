package personas;

import vehiculos.Vehiculo;

import java.util.ArrayList;

public class Sistema_vehiculos {
    ArrayList<Vehiculo> vehiculos;

    public Sistema_vehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
