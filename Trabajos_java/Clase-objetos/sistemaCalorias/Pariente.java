package sistemaCalorias;


import java.time.LocalDate;
import java.util.ArrayList;

public class Pariente {
    private LocalDate fechanacimieno;
    private String nombre;
    private ArrayList<Plato> platosConsumidos;

    public Pariente(LocalDate fechanacimieno, String nombre, ArrayList<Plato> platosConsumidos) {
        this.fechanacimieno = fechanacimieno;
        this.nombre = nombre;
        this.platosConsumidos = platosConsumidos;
    }

    public LocalDate getFechanacimieno() {
        return fechanacimieno;
    }

    public void setFechanacimieno(LocalDate fechanacimieno) {
        this.fechanacimieno = fechanacimieno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Plato> getPlatosConsumidos() {
        return platosConsumidos;
    }

    public void setPlatosConsumidos(ArrayList<Plato> platosConsumidos) {
        this.platosConsumidos = platosConsumidos;
    }
    public int caliriasConsumidad(){
        int calorias = 0;
        for (Plato plato : platosConsumidos){
            calorias += plato.getCalorias();
        }
        return  calorias;
    }
}
