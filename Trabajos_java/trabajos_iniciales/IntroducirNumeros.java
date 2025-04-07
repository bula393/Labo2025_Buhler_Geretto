import java.util.Scanner;
public class IntroducirNumeros {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int total = 0;
        int totalp = 0;
        int totaln = 0;
        System.out.println("Introduce el numero, para salir ingrese -1 ");
        int numero = x.nextInt();
        int contador = 0;
        while (numero != -1) {
            contador++;
            total += numero;
            if (numero > 0) {
                totalp += numero;
            }
            else if (numero < 0) {
                totaln += numero;
            }
            numero = x.nextInt();
        }
        System.out.println("La cantidad de numeros ingresada fue: " + contador);
        System.out.println("la suma de todos los numeros ingresados es: " + total);
        System.out.println("la suma de todos los  positivos ingresados es: " + totalp);
        System.out.println("la suma de todos los  negativos ingresados es: " + totaln);
    }
}
