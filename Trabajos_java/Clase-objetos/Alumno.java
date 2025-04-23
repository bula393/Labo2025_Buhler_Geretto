import random.Persona;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    String nombre;
    String apellido;
    LocalDate fecha_nacimiento;
    ArrayList<Nota> lista_notas;
    ArrayList<Materia> lista_materia;

    public Alumno(String nombre, String apellido, LocalDate fecha_nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.lista_notas = new ArrayList<Nota>();
        this.lista_materia = new ArrayList<Materia>();
    }

    public ArrayList<Materia> getLista_materia() {
        return lista_materia;
    }

    public void setLista_materia(ArrayList<Materia> lista_materia) {
        this.lista_materia = lista_materia;
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

    public LocalDate getfecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setfecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public ArrayList<Nota> getLista_notas() {
        return lista_notas;
    }

    public void setLista_notas(ArrayList<Nota> lista_notas) {
        this.lista_notas = lista_notas;
    }

    public void agregarMateria(ArrayList<Materia> materias){
        Scanner x = new Scanner(System.in);
        int i = 0;
        System.out.println("Ingrese una materia para agregarse");
        Materia materiaAgregar = new Materia(x.nextLine());
        for (Materia materia :  materias){
            if (materiaAgregar.getNombre() == materia.getNombre()){
                materiaAgregar = materia;
                materias.get(i).añadirAlumno(this);
                this.lista_materia.add(materiaAgregar);
            }
            i++;
        }

    }
    public int calculaEdad(){
        LocalDate actual = LocalDate.now() ;
        int edad = actual.getYear() - this.fecha_nacimiento.getYear();
        if (this.fecha_nacimiento.getMonthValue() > actual.getMonthValue()) {
            edad--;
        }
        else if (this.fecha_nacimiento.getMonthValue() == actual.getMonthValue()  &  this.fecha_nacimiento.getDayOfMonth() > actual.getDayOfMonth())
        {
            edad --;
        }
        return edad;
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
        LocalDate fecha = LocalDate.of(2007,5,25);
        Alumno alumno = new Alumno("santino", "geretto",fecha);
        alumno.agregarNota(new Nota(8,"matematica"));
        alumno.agregarNota(new Nota(9,"matematica"));
        alumno.agregarNota(new Nota(2,"orga"));
        alumno.agregarNota(new Nota(6,"lengua"));
        System.out.println("mayor nota:" + alumno.mayorNota());
        System.out.println("menor nota:" + alumno.menorNota());

    }
}
