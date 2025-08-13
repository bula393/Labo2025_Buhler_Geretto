package sistemaCalorias;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class Familia {
    private HashSet<Pariente> parientes;

    public Familia(HashSet<Pariente> parientes) {
        this.parientes = parientes;
    }

    public HashSet<Pariente> getParientes() {
        return parientes;
    }

    public void setParientes(HashSet<Pariente> parientes) {
        this.parientes = parientes;
    }
    public int promedioCalorias(){
        int promedio = 0;
        for (Pariente pariente : parientes){
            promedio += pariente.caliriasConsumidad();
        }
        return promedio/parientes.size();
    }

    public Pariente PersonaMasCalorias (){
        Pariente Gordo = new Pariente(LocalDate.now(),"",new ArrayList<>());
        for (Pariente pariente : parientes) {
            if(pariente.caliriasConsumidad()>Gordo.caliriasConsumidad()){
                Gordo = pariente;
            }
        }
        return Gordo;
    }

public Pariente PersonaMenosCalorias (){
    Pariente flaco = new Pariente(LocalDate.now(),"",new ArrayList<>());
    for (Pariente pariente : parientes) {
        if(pariente.caliriasConsumidad()>flaco.caliriasConsumidad()){
            flaco = pariente;
        }
    }
    return flaco;
    }
}
    
