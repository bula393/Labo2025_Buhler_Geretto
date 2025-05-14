import personas.Jugador;
import java.util.Random;
import java.time.LocalDate;

public class Equipo {
    String equipo;
    LocalDate fecha;
    String barrio;
    Jugador[] jugadores_equipo = new Jugador[11] ;
    String disponibilidad;

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Jugador[] getJugadores_equipo() {
        return jugadores_equipo;
    }

    public void setJugadores_equipo(Jugador[] jugadores_equipo) {
        this.jugadores_equipo = jugadores_equipo;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Equipo(String equipo, LocalDate fecha, String barrio, String disponibilidad) {
        this.equipo = equipo;
        this.fecha = fecha;
        this.barrio = barrio;
        this.inicializo_jugadores();
        this.disponibilidad = disponibilidad;
        LocalDate t = fecha;
    }
    public void inicializo_jugadores(){
        jugadores_equipo[0] = new Jugador("Lionel Messi", LocalDate.of(1987, 6, 24));
        jugadores_equipo[1] = new Jugador("Ángel Di María", LocalDate.of(1988, 3, 22));
        jugadores_equipo[2] = new Jugador("Kylian Mbappé", LocalDate.of(1998, 12, 20));
        jugadores_equipo[3] = new Jugador("Neymar Jr.", LocalDate.of(1992, 2, 5));
        jugadores_equipo[4] = new Jugador("Erling Haaland", LocalDate.of(2000, 7, 21));
        jugadores_equipo[5] = new Jugador("Kevin De Bruyne", LocalDate.of(1991, 6, 28));
        jugadores_equipo[6] = new Jugador("Virgil van Dijk", LocalDate.of(1991, 7, 8));
        jugadores_equipo[7] = new Jugador("Mohamed Salah", LocalDate.of(1992, 6, 15));
        jugadores_equipo[8] = new Jugador("Robert Lewandowski", LocalDate.of(1988, 8, 21));
        jugadores_equipo[9] = new Jugador("Harry Kane", LocalDate.of(1993, 7, 28));
        jugadores_equipo[10] = new Jugador("Vinícius Júnior", LocalDate.of(2000, 7, 12));

    }
    public void asignarNumeroCamiseta(Jugador Jugador){
        int numero;
        boolean verificacion = true;
        Random aleatorio =new Random();
        int indice_jugador = 22;
        numero = aleatorio.nextInt(100) + 1;
        while (verificacion){
            verificacion = false;
            for (int i = 0; i < 11; i++) {
                if (this.jugadores_equipo[i].getNumero_remera() == numero){
                    verificacion = true;
                    indice_jugador = i;
                }
            }
            if (!verificacion & indice_jugador != 22){
                this.jugadores_equipo[indice_jugador].setNumero_remera(numero);
            }
        }
    }
}
