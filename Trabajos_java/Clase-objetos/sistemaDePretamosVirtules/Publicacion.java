package sistemaDePretamosVirtules;

import personas.Persona1;

import java.time.LocalDate;

public abstract class Publicacion {
    private String titulo;
    private String autor;
    private LocalDate anioPublicacion;
    private int stock;

    public Publicacion(int stock, String autor, String titulo, LocalDate anioPublicacion) {
        this.stock = stock;
        this.autor = autor;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(LocalDate anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
