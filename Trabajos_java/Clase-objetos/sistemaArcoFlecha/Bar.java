package sistemaArcoFlecha;

import java.util.HashSet;
import java.util.concurrent.DelayQueue;

public class Bar {
    private HashSet<Diana> dianas;
    private int cantClientes;
    private Double dineroRecaudado;
    private HashSet<Beneficio> beneficio;
    private HashSet<BeneficioGC> beneficioAcumulados;

    public Bar(HashSet<Diana> dianas, HashSet<Beneficio> beneficio, HashSet<BeneficioGC> beneficioAcumulados, Double dineroRecaudado, int cantClientes) {
        this.dianas = dianas;
        this.beneficio = beneficio;
        this.beneficioAcumulados = beneficioAcumulados;
        this.dineroRecaudado = dineroRecaudado;
        this.cantClientes = cantClientes;
    }

    public HashSet<Diana> getDianas() {
        return dianas;
    }

    public void setDianas(HashSet<Diana> dianas) {
        this.dianas = dianas;
    }

    public int getCantClientes() {
        return cantClientes;
    }

    public void setCantClientes(int cantClientes) {
        this.cantClientes = cantClientes;
    }

    public Double getDineroRecaudado() {
        return dineroRecaudado;
    }

    public int cantBeneficios(){
        return beneficio.size()-beneficioAcumulados.size();
    }

    public void setDineroRecaudado(Double dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }

    public HashSet<Beneficio> getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(HashSet<Beneficio> beneficio) {
        this.beneficio = beneficio;
    }

    public HashSet<BeneficioGC> getBeneficioAcumulados() {
        return beneficioAcumulados;
    }

    public void setBeneficioAcumulados(HashSet<BeneficioGC> beneficioAcumulados) {
        this.beneficioAcumulados = beneficioAcumulados;
    }

    public void addBeneficio(Beneficio b){
        beneficio.add(b);
        if (b instanceof BeneficioGC){
            beneficioAcumulados.add((BeneficioGC) b);
        }
    }
}
