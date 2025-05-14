package objetos;

import random.Fecha;
import personas.Persona;

import java.time.LocalDate;

public class Libro {
    private String titulo;
    private Persona autor;
    private int ISBN;
    private String editorial;
    private Fecha fecha_publicacion;
    private int paginas;


    public Libro(String Titulo, Persona Autor, int iSBN, String Editorial, Fecha Fecha_publicacion, int Paginas) {
        titulo = Titulo;
        autor = Autor;
        ISBN = iSBN;
        editorial = Editorial;
        fecha_publicacion = Fecha_publicacion;
        paginas = Paginas;
    }

    public Libro(String Titulo, Persona Autor, int iSBN, Fecha Fecha_publicacion, int Paginas) {
        titulo = Titulo;
        autor = Autor;
        ISBN = iSBN;
        editorial = "santiallana";
        fecha_publicacion = Fecha_publicacion;
        paginas = Paginas;
    }

    public Libro() {
        Persona Autor = new Persona("jj rowling","inlaterra", LocalDate.now());
        titulo = "harry potter";
        autor = Autor;
        ISBN = 1000005;
        editorial = "enland_potter";
        Fecha f1 = new Fecha(25,8,1985);
        fecha_publicacion = f1;
        paginas = 653;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public Fecha getFecha_publicacion() {
        return fecha_publicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setFecha_publicacion(Fecha fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void mostrar() {
        System.out.println("Titulo:" + titulo);
        System.out.println("IBSN:" + ISBN);
        System.out.print("fecha de publicacion");
        fecha_publicacion.corta();
        System.out.print("autor:");
        autor.mostrar_datos();
        System.out.println("editorial:" + editorial);
        System.out.println("Paginas:" + paginas);
    }

    public void publicado_antes( Libro libro2) {
        System.out.println("la fecha de publicacion de " + this.getTitulo());
        this.fecha_publicacion.menorQue(this.getFecha_publicacion(), libro2.getFecha_publicacion());
        System.out.println(libro2.getTitulo());

    }


    public static void main(String[] args) {
            Persona autor1 = new Persona("Gabriel García Márquez",  "Colombia", LocalDate.now());
            Fecha fecha1 = new Fecha(1967, 5, 30);


            Libro libro1 = new Libro("Cien Años de Soledad", autor1, 123456, "Sudamericana", fecha1, 417);
            Libro libro2 = new Libro();

            System.out.println("=== objetos.Libro 1 ===");
            libro1.mostrar(); // ✅
            System.out.println("\n=== objetos.Libro 2 ===");
            libro2.mostrar(); // ✅

            System.out.println("\n=== Comparación de Publicación ===");
            libro1.publicado_antes(libro2); // ✅

        }


    }







