package Exepciones;

public class Throw {
    public static void exepcion(){
        try{
            String nombre = null;
            if (nombre == null){
                throw new NullPointerException("el nombre esta vacio");
            }
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        exepcion();
    }
}
