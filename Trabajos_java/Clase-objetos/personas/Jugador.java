package personas;

import java.time.LocalDate;

public class Jugador {
    String nombre;
    LocalDate fecha_nacimiento;
    String disponibilidad_horaria;

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

    public String getDisponibilidad_horaria() {
        return disponibilidad_horaria;
    }

    public void setDisponibilidad_horaria(String disponibilidad_horaria) {
        this.disponibilidad_horaria = disponibilidad_horaria;
    }

    public Jugador(String nombre, LocalDate fecha_nacimiento, String disponibilidad_horaria) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.disponibilidad_horaria = disponibilidad_horaria;
    }
}
