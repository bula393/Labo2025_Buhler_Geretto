public class Employe {
    private int ID;
    private String nombre;
    private double salario;

    public Employe(int ID, String nombre, double salario) {
        this.ID = ID;
        this.nombre = nombre;
        this.salario = salario;
    }
    public int getID() {
        return ID;
    }
    public String getNombre() {
        return nombre;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setId(int ID) {
        this.ID = ID;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void imprimirDetalles() {
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Employe:" +   "ID=" + ID + ", nombre=" + nombre + ", salario=" + salario ;
    }
}