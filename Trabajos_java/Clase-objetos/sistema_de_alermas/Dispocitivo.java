package sistema_de_alermas;

import java.time.LocalDate;

public abstract class Dispocitivo {
    private boolean prendido;
    private int medida;
    private int umbral_incial;
    private LocalDate año_de_publicacion;

    public Dispocitivo(boolean prendido,LocalDate año_de_publicacion) {
        this.prendido = prendido;
        this.medida = medida;
        this.año_de_publicacion = año_de_publicacion;
        this.umbral_incial = umbral_incial;
    }
    public Dispocitivo(boolean prendido, int medida, LocalDate año_de_publicacion, int umbral_incial) {
        this.prendido = prendido;
        this.medida = medida;
        this.año_de_publicacion = año_de_publicacion;
        this.umbral_incial = umbral_incial;
    }

    public boolean getprendido() {
        return prendido;
    }

    public void setprendido(boolean prendido) {
        this.prendido = prendido;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public int getUmbral_incial() {
        return umbral_incial;
    }

    public void setUmbral_incial(int umbral_incial) {
        this.umbral_incial = umbral_incial;
    }

    public LocalDate getAño_de_publicacion() {
        return año_de_publicacion;
    }

    public void setAño_de_publicacion(LocalDate año_de_publicacion) {
        this.año_de_publicacion = año_de_publicacion;
    }
    public String superarUmbral(){
        if (prendido && medida>umbral_incial){
           return this.imprimir();
        }
        return "";
    }
    abstract String imprimir();
}
