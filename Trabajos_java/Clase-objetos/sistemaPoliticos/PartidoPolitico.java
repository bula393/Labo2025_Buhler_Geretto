package sistemaPoliticos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class PartidoPolitico {
    private String nombre;
    private String direccion;
    private int cantAfiliados;
    private HashSet<Mensajero> mensajeros;

    public PartidoPolitico(String nombre, String direccion, int cantAfiliados, HashSet<Mensajero> mensajeros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantAfiliados = cantAfiliados;
        this.mensajeros = mensajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public HashSet<Mensajero> getMensajeros() {
        return mensajeros;
    }

    public void setMensajeros(HashSet<Mensajero> mensajeros) {
        this.mensajeros = mensajeros;
    }

    public int getCantAfiliados() {
        return cantAfiliados;
    }

    public void setCantAfiliados(int cantAfiliados) {
        this.cantAfiliados = cantAfiliados;
    }
    public void hacerCampaña(){
        for (Mensajero m : mensajeros){
            m.hacerCampaña("Vote por el partido para un mejor futuro");
        }
    }
    public void addMensajero(Mensajero m){
        mensajeros.add(m);
    }
    public static void main(String[] args) {
        PalomaMensajera p1= new PalomaMensajera("carl","halcon","rojo",true);
        Telefono te1 = new Telefono(84556,"samsung","Galaxi fold 9",false,56,87965121,CompaniaTelefonica.PERSONAL);
        Trabajador tr1 = new Trabajador("nico","orniero", LocalDate.now(),47985658,4575774,56.2, LocalTime.now(),LocalTime.now());
        PartidoPolitico partido = new PartidoPolitico("tralaleros","generalPaz 4585",925,new HashSet<>());
        partido.addMensajero(p1);
        partido.addMensajero(te1);
        partido.addMensajero(tr1);
        partido.hacerCampaña();

    }
}
