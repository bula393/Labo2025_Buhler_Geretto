package sistemaOng;

import java.time.LocalDate;

public class VoluntarioMiembro extends Voluntario{
    private int puntaje;

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public VoluntarioMiembro(String nombre, String apellido, LocalDate fechaNacimiento, int direccion, int codigopostal, boolean contribuyente, int puntaje) {
        super(nombre, apellido, fechaNacimiento, direccion, codigopostal, contribuyente);
        this.puntaje = puntaje;
    }
}
