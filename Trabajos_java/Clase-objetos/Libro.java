public class Libro {
    private String titulo;
    private persona autor;
    private int ISBN;
    private String editorial;
    private fecha fecha_publicacion;
    private int paginas;


    public Libro(String Titulo, persona Autor, int iSBN, String Editorial, fecha Fecha_publicacion, int Paginas) {
        titulo = Titulo;
        autor = Autor;
        ISBN = iSBN;
        editorial = Editorial;
        fecha_publicacion = Fecha_publicacion;
        paginas = Paginas;
    }

    public Libro(String Titulo, persona Autor, int iSBN, fecha Fecha_publicacion, int Paginas) {
        titulo = Titulo;
        autor = Autor;
        ISBN = iSBN;
        editorial = "santiallana";
        fecha_publicacion = Fecha_publicacion;
        paginas = Paginas;
    }

    public Libro() {
        titulo = "harry potter";
        autor.setNombre("jj rowling");
        autor.setEdad(68);
        autor.setDireccion("inlaterra");
        ISBN = 1000005;
        editorial = "enland_potter";
        fecha_publicacion.setAnio(1985);
        fecha_publicacion.setMes(8);
        fecha_publicacion.setDia(25);
        paginas = 653;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public persona getAutor() {
        return autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public fecha getFecha_publicacion() {
        return fecha_publicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setFecha_publicacion(fecha fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public void setAutor(persona autor) {
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

    public void publicado_antes(Libro libro1, Libro libro2) {
        System.out.println(libro1.getTitulo());
        fecha_publicacion.menorQue(libro1.getFecha_publicacion(), libro2.getFecha_publicacion());
        System.out.println(libro2.getTitulo());

    }


    public static void main(String[] args) {
            persona autor1 = new persona("Gabriel García Márquez", 87, "Colombia");
            fecha fecha1 = new fecha(1967, 5, 30);


            Libro libro1 = new Libro("Cien Años de Soledad", autor1, 123456, "Sudamericana", fecha1, 417);
            Libro libro2 = new Libro();

            System.out.println("=== Libro 1 ===");
            libro1.mostrar(); // ✅
            System.out.println("\n=== Libro 2 ===");
            libro2.mostrar(); // ✅

            System.out.println("\n=== Comparación de Publicación ===");
            libro1.publicado_antes(libro1, libro2); // ✅

        }


    }







