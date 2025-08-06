package pago_empleados;

import java.util.HashMap;
import java.util.Map;

public class Diseñador {
    private String nombre;
    private Tipo_diseñador tipo;
    private HashMap<Proyecto,Double> proyectos;

    public Diseñador(String nombre, Tipo_diseñador tipo, HashMap<Proyecto, Double> proyectos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.proyectos = proyectos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo_diseñador getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_diseñador tipo) {
        this.tipo = tipo;
    }

    public HashMap<Proyecto, Double> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashMap<Proyecto, Double> proyectos) {
        this.proyectos = proyectos;
    }
    public double getSueldo(){
        double sueldo = 0;
        for (Double precio : proyectos.values()){
            sueldo=+precio;
        }
        return sueldo;
    }
    public int get_cantproyectos(){
        return proyectos.size();
    }
    public void mostrarProyectos(){
        for (Map.Entry<Proyecto,Double> entrada : proyectos.entrySet()){
            Proyecto proyectoActual = entrada.getKey();
            double ganado = entrada.getValue();
            System.out.println("El nombre del preyecto en " + proyectoActual.getNombre());
            System.out.println("se gano " + proyectoActual.getGanancia());
            System.out.println("se gano una comicion de" + ganado + "que representa el " + (ganado*100/proyectoActual.getGanancia()) + " del total ganado en el proyecto");
        }
    }

}
