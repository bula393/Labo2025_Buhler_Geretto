package sistemaDePretamosVirtules;

import personas.Persona1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Usuario extends Persona1 {
    private int numeroSocio;
    private int creditoGanado;
    private String mail;
    private HashSet<Publicacion> publicacionesLeidas;
    private HashMap<PrestamoInterface,Integer> LibroPrestado;

    public Usuario(String nombre, String apellido, LocalDate fechaNacimiento, int creditoGanado, String mail, HashSet<Publicacion> publicacionesLeidas, HashMap<PrestamoInterface, Integer> libroPrestado,int numeroSocio) {
        super(nombre, apellido, fechaNacimiento);
        this.creditoGanado = creditoGanado;
        this.mail = mail;
        this.publicacionesLeidas = publicacionesLeidas;
        LibroPrestado = libroPrestado;
        this.numeroSocio = numeroSocio;
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

    public HashMap<PrestamoInterface, Integer> getLibroPrestado() {
        return LibroPrestado;
    }

    public void setLibroPrestado(HashMap<PrestamoInterface, Integer> libroPrestado) {
        LibroPrestado = libroPrestado;
    }
    public void sumarCredito(int credito){
        this.creditoGanado += credito;
    }
    public void restaCredito(int credito){
        this.creditoGanado += credito;
    }

    public void addPrestamo(Publicacion articulo){
        if (LibroPrestado.containsKey(articulo)){
            LibroPrestado.put((PrestamoInterface) articulo,0);
        }
        else {
            LibroPrestado.put((PrestamoInterface) articulo,LibroPrestado.get(articulo)+1);
        }
        publicacionesLeidas.add(articulo);
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }
}
