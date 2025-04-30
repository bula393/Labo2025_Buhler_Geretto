import java.time.LocalDate;
import java.util.ArrayList;

public class Torneo {
    ArrayList<Partido> partidos;
    ArrayList<Equipo> equipos;

    public Torneo(){
        this.inicializo_equipos();
        this.partidos = new ArrayList<>();
        this.generarPartidos();
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Equipo> getequipos() {
        return equipos;
    }

    public void setequipos(ArrayList<Equipo> equipos) {
        equipos = equipos;
    }

    public void inicializo_equipos(){
        this.equipos =new ArrayList<>();
        this.equipos.add(new Equipo("Chacarita" , LocalDate.of(2007,04,03), "Chacarita","mañana" ));
        this.equipos.add(new Equipo("san lorenzo" , LocalDate.of(1960,10, 04), "La boca","tarde" ));
        this.equipos.add(new Equipo("River" , LocalDate.of(1980,12,03), "Belgrano","noche" ));
        this.equipos.add(new Equipo("Club Atletico Huracan" , LocalDate.of(1999,8,12), "El Tigre","mañana" ));
        this.equipos.add(new Equipo("Club Atletico Tigre" , LocalDate.of(2006,12,22), "Patricios","noche" ));
        this.equipos.add(new Equipo("Club Atletico San Marino" , LocalDate.of(1900,01,31), "Marino","tarde" ));
        this.equipos.add(new Equipo("Club Atletico Tucuman" , LocalDate.of(1099,02,22), "Tucuman","noche" ));
        this.equipos.add(new Equipo("Independiente" , LocalDate.of(1900,01,12), "Barrio Independiente","noche" ));
        this.equipos.add(new Equipo("Lanús" , LocalDate.of(0001,01,01), "Barrio Sigma","tarde" ));
    }

        public void mostrarFixture(){
            System.out.println("Local     |     Visitante");
            for (Partido partido : partidos ){
                partido.mostrarPartido();
            }
        }

        public void generarPartidos(){
        ArrayList<Equipo> equipos_mañana = new ArrayList<>();
        ArrayList<Equipo> equipos_tarde = new ArrayList<>();
        ArrayList<Equipo> equipos_noche = new ArrayList<>();

         for (Equipo equipo:this.equipos) {
             if (equipo.disponibilidad.equals("tarde")){
                 equipos_tarde.add(equipo);
             }
             else if (equipo.disponibilidad.equals("mañana")){
                 equipos_mañana.add(equipo);
             }
             else if (equipo.disponibilidad.equals("noche") ){
                 equipos_noche.add(equipo);
             }

         }

         for (int i = 0; i < equipos_tarde.size(); i++) {
             for (int j = i; j < equipos_tarde.size(); j++) {
                 this.partidos.add(new Partido(equipos_tarde.get(i),equipos_tarde.get(j),LocalDate.now(),"tarde"));
             }
         }
         for (int i = 0; i < equipos_noche.size(); i++) {
             for (int j = i; j < equipos_noche.size(); j++) {
                 this.partidos.add(new Partido(equipos_noche.get(i),equipos_noche.get(j),LocalDate.now(),"noche"));
             }
         }
         for (int i = 0; i < equipos_mañana.size(); i++) {
             for (int j = i; j < equipos_mañana.size(); j++) {
                 this.partidos.add(new Partido(equipos_mañana.get(i),equipos_mañana.get(j),LocalDate.now(),"mañana"));
             }
         }
        
     }

    public static void main(String[] args) {
        Torneo torneo = new Torneo();
        torneo.mostrarFixture();
    }
}
