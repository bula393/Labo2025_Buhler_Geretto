package GestionMascotas;

import personas.Persona1;

public abstract class Mascota {
    private String nombre;
    private Persona1 dueño;
    private int alegria;


    public Mascota(String nombre, Persona1 dueño) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.alegria = 0;
    }
    public abstract String saludar();
    public abstract void alimentar();
    public abstract Raza tipo();
    public abstract String saludoExtraño();
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona1 getDueño() {
        return dueño;
    }

    public void setDueño(Persona1 dueño) {
        this.dueño = dueño;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }
    public void sumaralegria(){
        alegria++;
    }
    public boolean isDueño(Persona1 persona){
        if (dueño.equals(persona)){
            return true;
        }
        else {
            return false;
        }
    }
}
