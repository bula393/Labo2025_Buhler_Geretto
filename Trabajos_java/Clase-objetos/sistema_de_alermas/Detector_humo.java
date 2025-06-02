package sistema_de_alermas;

import java.time.LocalDate;

public class Detector_humo extends Dispocitivo{
    public Detector_humo(boolean prendido, int medida, LocalDate año_de_publicacion, int umbral_incial) {
        super(prendido, medida, año_de_publicacion, umbral_incial);
    }

    @Override
    public String imprimir() {
        return "llamada a los bomberos";
    }
}
