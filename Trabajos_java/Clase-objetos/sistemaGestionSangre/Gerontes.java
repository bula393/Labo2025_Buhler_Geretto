package sistemaGestionSangre;

import java.time.LocalDate;

public class Gerontes extends Paciente{
    public Gerontes(String nombre, String apellido, LocalDate fechaNacimiento, TipoSangre sangre) {
        super(nombre, apellido, fechaNacimiento, sangre);
    }
}
