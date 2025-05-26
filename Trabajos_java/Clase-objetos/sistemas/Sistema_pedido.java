package sistemas;

import objetos.Plato;
import personas.Profesor;
import random.Pedido;

import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema_pedido {
    ArrayList<Pedido>pedidos;

    public Sistema_pedido(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    public ArrayList<Plato> listado_diario(){
        ArrayList<Plato> Platos_dia=new ArrayList<>();
        for (Pedido pedido: pedidos){
            if (pedido.getFecha_creacion().equals(LocalDate.now())){
                for (Plato plato : pedido.getPlatos()){
                    if (pedido.getSolicitante() instanceof Profesor){
                        plato.setPrecio(plato.getPrecio()- plato.getPrecio()*((Profesor) pedido.getSolicitante()).getPorcentaje_descuento()/100);
                    }
                    Platos_dia.add(plato);
                }
            }
        }
        return Platos_dia;
    }
    public ArrayList<Plato> TOP3platos(){
        boolean swapped;
        ArrayList<Plato> todos_platos=new ArrayList<>();
        ArrayList<Integer> cant_platos=new ArrayList<>();
        ArrayList<Plato> top3 = new ArrayList<>();
        for(Pedido pedido : this.pedidos){
            for (Plato plato : pedido.getPlatos()){
                if (todos_platos.contains(plato)){
                    for (int i = 0; i < todos_platos.size(); i++) {
                        if (todos_platos.get(i).equals(plato)){
                            cant_platos.set(i,cant_platos.get(i)+1);
                        }
                    }
                }
                else {
                    todos_platos.add(plato);
                    cant_platos.add(1);
                }
            }

        }
        for (int i = 0; i < cant_platos.size(); i++) {
            swapped = false;
            for (int j = 0; j < cant_platos.size() - i - 1; j++) {
                if (cant_platos.get(j) < cant_platos.get(j + 1)) {

                    Integer temp = cant_platos.get(j);
                    Plato tempPlato = todos_platos.get(j);
                    todos_platos.set(j,todos_platos.get(j+1));
                    cant_platos.set(j,cant_platos.get(j+1));
                    todos_platos.set(j+1,tempPlato);
                    cant_platos.set(j+1,temp);
                    swapped = true;
                }
            }
            if (!swapped) { // Si no hubo intercambios, la lista está ordenada
                break;
            }
        }
        for (int i = 0; i < 3; i++) {
            top3.add(todos_platos.get(i));
        }
        return top3;
    }
}
