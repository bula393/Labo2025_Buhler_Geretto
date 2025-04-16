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
        autor.setNombre("");
        autor.setDireccion("");;
    }
    public Cancion(String titulo, Persona autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public static void main(String[] args) {
        Cancion c1 = new Cancion();
        Persona autor1 = new Persona("Ceratti",95,"Argentina");
        Cancion c2 = new Cancion("adios",autor1);
    }
}
