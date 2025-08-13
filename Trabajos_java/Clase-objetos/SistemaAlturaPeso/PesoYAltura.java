package SistemaAlturaPeso;

import java.time.LocalDate;
import java.util.HashMap;

public class PesoYAltura {
    private int peso;
    private int altura;

    public PesoYAltura(int peso, int altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void set(int altura,int peso){
        this.setPeso(peso);
        this.setAltura(altura);
    }
}
