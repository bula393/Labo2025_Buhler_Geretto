package personas;

import random.Fecha;

import java.time.LocalDate;

public class Persona {
    String nombre;
    String direccion;
    LocalDate fecha_nacimiento;
    public Persona(String Nombre,LocalDate fecha_nacimiento){
        this.nombre=Nombre;
        this.fecha_nacimiento=fecha_nacimiento;
    }
    public Persona(String Nombre, String Direccion,LocalDate fecha_nacimiento){
        this.nombre=Nombre;
        this.direccion=Direccion;
        this.fecha_nacimiento=fecha_nacimiento;
    }
    public String getNombre(){ return nombre; }
    public String getDireccion(){ return direccion; }
    public void setNombre(String Nombre){ this.nombre=Nombre; }
    public void setDireccion(String Direccion){ this.direccion=Direccion; }

    public LocalDate getfecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setfecha_nacimiento(LocalDate fecha_nacimiento) {
        fecha_nacimiento = fecha_nacimiento;
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
    public void mostrar_datos(){
        System.out.println("nombre:" + this.getNombre());
        System.out.println("direccion:" + this.getDireccion());
        System.out.println("edad:" + this.calculaEdad());
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("pipe","villa urquiza",LocalDate.now());
        p1.mostrar_datos();
    }

}
