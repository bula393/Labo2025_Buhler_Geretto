package GestionMascotas;

import personas.Persona1;

public class Pez extends Mascota{
    private int vidas;

    public Pez(String nombre, Persona1 dueño) {
        super(nombre, dueño);
        vidas=10;
    }

    @Override
    public String saludar() {
        vidas--;
        return "";
    }

    @Override
    public void alimentar() {
        vidas++;
    }

    public boolean muerto(){
        if(vidas==0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Raza tipo() {
        return Raza.PEZ;
    }
    @Override
    public String saludoExtraño() {
        vidas=0;
        return "mori";
    }
}
