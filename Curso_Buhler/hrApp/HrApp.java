import java.util.ArrayList;

public class HrApp {
    public static void main(String[] args) {
        Employe emp = new Employe(5,"John", 75000);
        Employe emp1 = new Employe(6,"Thomas", 25000);
        emp.imprimirDetalles();
        emp1.imprimirDetalles();
        Deparment dep = new Deparment("IT", new ArrayList<>());
        dep.agregarEmpleado(emp);

        System.out.println("Cantidad de empleados en el departamento: " + dep.cantidadEmpleados());
        for(Employe e : dep.getEmpleados()){
            e.imprimirDetalles();
        }
        System.out.println("Salario total del departamento: " + dep.calcularSalarioTotal());
        System.out.println("Salario promedio del departamento: " + dep.calcularSalarioPromedio());
        dep.buscarEmpleado(6).imprimirDetalles();;
    }
}