package personas;

import java.time.LocalDate;

public class Jugador {
    String nombre;
    LocalDate fecha_nacimiento;
    int numero_remera;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getNumero_remera() {
        return numero_remera;
    }

    public void setNumero_remera(int numero_remera) {
        this.numero_remera = numero_remera;
    }

    public Jugador(String nombre, LocalDate fecha_nacimiento) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
    }

}
