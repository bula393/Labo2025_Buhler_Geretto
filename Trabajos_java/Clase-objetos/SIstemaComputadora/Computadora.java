package SIstemaComputadora;

import java.util.ArrayList;

public class Computadora {
    Cpu cpu;
    ArrayList<Entrada> disp_entrada;
    ArrayList<Salida> disp_salida;

    public Computadora(Cpu cpu, ArrayList<Entrada> disp_entrada, ArrayList<Salida> disp_salida) throws FaltaComponente {
        if (cpu==null || disp_entrada == null || disp_entrada == null){
            throw new FaltaComponente("No puede faltar uno de los componentes");
        }
        this.cpu = cpu;
        this.disp_entrada = disp_entrada;
        this.disp_salida = disp_salida;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public ArrayList<Entrada> getDisp_entrada() {
        return disp_entrada;
    }

    public void setDisp_entrada(ArrayList<Entrada> disp_entrada) {
        this.disp_entrada = disp_entrada;
    }

    public ArrayList<Salida> getDisp_salida() {
        return disp_salida;
    }

    public void setDisp_salida(ArrayList<Salida> disp_salida) {
        this.disp_salida = disp_salida;
    }
}
