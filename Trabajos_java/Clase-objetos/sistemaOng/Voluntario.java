package sistemaOng;

import java.time.LocalDate;

public class Voluntario extends PersonaOng{
    public Voluntario(String nombre, String apellido, LocalDate fechaNacimiento, int direccion, int codigopostal, boolean contribuyente) {
        super(nombre, apellido, fechaNacimiento, direccion, codigopostal, contribuyente);
    }


}
