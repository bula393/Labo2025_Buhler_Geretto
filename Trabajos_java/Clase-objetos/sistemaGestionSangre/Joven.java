package sistemaGestionSangre;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;

public class Joven extends Paciente implements CalificadosTratamiento{
    private static int edadMin = 20;
    private static int edadMax = 30;
    private HashSet<String> actividades;

    public Joven(String nombre, String apellido, LocalDate fechaNacimiento, TipoSangre sangre, HashSet<String> actividades) {
        if (ChronoUnit.YEARS.between(fechaNacimiento,LocalDate.now())<edadMin  ||  ChronoUnit.YEARS.between(fechaNacimiento,LocalDate.now())>edadMax)
        {
            throw new ErrorRangoEdadIncorrecto("la edad ingresada pertenese a otra categpria");
        }
        super(nombre, apellido, fechaNacimiento, sangre);
        this.actividades = actividades;
    }
    @Override
    public int costo(){
        if (super.getFechaNacimiento().getYear()%2 == 0){
            return (super.getFechaNacimiento().getDayOfMonth() * 145000);
        }
        else {
            return (super.getFechaNacimiento().getMonthValue() * 760000);
        }
    }

    public boolean estaEnRangoDeTratamiento(){
        return ChronoUnit.YEARS.between(super.getFechaNacimiento(),LocalDate.now()) - edadMax > 2;
    }

    @Override
    public String Tratamiento() {
        if (this.actividades.size()%2 != 0){
            if (estaEnRangoDeTratamiento()){
                return "Lamentamos comunicarte que tu sangre aún no va a poder ser modificada";
            }
            else {
                return "Será un tratamiento costoso, pero lo vamos a lograr";
            }
        }
        else {
            return "Será un tratamiento costoso, pero lo vamos a lograr";
        }
    }
}
