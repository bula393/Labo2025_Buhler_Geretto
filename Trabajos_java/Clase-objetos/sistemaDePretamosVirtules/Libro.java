package sistemaDePretamosVirtules;

import java.time.LocalDate;

public class Libro extends Publicacion implements PrestamoInterface {
    private static int multa = 7500;
    private boolean tieneSaga;

    public Libro(int stock, String autor, String titulo, LocalDate anioPublicacion, boolean tieneSaga) {
        super(stock, autor, titulo, anioPublicacion);
        this.tieneSaga = tieneSaga;
    }

    public boolean isTieneSaga() {
        return tieneSaga;
    }

    public void setTieneSaga(boolean tieneSaga) {
        this.tieneSaga = tieneSaga;
    }

    @Override
    public Prestamo darPrestamo(int numeroSocio) {
        if (this.getAnioPublicacion().getYear()<2020){
            return new Prestamo(this,numeroSocio,LocalDate.now(),LocalDate.now().plusDays(15) );
        }
        else {
            return new Prestamo(this,numeroSocio,LocalDate.now(),LocalDate.now().plusDays(3) );
        }
    }
    @Override
    public int calculoMulta() {
        return multa;
    }
}
