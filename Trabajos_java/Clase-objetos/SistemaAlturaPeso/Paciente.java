package SistemaAlturaPeso;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Paciente {
    private String nombre;
    private String apellido;
    private LocalDate fecha_nacimiento;
    private HashMap<LocalDate,PesoYAltura> pesoaltura;


    public Paciente(String nombre, String apellido, LocalDate fecha_nacimiento, HashMap<LocalDate, PesoYAltura> pesoaltura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setPesoaltura(HashMap<LocalDate, PesoYAltura> pesoaltura) {
        this.pesoaltura = pesoaltura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public HashMap<LocalDate, PesoYAltura> getPesoaltura() {
        return pesoaltura;
    }
    public PesoYAltura medida_fechaparticular(LocalDate fecha){
        return pesoaltura.get(fecha);
    }
    public PesoYAltura Promedio(int año){
            for (Map.Entry<LocalDate, PesoYAltura> promedio : pesoaltura.entrySet()){
            PesoYAltura PromedioActual = promedio.getKey();
            PesoYAltura promediado;
                promediado = promedio.getValue();
                if(fecha < )
                System.out.println("El promedio el ultimo año es:" + )

            }
    }
}

