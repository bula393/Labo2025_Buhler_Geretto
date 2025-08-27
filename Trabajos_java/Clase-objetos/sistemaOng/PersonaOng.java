package sistemaOng;

import personas.Persona1;

import java.time.LocalDate;
import java.util.HashMap;

public class PersonaOng extends Persona1 {
    public boolean isContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(boolean contribuyente) {
        this.contribuyente = contribuyente;
    }

    private boolean contribuyente;

    public PersonaOng(String nombre, String apellido, LocalDate fechaNacimiento, int direccion, int codigopostal, boolean contribuyente) {
        super(nombre, apellido, fechaNacimiento, direccion, codigopostal);
        this.contribuyente = contribuyente;
    }


}

