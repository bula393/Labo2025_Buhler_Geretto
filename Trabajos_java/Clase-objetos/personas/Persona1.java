package personas;

public class Persona1 {
    String nombre;
    String apellido;

    public Persona1(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona1() {
        this.nombre = "mateo";
        this.apellido = "falcon";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
