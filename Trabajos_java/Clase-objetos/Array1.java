import personas.Persona;

import java.util.ArrayList;

public class Array1 {

    public static void main(String[] args) {
        char letra = 'f';
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<String> palabras = new ArrayList<String>();
        ArrayList<Persona> personas = new ArrayList<Persona>();

        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);

        palabras.add("Freddy");
        palabras.add("Bonnie");
        palabras.add("Chica");
        palabras.add("Foxy");

        personas.add(new Persona ("Freddy Fazbear",35,"Samudio 4080"));
        personas.add(new Persona ("Chica the Chicken",9,"Samudio 4080"));
        personas.add(new Persona ("Bonnie the Bunny",50,"Samudio 4080"));
        personas.add(new Persona ("Foxy the Pirate",19,"Samudio 4080"));


        System.out.println("Palabras que empiezan con '" + letra + "':");
        for (String palabra : palabras){
            if (palabra.toLowerCase().charAt(0) == letra) {
                System.out.println(palabra);
            }
        }

        int resultado = 0;
        for (int numero : numeros){
            resultado += numero;
        }
        System.out.println("Resultado: " + resultado);

        for (Persona persona : personas){
            if (persona.getEdad()>30){
                persona.mostrar_datos();
            }
        }
    }
}





