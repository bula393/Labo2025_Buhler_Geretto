package sistemaMasterchef;

import personas.Persona1;

import java.time.LocalDate;

public abstract class Participante extends Persona1 {
    ColorEquipo colorEquipo;

    public Participante(String nombre, String apellido, LocalDate fechaNacimiento, ColorEquipo colorEquipo,String localidad) {
        super(nombre, apellido, fechaNacimiento,localidad);
        this.colorEquipo = colorEquipo;
    }

    public ColorEquipo getColorEquipo() {
        return colorEquipo;
    }

    public void setColorEquipo(ColorEquipo colorEquipo) {
        this.colorEquipo = colorEquipo;
    }

    public abstract String preparandoLaMesa();

}
