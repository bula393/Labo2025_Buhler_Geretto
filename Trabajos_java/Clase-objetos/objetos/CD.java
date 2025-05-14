package objetos;

import random.Cancion;
import personas.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class CD {

    ArrayList<Cancion> albun;

    public CD() {
        this.albun = new ArrayList<Cancion>();
        this.albun.add(new Cancion("como ali",new Persona("ciro","libertador", LocalDate.now())));
        this.albun.add(new Cancion("san jauleche",new Persona("ciro","libertador", LocalDate.now())));
        this.albun.add(new Cancion("tan solo",new Persona("ciro","libertador", LocalDate.now())));
        this.albun.add(new Cancion("globalizacion",new Persona("ciro","libertador", LocalDate.now())));
    }

    public ArrayList<Cancion> getAlbun() {
        return albun;
    }

    public void setAlbun(ArrayList<Cancion> albun) {
        this.albun = albun;
    }
    public int numeroCanciones(){
        return this.albun.size();
    }
    public Cancion verCancion(int posicion){
        return this.albun.get(posicion);
    }
    public  void grabaCancion(int posicion, Cancion nuevaCancion){
        this.albun.set(posicion,nuevaCancion);
    }
    public  void agrega(Cancion cancion){
        this.albun.add(cancion);
    }
    public void elimina(int posicion){
        this.albun.remove(posicion);
    }

    public void mostrar(){

        for (Cancion cancion : this.albun){
            System.out.println("----------------------------------------------");
            cancion.mostrar();
            System.out.println("----------------------------------------------");
        }

    }

    public static void main(String[] args) {
        CD cd = new CD();
        System.out.println("El tamaño del array es" + cd.numeroCanciones());
        cd.verCancion(2).mostrar();
        System.out.println("inicial:");
        cd.mostrar();
        cd.grabaCancion(3,new Cancion());
        System.out.println("Grabado:");
        cd.mostrar();
        System.out.println("agregado:");
        cd.agrega(new Cancion("farolito",new Persona("ciro","libertador", LocalDate.now())));
        cd.mostrar();
        cd.elimina(1);
        System.out.println("eliminado:");
        cd.mostrar();
    }
}

