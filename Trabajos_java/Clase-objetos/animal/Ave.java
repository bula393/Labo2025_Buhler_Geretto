package animal;

import sistema_de_alermas.Dispocitivo;

public class Ave {
    private String nombre;
    private String especie;
    private String color;

    public Ave(String nombre, String especie, String color) {
        this.nombre = nombre;
        this.especie = especie;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
