package sistemaPoliticos;

import personas.Persona1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Trabajador extends Persona1 implements Mensajero{
    private int cuit;
    private Double sueldo;
    private LocalTime HorarioEntrada;
    private LocalTime HorarioSalida;

    public Trabajador(String nombre, String apellido, LocalDate fechaNacimiento, int dni, int cuit, Double sueldo, LocalTime horarioEntrada, LocalTime horarioSalida) {
        super(nombre, apellido, fechaNacimiento, dni);
        this.cuit = cuit;
        this.sueldo = sueldo;
        HorarioEntrada = horarioEntrada;
        HorarioSalida = horarioSalida;
    }

    public LocalTime getHorarioEntrada() {
        return HorarioEntrada;
    }

    public void setHorarioEntrada(LocalTime horarioEntrada) {
        HorarioEntrada = horarioEntrada;
    }

    public LocalTime getHorarioSalida() {
        return HorarioSalida;
    }

    public void setHorarioSalida(LocalTime horarioSalida) {
        HorarioSalida = horarioSalida;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void hacerCampaña(String mensaje) {
        if (LocalTime.now().isBefore(getHorarioSalida())&&LocalTime.now().isAfter(getHorarioEntrada()))
            System.out.println("Yo, " + super.getNombre() + " te invito a que " + mensaje);

    }

}
