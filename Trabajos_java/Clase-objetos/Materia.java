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
            System.out.print(materia.nombre+',');
        }
        System.out.println("--------------------------------");
        System.out.println("promedio de edades" + materias.get(2).promedioEdadAlumnos());
        System.out.println("promedio de notas" + materias.get(2).promedioNotasAlumnos());


    }
}
