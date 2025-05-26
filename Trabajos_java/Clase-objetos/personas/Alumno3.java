package personas;

public class Alumno3 extends Persona1
{
    private String division;

    public Alumno3(String nombre, String apellido, String division){
        super(nombre,apellido);
        this.division=division;
    }
    public Alumno3(){
        super();
        this.division="A";
    }


}
