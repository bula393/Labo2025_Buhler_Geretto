package sistemaDePretamosVirtules;

import personas.Persona1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Usuario extends Persona1 {
    private int creditoGanado;
    private String mail;
    private HashSet<Publicacion> publicacionesLeidas;
    private HashMap<Prestamo,Integer> LibroPrestado;

    public Usuario(String nombre, String apellido, LocalDate fechaNacimiento, int creditoGanado, String mail, HashSet<Publicacion> publicacionesLeidas, HashMap<Prestamo, Integer> libroPrestado) {
        super(nombre, apellido, fechaNacimiento);
        this.creditoGanado = creditoGanado;
        this.mail = mail;
        this.publicacionesLeidas = publicacionesLeidas;
        LibroPrestado = libroPrestado;
    }

    public int getCreditoGanado() {
        return creditoGanado;
    }

    public void setCreditoGanado(int creditoGanado) {
        this.creditoGanado = creditoGanado;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Publicacion> getPublicacionesLeidas() {
        return publicacionesLeidas;
    }

    public void setPublicacionesLeidas(HashSet<Publicacion> publicacionesLeidas) {
        this.publicacionesLeidas = publicacionesLeidas;
    }

    public HashMap<Prestamo, Integer> getLibroPrestado() {
        return LibroPrestado;
    }

    public void setLibroPrestado(HashMap<Prestamo, Integer> libroPrestado) {
        LibroPrestado = libroPrestado;
    }
}
