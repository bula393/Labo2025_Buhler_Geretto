package GestionMascotas;

import personas.Persona1;

import java.util.ArrayList;

public class SistemaMascota {
    ArrayList<Mascota> mascotas;

    public SistemaMascota(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    public void addMascota(Mascota mascota){
        mascotas.add(mascota);
    }
    public void removeMascota(Mascota mascota){
        mascotas.remove(mascota);
    }
    public void updateMascora(Mascota newMascota,Mascota oldMascota){
        this.addMascota(newMascota);
        this.removeMascota(oldMascota);
    }
    public void Saludar(Persona1 persona,String nombreMascota){
        Pez pez;
        for (Mascota mascota : mascotas){
            if (mascota.getNombre().equals(nombreMascota)){
                if (mascota.isDueño(persona)){
                    mascota.saludar();
                }
                else {
                    mascota.saludoExtraño();
                }
            }
            if (mascota.tipo()==Raza.PEZ ){
                pez =(Pez) mascota;
                if (pez.muerto()){
                    this.removeMascota(mascota);
                }
            }
        }
    }
}
