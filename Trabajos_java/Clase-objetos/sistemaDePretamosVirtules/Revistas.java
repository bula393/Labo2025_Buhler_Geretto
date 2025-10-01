package sistemaDePretamosVirtules;

import java.time.LocalDate;

public class Revistas extends Publicacion implements PrestamoInterface{
    private static int multa = 3500;
    private String nombreDistribuidor;

    public Revistas(int stock, String autor, String titulo, LocalDate anioPublicacion, String nombreDistribuidor) {
        super(stock, autor, titulo, anioPublicacion);
        this.nombreDistribuidor = nombreDistribuidor;
    }

    public String getNombreDistribuidor() {
        return nombreDistribuidor;
    }

    public void setNombreDistribuidor(String nombreDistribuidor) {
        this.nombreDistribuidor = nombreDistribuidor;
    }
    @Override
    public Prestamo darPrestamo(int numeroSocio) {
        return new Prestamo(this,numeroSocio,LocalDate.now(),LocalDate.now().plusDays(15) );
    }

    @Override
    public int calculoMulta() {
        return multa;
    }
}
