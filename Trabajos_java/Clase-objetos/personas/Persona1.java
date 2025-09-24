package personas;

import java.time.LocalDate;

public class Persona1 {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int dni;
    private int direccion;
    private int codigopostal;
    private String localidad;

    public Persona1(String nombre, String localidad, LocalDate fechaNacimiento, String apellido) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.fechaNacimiento = fechaNacimiento;
        this.apellido = apellido;
    }

    public Persona1(String nombre, String apellido, LocalDate fechaNacimiento, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public Persona1(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona1(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona1(String nombre, String apellido, LocalDate fechaNacimiento, int direccion, int codigopostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.codigopostal = codigopostal;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public int getCodigopostal() {
        return codigopostal;
    }

    public void setCodigopostal(int codigopostal) {
        this.codigopostal = codigopostal;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
