package GestionMascotas;

import personas.Persona1;

public class Gato extends Mascota{
    public Gato(String nombre, Persona1 dueño) {
        super(nombre, dueño);
    }

    @Override
    public String saludar() {
        String saludo = "";
        for (int i = 0; i < super.getAlegria(); i++) {
            saludo+="miau ";
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
        return Raza.GATO;
    }

    @Override
    public String saludoExtraño() {
        return "MIAU!";
    }
}
