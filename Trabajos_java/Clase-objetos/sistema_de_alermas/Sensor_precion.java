package sistema_de_alermas;

import java.time.LocalDate;

public class Sensor_precion extends Dispocitivo{
    public Sensor_precion(boolean prendido, int medida, LocalDate año_de_publicacion, int umbral_incial) {
        super(prendido, medida, año_de_publicacion, umbral_incial);
    }

    @Override
    public String imprimir() {
        return "Sensor de presión activado";
    }
}
