import enums.Turno;

import java.time.LocalDate;

public class Partido {
    Equipo local;
    Equipo visitante;
    LocalDate fecha;
    Turno turno;

    public Partido(Equipo local, Equipo visitante, LocalDate fecha, Turno turno) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.turno = turno;
    }


    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    public void mostrarPartido(){
        System.out.println(this.local.getEquipo() + "-" + this.visitante.getEquipo() );
    }
}
