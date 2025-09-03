package sistemaPoliticos;

import animal.Ave;

public class PalomaMensajera extends Ave implements Mensajero {
    private boolean sabeVolar;

    public PalomaMensajera(String nombre, String especie, String color, boolean sabeVolar) {
        super(nombre, especie, color);
        this.sabeVolar = sabeVolar;
    }

    public boolean isSabeVolar() {
        return sabeVolar;
    }

    public void setSabeVolar(boolean sabeVolar) {
        this.sabeVolar = sabeVolar;
    }
    @Override
    public void hacerCampaña(String mensaje) {
        if (sabeVolar){
            System.out.println("Lanzando un papelito que dice:" + mensaje);
        }
    }
}
