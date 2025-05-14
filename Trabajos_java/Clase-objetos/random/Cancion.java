package random;

import personas.Persona;

import java.time.LocalDate;

public class Cancion {
    String titulo;
    Persona autor;

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Cancion(){
        this.titulo = "";
        autor = new Persona("","", LocalDate.now());
    }
    public Cancion(String titulo, Persona autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void mostrar(){
        System.out.println("titulo: " + this.titulo);
        this.autor.mostrar_datos();
    }

    public static void main(String[] args) {
        Cancion c1 = new Cancion();
        Persona autor1 = new Persona("Ceratti","Argentina", LocalDate.now());
        Cancion c2 = new Cancion("adios",autor1);
    }
}
