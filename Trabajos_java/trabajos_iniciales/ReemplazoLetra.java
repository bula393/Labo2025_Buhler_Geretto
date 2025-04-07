import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        String frase = "Ayer me compré muñecos de la marca ‘ToyCo’ por internet." ;
        System.out.println("ingrese una letra");
        char Letra = x.nextLine().charAt(0);
        frase = frase.replace('e', Letra);
        System.out.println(frase);
    }

}
