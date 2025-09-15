package sistemaGestionSangre;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Niño extends Paciente implements CalificadosTratamiento {
    private int Niveltolerancia;

    public Niño(String nombre, String apellido, LocalDate fechaNacimiento, TipoSangre sangre, int niveltolerancia) {
        if (niveltolerancia > 0 && niveltolerancia <= 10) {
            throw new ErrorRangoToletancia("el numero para la tolerancia es incorecto");
        }
        super(nombre, apellido, fechaNacimiento, sangre);
        Niveltolerancia = niveltolerancia;
    }

    public int getNiveltolerancia() {
        return Niveltolerancia;
    }

    public void setNiveltolerancia(int niveltolerancia) {
        Niveltolerancia = niveltolerancia;
    }

    public boolean mayorDe3() {
        return ChronoUnit.YEARS.between(super.getFechaNacimiento(), LocalDate.now()) >= 3;
    }

    @Override
    public String Tratamiento() {
        if (mayorDe3()){
            return "Tu tratamiento tardará esta cantidad de días:" + (Niveltolerancia * 2);
        }
        return "Aun es muy chico para el tratamiento";
    }

    @Override
    public int costo() {
        return Niveltolerancia * 450000;
    }

}
