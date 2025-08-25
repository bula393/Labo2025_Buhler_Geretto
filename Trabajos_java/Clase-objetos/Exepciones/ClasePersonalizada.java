package Exepciones;

public class ClasePersonalizada {
    public static int largoMensaje(String mensaje) throws Vacio {
        if (mensaje != null){
            return mensaje.length();
        }
        else {
            throw new Vacio("no hay ningun contenido en el string");
        }
    }

    public static void main(String[] args) {
        String mensaje = " ";
        try {
            System.out.println( ClasePersonalizada.largoMensaje(mensaje));
        }
        catch (Vacio e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
