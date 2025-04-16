public class Persona {
    String nombre;
    int edad;
    String direccion;

    public Persona(String Nombre, int Edad, String Direccion){
        this.nombre=Nombre;
        this.edad=Edad;
        this.direccion=Direccion;
    }
    public String getNombre(){ return nombre; }
    public int getEdad(){ return edad; }
    public String getDireccion(){ return direccion; }
    public void setNombre(String Nombre){ this.nombre=Nombre; }
    public void setEdad(int Edad){ this.edad=Edad; }
    public void setDireccion(String Direccion){ this.direccion=Direccion; }

    public void mostrar_datos(){
        System.out.println("nombre:" + this.getNombre());
        System.out.println("direccion:" + this.getDireccion());
        System.out.println("edad:" + this.getEdad());
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("pipe",17,"villa urquiza");
        p1.mostrar_datos();
    }

}
