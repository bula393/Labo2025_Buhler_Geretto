package sistemaDePretamosVirtules;

import java.time.LocalDate;

public class Prestamo {
    private PrestamoInterface articulo;
    private int numeroSocio;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevulucion;

    public Prestamo(PrestamoInterface articulo, int numeroSocio, LocalDate fechaPrestamo, LocalDate fechaDevulucion) {
        this.articulo = articulo;
        this.numeroSocio = numeroSocio;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevulucion = fechaDevulucion;
    }

    public PrestamoInterface getArticulo() {
        return articulo;
    }

    public void setArticulo(PrestamoInterface articulo) {
        this.articulo = articulo;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public LocalDate getFechaDevulucion() {
        return fechaDevulucion;
    }

    public void setFechaDevulucion(LocalDate fechaDevulucion) {
        this.fechaDevulucion = fechaDevulucion;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public boolean validarPrestamo(){
        return LocalDate.now() > fechaDevulucion;
    }
}
