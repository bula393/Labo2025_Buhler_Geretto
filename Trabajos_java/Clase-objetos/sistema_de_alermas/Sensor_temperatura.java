package sistema_de_alermas;

import java.time.LocalDate;

public class Sensor_temperatura extends Dispocitivo{
    public Sensor_temperatura(boolean prendido, int medida, LocalDate año_de_publicacion, int umbral_incial) {
        super(prendido, medida, año_de_publicacion, umbral_incial);
    }

    @Override
    public String imprimir() {
        return  "¡Cuidado! La temperatura sube";
    }
}
