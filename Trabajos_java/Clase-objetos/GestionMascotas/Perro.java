package GestionMascotas;

import personas.Persona1;

public class Perro extends Mascota {
    public Perro(String nombre, Persona1 dueño) {
        super(nombre, dueño);
    }

    @Override
    public String saludar() {
        String saludo = "";
        for (int i = 0; i < super.getAlegria(); i++) {
            saludo+="guau ";
        }
        restaralegria();
        return saludo;
    }

    @Override
    public String saludoExtraño() {
        return "GUAU!";
    }

    @Override
    public void alimentar() {
        sumaralegria();
    }

    @Override
    public Raza tipo() {
        return Raza.PERRO;
    }
}
