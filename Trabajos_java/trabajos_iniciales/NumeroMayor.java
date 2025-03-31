import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("ingrese valor 1");
        int value1=x.nextInt();
        System.out.println("ingrese valor 2");
        int value2=x.nextInt();
        if (value1<value2){
            System.out.println("el " + value2 + " es mayor al " + value1 );
        }
        else if (value1>value2){
            System.out.println("el " + value1 + " es mayor al " + value2 );
        }
        else {
            System.out.println("los valores ingresados son iguales");
        }
    }
}
