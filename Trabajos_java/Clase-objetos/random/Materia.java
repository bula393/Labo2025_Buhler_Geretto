package random;

import personas.Alumno;

import java.time.LocalDate;
import java.util.ArrayList;

public class Materia {
    String nombre;
    ArrayList<String> listaDeContenidos;
    ArrayList<Alumno> alumnosInscriptos;

    public Materia(ArrayList<Alumno> alumnosInscriptos, String nombre) {
        this.alumnosInscriptos = alumnosInscriptos;
        this.nombre = nombre;
        this.listaDeContenidos = new ArrayList<String>();

    }

    public Materia(String nombre){
        this.nombre = nombre;
        this.alumnosInscriptos = new ArrayList<Alumno>();
        this.listaDeContenidos = new ArrayList<String>();
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
    public void añadirAlumno(Alumno alumno){
        this.alumnosInscriptos.add(alumno);
    }
    public double promedioEdadAlumnos(){
        double promedio = 0;
        int i = 0;
        for (Alumno alumno : this.getAlumnosInscriptos()){
            promedio+=alumno.calculaEdad();
            i++;
        }
        return promedio/i;
    }
    public double promedioNotasAlumnos(){
        double promedio = 0;
        int i = 0;
        for (Alumno alumno : this.getAlumnosInscriptos()){
            for (Nota nota : alumno.getLista_notas()){
                if (nota.getMateria() == this.nombre){
                    promedio += nota.getPuntuacion();
                    i++;
                }
            }
        }
        return promedio/i;
    }

    public static void main(String[] args) {

    }
}
