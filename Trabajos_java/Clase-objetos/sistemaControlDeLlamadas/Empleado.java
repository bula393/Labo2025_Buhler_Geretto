package sistemaControlDeLlamadas;
import personas.Persona1;

import java.util.ArrayList;

public class Empleado extends Persona1 {
    int dni;
    String país;
    int telefono;
    ArrayList<Llamada> llamadas;

    public Empleado(String nombre, String apellido, int dni, String país, int telefono) {
        super(nombre, apellido);
        this.dni = dni;
        this.país = país;
        this.telefono = telefono;
        this.llamadas = llamadas;
        llamadas = new ArrayList<>();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }
}
