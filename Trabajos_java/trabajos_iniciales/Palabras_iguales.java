import java.util.Scanner;

public class Palabras_iguales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la palabra: ");
        String palabra = sc.nextLine();
        System.out.println("Ingrese otra palabra: ");
        String palabra2 = sc.nextLine();
        if (palabra.equals(palabra2)) {
            System.out.println("Las palabras son iguales");
        }
        else {
            System.out.println("Las palabras no iguales");
        }
    }
}
