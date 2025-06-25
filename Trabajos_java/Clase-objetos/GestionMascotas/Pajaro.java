package GestionMascotas;

import personas.Persona1;

public class Pajaro extends Mascota{
    private boolean cantor;

    public Pajaro(String nombre, Persona1 dueño, boolean cantor) {
        super(nombre, dueño);
        this.cantor = cantor;
    }

    public boolean isCantor() {
        return cantor;
    }

    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }

    @Override
    public String saludar() {
        String saludo = "";
        for (int i = 0; i < super.getAlegria(); i++) {
            saludo+="pio ";
        }
        restaralegria();
        return saludo;
    }

    @Override
    public void alimentar() {
        sumaralegria();
    }

    @Override
    public Raza tipo() {
        return Raza.PAJARO;
    }

    @Override
    public String saludoExtraño() {
        return "";
    }

    public String cantar(){
        if(isCantor()){
            return "aaaaaaa";
        }
        else {
            return "no es cantor";
        }
    }
}
