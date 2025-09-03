package sistemaPoliticos;

import personas.Persona1;

import java.time.LocalDate;

public class Trabajador extends Persona1 implements Mensajero{
    private int cuit;
    private Double sueldo;

    public Trabajador(String nombre, String apellido, LocalDate fechaNacimiento, int dni, int cuit, Double sueldo) {
        super(nombre, apellido, fechaNacimiento, dni);
        this.cuit = cuit;
        this.sueldo = sueldo;
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
        System.out.println("Yo, " + super.getNombre() + " te invito a que " + mensaje);
    }
}
