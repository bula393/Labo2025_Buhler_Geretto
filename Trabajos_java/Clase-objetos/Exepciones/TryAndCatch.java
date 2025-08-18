package Exepciones;

public class TryAndCatch {
    public static void main(String[] args) {
        String nombre = null;
        try {
            System.out.println("El largo del nombre es:" + nombre.length());
        } catch (NullPointerException e){
            System.out.println("El nombre esta vacio");
            System.out.println(e);
        }
    }
}
