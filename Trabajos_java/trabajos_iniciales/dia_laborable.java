import java.util.Scanner;

public class dia_laborable {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("un dia para saber si es laborable");
        String Dia =x.nextLine();
        Dia=Dia.toLowerCase();
        if ((Dia.equals("lunes"))||(Dia.equals("martes"))||(Dia.equals("miercoles"))||(Dia.equals("jueves"))||(Dia.equals("viernes"))) {
            System.out.println("Dia laborable");
        }
         else if ((Dia.equals("domingo") )||( Dia.equals("sabado")) ) {
             System.out.println("Dia no laborable");
        }
         else {
             System.out.println("no es un dia");
        }
    }
}
