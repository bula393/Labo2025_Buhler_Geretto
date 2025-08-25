package Exepciones;

public class Throw {
    public static void exepcion(){
        try{
            String nombre = null;
            if (nombre == null){
                throw new NullPointerException("el nombre esta vacio");
            }
            System.out.println(nombre.length());
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        finally {
            System.out.println("hecho buhler");
        }
    }

    public static void main(String[] args) {
        exepcion();
    }
}
