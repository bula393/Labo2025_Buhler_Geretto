import random.Fecha;
import random.Persona;

import java.util.ArrayList;

public class Alumno {
    String nombre;
    String apellido;
    Fecha fecha_nacimiento;
    ArrayList<Nota> lista_notas;

    public Alumno(String nombre, String apellido, Fecha fecha_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.lista_notas = new ArrayList<Nota>();
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

    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public ArrayList<Nota> getLista_notas() {
        return lista_notas;
    }

    public void setLista_notas(ArrayList<Nota> lista_notas) {
        this.lista_notas = lista_notas;
    }

    public void agregarNota(Nota nota){
        this.lista_notas.add(nota);
    }
    public int menorNota() {
        int menor = 10;
        for (Nota nota : this.lista_notas) {
            if (menor > nota.getPuntuacion()){
                menor = nota.getPuntuacion();
            }
        }
        return menor;
    }
    public int mayorNota() {
        int mayor = 0;
        for (Nota nota : this.lista_notas) {
            if (mayor < nota.getPuntuacion()){
                mayor = nota.getPuntuacion();
            }
        }
        return mayor;
    }

    public static void main(String[] args) {
        Alumno alumno = new Alumno("santino", "geretto",new Fecha(25,5,2008));
        alumno.agregarNota(new Nota(8,"matematica"));
        alumno.agregarNota(new Nota(9,"matematica"));
        alumno.agregarNota(new Nota(2,"orga"));
        alumno.agregarNota(new Nota(6,"lengua"));
        System.out.println("mayor nota:" + alumno.mayorNota());
        System.out.println("menor nota:" + alumno.menorNota());

    }
}
