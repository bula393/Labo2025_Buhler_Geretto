    package sistemaOng;

    import java.time.LocalDate;

    public class VoluntarioExterno extends Voluntario{
        public VoluntarioExterno(String nombre, String apellido, LocalDate fechaNacimiento, int direccion, int codigopostal, boolean contribuyente) {
            super(nombre, apellido, fechaNacimiento, direccion, codigopostal, contribuyente);
        }
    }
