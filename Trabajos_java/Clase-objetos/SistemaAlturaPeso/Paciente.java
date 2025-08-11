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
    public PesoYAltura Promedio(int anio){
        int contador = 0;
        PesoYAltura promedio = new PesoYAltura(0,0);
        for (Map.Entry<LocalDate, PesoYAltura> entrada : pesoaltura.entrySet()){
                PesoYAltura PromedioActual = entrada.getValue();
                LocalDate fecha = entrada.getKey();
                PesoYAltura peso_altura = entrada.getValue();
                if(fecha.getYear() == anio ) {
                    contador++;
                    promedio.setAltura(promedio.getAltura()+peso_altura.getAltura());
                    promedio.setPeso(promedio.getPeso()+peso_altura.getPeso());
                }

            }
        promedio.setAltura(promedio.getAltura()/contador);
        promedio.setPeso(promedio.getPeso()/contador);
        return promedio;
    }
    public PesoYAltura porcentajeComparacion(PesoYAltura medicioninicial, PesoYAltura medicionFinal){
        PesoYAltura diferenciafechas;
        diferenciafechas = new PesoYAltura((medicioninicial.getPeso() - medicionFinal.getPeso())/100,(medicioninicial.getAltura()-medicionFinal.getAltura())/100);
        return diferenciafechas;
    }
    public int porcentajeCrecimiento(LocalDate fecha1,LocalDate fecha2){
        int porcentaje = 0;
        int comprobacion = 0;
        PesoYAltura medicioninicial;
        PesoYAltura medicionFinal;
        for (Map.Entry<LocalDate,PesoYAltura> medicion : pesoaltura.entrySet()){
            if (medicion.getKey().equals(fecha1)){
                medicioninicial = new PesoYAltura(medicion.getValue().getPeso(),medicion.getValue().getAltura());
            } else if (medicion.getKey().equals(fecha2)) {
                medicionFinal = new PesoYAltura(medicion.getValue().getPeso(),medicion.getValue().getAltura());
            }

        }
        if (comprobacion == 2){

        }
        return porcentaje;
    }
}


