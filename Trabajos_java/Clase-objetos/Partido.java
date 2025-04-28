import personas.Jugador;

import java.time.LocalDate;
import java.util.jar.JarEntry;

public class Partido {
    String equipo;
    LocalDate fecha;
    String barrio;
    Jugador[] jugadores_equipo = new Jugador[11] ;
    String disponibilidad;

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Jugador[] getJugadores_equipo() {
        return jugadores_equipo;
    }

    public void setJugadores_equipo(Jugador[] jugadores_equipo) {
        this.jugadores_equipo = jugadores_equipo;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Partido(String equipo, LocalDate fecha, String barrio, Jugador[] jugadores_equipo, String disponibilidad) {
        this.equipo = equipo;
        this.fecha = fecha;
        this.barrio = barrio;
        this.jugadores_equipo = jugadores_equipo;
        this.disponibilidad = disponibilidad;
    }
}
