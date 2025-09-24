package sistemaMasterchef;

import java.time.LocalDate;

public class Experto extends Participante implements platosEntrada,PlatoPrincipal{
    private static int tiempoMaximo = 80;
    private int tiempoActual;

    public Experto(String nombre, String apellido, LocalDate fechaNacimiento, ColorEquipo colorEquipo, String localidad) {
        super(nombre, apellido, fechaNacimiento, colorEquipo, localidad);
        this.tiempoActual = tiempoMaximo;
    }

    public static int getTiempoMaximo() {
        return tiempoMaximo;
    }

    public int getTiempoActual() {
        return tiempoActual;
    }

    public void setTiempoActual(int tiempoActual) {
        this.tiempoActual = tiempoActual;
    }

    @Override
    public String preparandoLaMesa() {
        this.tiempoActual -= 5;
        return "Los expertos muestran un mensaje que dice: “Perdi 5 minutos preparando la mesa por lo que mi tiempo restante es: " + tiempoActual;
    }

    @Override
    public boolean cocinarServirPrincipal(Plato Platoprincipal) {
        if (tiempoActual-Platoprincipal.getTiempoDeCoccion() >=0){
            return true;
        }
        else{

        }
    }

    @Override
    public boolean cocinarServirEntrada(Plato entrada) {
        if (tiempoActual-entrada.getTiempoDeCoccion() >=0){
            return true;
        }
        else{

        }
    }
}
