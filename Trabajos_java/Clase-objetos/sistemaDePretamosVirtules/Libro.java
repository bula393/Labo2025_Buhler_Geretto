package sistemaDePretamosVirtules;

import java.time.LocalDate;

public class Libro extends Publicacion{
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
}
