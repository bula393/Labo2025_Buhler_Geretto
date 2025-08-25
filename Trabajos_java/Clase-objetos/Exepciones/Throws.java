package Exepciones;

public class Throws {

        public static int exepcion(String nombre) throws NullPointerException{
            return nombre.length();
        }

        public static void main(String[] args) {
            String nombre = null;
            try {
                Throws.exepcion(nombre);
            }
            catch (NullPointerException e){
                System.out.println("no se puede imprimir un nombre vacio " + e);
            }
            finally {
                System.out.println("hecho buhler");
            }
        }

}
