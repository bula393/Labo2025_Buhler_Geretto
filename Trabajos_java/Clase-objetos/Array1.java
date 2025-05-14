import personas.Persona;

import java.time.LocalDate;
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

        personas.add(new Persona ("Freddy Fazbear","35", LocalDate.now()));
        personas.add(new Persona ("Freddy Fazbear","35", LocalDate.now()));
        personas.add(new Persona ("Freddy Fazbear","35", LocalDate.now()));
        personas.add(new Persona ("Freddy Fazbear","35", LocalDate.now()));



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
            if (persona.calculaEdad()>30){
                persona.mostrar_datos();
            }
        }
    }
}





