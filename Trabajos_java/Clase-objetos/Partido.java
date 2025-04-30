import java.time.LocalDate;

public class Partido {
    Equipo local;
    Equipo visitante;
    LocalDate fecha;
    String turno;

    public Partido(Equipo local, Equipo visitante, LocalDate fecha, String turno) {
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

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    public void mostrarPartido(){
        System.out.println(this.local + "-" + this.visitante );
    }
}
