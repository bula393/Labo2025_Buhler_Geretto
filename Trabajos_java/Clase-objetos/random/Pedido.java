package random;

import enums.Estado;
import objetos.Plato;
import personas.Persona;
import personas.Persona1;
import personas.Profesor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pedido {
    LocalDate fecha_creacion;
    ArrayList<Plato> platos;
    Persona1 solicitante;
    LocalTime hora_entrega;
    Estado estado;

    public Pedido(LocalDate fecha_creacion, Estado estado, LocalTime hora_entrega, Persona1 solicitante, ArrayList<Plato> plato_pedido) {
        this.fecha_creacion = fecha_creacion;
        this.estado = estado;
        this.hora_entrega = hora_entrega;
        this.solicitante = solicitante;
        this.platos = plato_pedido;
    }
    public Pedido() {
        this.fecha_creacion = LocalDate.now();
        this.estado = Estado.ENTREGADO;
        this.hora_entrega = LocalTime.now();
        this.solicitante = new Persona1();
        this.platos = new ArrayList<>();
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlato_pedido(ArrayList plato_pedido) {
        this.platos = plato_pedido;
    }

    public Persona1 getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona1 solicitante) {
        this.solicitante = solicitante;
    }

    public LocalTime getHora_entrega() {
        return hora_entrega;
    }

    public void setHora_entrega(LocalTime hora_entrega) {
        this.hora_entrega = hora_entrega;
    }

    public Estado getEntregado() {
        return estado;
    }

    public void setEntregado(Estado estado) {
        this.estado = estado;
    }
    public void addPlato(Plato plato){
        this.platos.add(plato);
    }
    public void bajaplato(Plato plato){
        this.platos.remove(plato);
    }
    public void modificarplato(Plato plato_viejo,Plato platonuevo){
        this.bajaplato(plato_viejo);
        this.addPlato(platonuevo);
    }

}

