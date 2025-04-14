public class Cancion {
    String titulo;
    persona autor;

    public persona getAutor() {
        return autor;
    }

    public void setAutor(persona autor) {
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
    public Cancion(String titulo, persona autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public static void main(String[] args) {
        Cancion c1 = new Cancion();
        persona autor1 = new persona("Ceratti",95,"Argentina");
        Cancion c2 = new Cancion("adios",autor1);
    }
}
