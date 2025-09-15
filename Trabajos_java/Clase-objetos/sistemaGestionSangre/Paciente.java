package sistemaGestionSangre;

import personas.Persona1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Paciente extends Persona1 {
    TipoSangre sangre;

    public Paciente(String nombre, String apellido, LocalDate fechaNacimiento, TipoSangre sangre) {
        super(nombre, apellido,fechaNacimiento);
        this.sangre = sangre;
    }
    public Paciente() {
        super("hernan", "garayzar",LocalDate.now());
        this.sangre = new TipoSangre();
    }

    public TipoSangre getSangre() {
        return sangre;
    }

    public void setSangre(TipoSangre sangre) {
        this.sangre = sangre;
    }
}
