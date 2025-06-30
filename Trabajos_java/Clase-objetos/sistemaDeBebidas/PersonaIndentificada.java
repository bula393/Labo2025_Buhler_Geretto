package sistemaDeBebidas;

import personas.Persona1;
import sistema_de_recetas.Tipo;

import java.util.ArrayList;

public class PersonaIndentificada extends Persona1 {
    private int dni;
    private ArrayList<Bebida_cantidad> bebidas;

    public PersonaIndentificada(String nombre, String apellido, int dni, ArrayList<Bebida_cantidad> bebidas) {
        super(nombre, apellido);
        this.dni = dni;
        this.bebidas = bebidas;
    }


    public int coficienteHidratacion(){
        int coficienteTotal = 0;
        for (Bebida_cantidad bebida_cantidad : bebidas){
            coficienteTotal += bebida_cantidad.getCantidad() * (bebida_cantidad.getBebida().getPositividad() - bebida_cantidad.getBebida().getNegatividad());
        }
        return coficienteTotal;
    }
    public void eligirBebida(Bebida bebida, int cantidad){
            bebidas.add(new Bebida_cantidad(bebida,cantidad));
        }
    }

