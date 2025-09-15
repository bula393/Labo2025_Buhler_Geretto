package sistemaGestionSangre;

import java.time.LocalDate;

public class Adulto extends Paciente{
    public Adulto(String nombre, String apellido, LocalDate fechaNacimiento, TipoSangre sangre) {
        super(nombre, apellido, fechaNacimiento, sangre);
    }
}
