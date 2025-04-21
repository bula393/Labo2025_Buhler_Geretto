import java.util.ArrayList;

public class Materia {
    String nombre;
    ArrayList<String> listaDeContenidos;
    ArrayList<Alumno> alumnosInscriptos;

    public Materia(ArrayList<Alumno> alumnosInscriptos, String nombre) {
        this.alumnosInscriptos = alumnosInscriptos;
        this.nombre = nombre;
        this.listaDeContenidos = new ArrayList<String>();
        this.listaDeContenidos.add("algebra");
        this.listaDeContenidos.add("geometrica");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getListaDeContenidos() {
        return listaDeContenidos;
    }

    public void setListaDeContenidos(ArrayList<String> listaDeContenidos) {
        this.listaDeContenidos = listaDeContenidos;
    }

    public ArrayList<Alumno> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public void setAlumnosInscriptos(ArrayList<Alumno> alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }


}
