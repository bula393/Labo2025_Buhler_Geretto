import java.util.ArrayList;

public class Deparment {
   private String nombre;
   private ArrayList<Employe> empleados;
    public Deparment(String nombre, ArrayList<Employe> empleados) {
         this.nombre = nombre;
         this.empleados = empleados;
    } 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Employe> getEmpleados() {
        return empleados;
    }
    public void setEmpleados(ArrayList<Employe> empleados) {
        this.empleados = empleados;
    }
    public void agregarEmpleado(Employe empleado) {
        if (empleados.size() <= 10) {
            this.empleados.add(empleado);
        }
        else{
            System.out.println("el departamento ya tiene 10 empleados");
        }
    }
    public int cantidadEmpleados() {
        return this.empleados.size();
    }
    public void eliminarEmpleado(Employe empleado) {
        this.empleados.remove(empleado);
    }
    public void remplazarEmpleado(Employe empleadoNuevo, Employe empleadoViejo) {
        this.eliminarEmpleado(empleadoViejo);
        this.agregarEmpleado(empleadoNuevo);
    }
    public Employe buscarEmpleado(int id) {
        for (Employe e : empleados) {
            if (e.getID() == id) {
                return e;
            }
        }
        System.out.println("El empleado con ID " + id + " no fue encontrado.");
        return null;
    }
    public double calcularSalarioTotal() {
        double total = 0;
        for (Employe e : empleados) {
            total += e.getSalario();
        }
        return total;
    }
    public Double calcularSalarioPromedio() throws ArithmeticException {
        return this.calcularSalarioTotal() / empleados.size();
    }
}
