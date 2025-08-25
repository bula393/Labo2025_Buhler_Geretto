package sistema_de_alermas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaAlarma {
    ArrayList<Dispocitivo> sensores;
    public SistemaAlarma(){
        this.sensores = new ArrayList<>();
    }
    public void addsensor(Dispocitivo d){
        sensores.add(d);
    }
    public Dispocitivo mostrarSensor(int i) throws CantidadNODisponible{
        if (i>=0 &&  i<sensores.size()){
            return sensores.get(i);
        }
        else {
            throw new CantidadNODisponible("indice no disponiblr");
        }
    }
    public static void main(String[] args) {
        Sensor_precion prec = new Sensor_precion(false, 75, LocalDate.of(2018, 3, 10), 20);
        Detector_humo humo = new Detector_humo(true, 100, LocalDate.of(2022, 7, 1), 15);
        Sensor_temperatura temp = new Sensor_temperatura(true, 10, LocalDate.of(2022, 7, 1), 15);
        System.out.println(humo.superarUmbral());
        System.out.println(prec.superarUmbral());
        System.out.println(temp.superarUmbral());
        SensorCompuesto c1 = new SensorCompuesto(true,LocalDate.of(2022, 7, 1),prec,temp,humo);
        SistemaAlarma s1 = new SistemaAlarma();
        s1.addsensor(prec);
        s1.addsensor(temp);
        s1.addsensor(humo);
        Scanner sc1 = new Scanner(System.in);
        try {

            System.out.println(s1.mostrarSensor(sc1.nextInt()).imprimir());
        }
        catch (InputMismatchException e){
            System.out.println("no se ingreso un entero");
        }
        catch (CantidadNODisponible c){
            System.out.println(c);
            c.printStackTrace();
        }
    }
}
