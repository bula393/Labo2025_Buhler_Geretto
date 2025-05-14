package personas;
import random.Materia;
import random.Nota;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona {
    ArrayList<Nota> lista_notas;
    ArrayList<Materia> lista_materia;

    public Alumno(String nombre, String apellido, LocalDate fecha_nacimiento) {
        super(nombre,apellido,fecha_nacimiento);
        this.lista_notas = new ArrayList<Nota>();
        this.lista_materia = new ArrayList<Materia>();
    }

    public ArrayList<Materia> getLista_materia() {
        return lista_materia;
    }

    public void setLista_materia(ArrayList<Materia> lista_materia) {
        this.lista_materia = lista_materia;
    }

    public ArrayList<Nota> getLista_notas() {
        return lista_notas;
    }

    public void setLista_notas(ArrayList<Nota> lista_notas) {
        this.lista_notas = lista_notas;
    }

    public void agregarMateria(ArrayList<Materia> materias){
        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese una materia para agregarse");
        Materia materiaAgregar = new Materia(x.nextLine());
        for (int j = 0; j < materias.size(); j++)

        {
            if (materiaAgregar.getNombre().equals(materias.get(j).getNombre())){
                materiaAgregar = materias.get(j);
                materias.get(j).añadirAlumno(this);
                this.lista_materia.add(materiaAgregar);
            }
        }

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
            ArrayList<Materia> materias = new ArrayList<Materia>();
            materias.add(new Materia("matematica"));
            materias.add(new Materia("lengua"));
            materias.add(new Materia("ingles"));

            ArrayList<Nota> notas = new ArrayList<Nota>();
            notas.add(new Nota(10,"ingles"));
            notas.add(new Nota(6,"ingles"));
            notas.add(new Nota(2,"ingles"));

            ArrayList<Nota> notas2 = new ArrayList<Nota>();
            notas.add(new Nota(7,"ingles"));
            notas.add(new Nota(6,"ingles"));
            notas.add(new Nota(3,"ingles"));

            ArrayList<Nota> notas3 = new ArrayList<Nota>();
            notas.add(new Nota(8,"ingles"));
            notas.add(new Nota(1,"ingles"));
            notas.add(new Nota(5,"ingles"));

            Alumno a1 = new Alumno("santi","buhler", LocalDate.of(2008,05,30));
            Alumno a2 = new Alumno("facu","buhler", LocalDate.of(2010,02,20));
            Alumno a3 = new Alumno("nico","orniero", LocalDate.of(2005,03,10));

            a1.setLista_notas(notas);
            a2.setLista_notas(notas2);
            a3.setLista_notas(notas3);

            a1.agregarMateria(materias);
            a1.agregarMateria(materias);
            a2.agregarMateria(materias);
            a3.agregarMateria(materias);
            System.out.println("--------------------------------");
            System.out.println("lista de materias de a1:");
            for (Materia materia : a1.getLista_materia()){
                System.out.print(materia.getNombre()+',');
            }
            System.out.println("--------------------------------");
            System.out.println("promedio de edades " + materias.get(2).promedioEdadAlumnos());
            System.out.println("promedio de notas " + materias.get(2).promedioNotasAlumnos());


        }
    }

