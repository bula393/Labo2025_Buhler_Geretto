package sistema_de_alermas;

import java.time.LocalDate;

public class SistemaAlarma {
    public static void main(String[] args) {
        Sensor_precion prec = new Sensor_precion(false, 75, LocalDate.of(2018, 3, 10), 20);
        Detector_humo humo = new Detector_humo(true, 100, LocalDate.of(2022, 7, 1), 15);
        Sensor_temperatura temp = new Sensor_temperatura(true, 10, LocalDate.of(2022, 7, 1), 15);
        System.out.println(humo.superarUmbral());
        System.out.println(prec.superarUmbral());
        System.out.println(temp.superarUmbral());
        SensorCompuesto c1 = new SensorCompuesto(true,LocalDate.of(2022, 7, 1),prec,temp,humo);


    }
}
