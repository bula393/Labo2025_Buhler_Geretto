package sistemaDePretamosVirtules;

import java.time.LocalDate;

public class AudioLibro extends Publicacion{
    private int duracionEnMin;
    private int pesoEnMb;

    public AudioLibro(int stock, String autor, String titulo, LocalDate anioPublicacion, int duracionEnMin, int pesoEnMb) {
        super(stock, autor, titulo, anioPublicacion);
        this.duracionEnMin = duracionEnMin;
        this.pesoEnMb = pesoEnMb;
    }

    public int getDuracionEnMin() {
        return duracionEnMin;
    }

    public void setDuracionEnMin(int duracionEnMin) {
        this.duracionEnMin = duracionEnMin;
    }

    public int getPesoEnMb() {
        return pesoEnMb;
    }

    public void setPesoEnMb(int pesoEnMb) {
        this.pesoEnMb = pesoEnMb;
    }
}
