package sistemaControlDeLlamadas;

import java.time.LocalDateTime;

public class Llamada {
    private Empleado origen;
    private Empleado destino;
    private LocalDateTime fechaHora;
    private int duracionEnMinutos;

    public Llamada(Empleado origen, Empleado destino, int duracionEnMinutos) {
        this.origen = origen;
        this.destino = destino;
        this.duracionEnMinutos = duracionEnMinutos;
        this.fechaHora = LocalDateTime.now();
    }

    public Empleado getOrigen() {
        return origen;
    }

    public Empleado getDestino() {
        return destino;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }


    public String Mostrar() {
        return "Llamada de " + origen.getNombre() + " a " + destino.getNombre() +
                " el " + fechaHora + " por " + duracionEnMinutos + " minutos.";
    }
}

