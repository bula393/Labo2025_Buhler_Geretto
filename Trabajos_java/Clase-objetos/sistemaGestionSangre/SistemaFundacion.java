package sistemaGestionSangre;

import java.util.HashMap;
import java.util.HashSet;

public class SistemaFundacion {
    private HashMap<CalificadosTratamiento,Integer> calificados;
    private HashSet<Paciente> pacientes;

    public SistemaFundacion(HashMap<CalificadosTratamiento,Integer> calificados, HashSet<Paciente> pacientes) {
        this.calificados = calificados;
        this.pacientes = pacientes;
    }

    public HashMap<CalificadosTratamiento,Integer> getCalificados() {
        return calificados;
    }

    public void setCalificados(HashMap<CalificadosTratamiento,Integer> calificados) {
        this.calificados = calificados;
    }

    public HashSet<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(HashSet<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    public void addPaciente(Paciente p)  {
        pacientes.add(p);

    }
    public void addPaciente(Paciente p,int cantDIas)  {
        pacientes.add(p);
        if (p instanceof CalificadosTratamiento){
            calificados.put((CalificadosTratamiento) p,cantDIas);
        }
    }


    public int cantPAcientesNoTratamiento(){
        return pacientes.size() - calificados.size();
    }
    public void ejecutarTratamientoDIatios(){
        for (CalificadosTratamiento c : calificados.keySet()){
            calificados.put(c,calificados.get(c)+1);
        }
    }
    public static void main(String[] args) {

    }
}
