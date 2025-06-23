package sistema_de_recetas;

import java.util.ArrayList;

public class Entrada extends Plato {
    private Temperatura temperatura;

    public Entrada(String nombre, Dificultad dificultad, ArrayList<Paso> lista_pasos, Temperatura temperatura) {
        super(nombre, dificultad, lista_pasos);
        this.temperatura = temperatura;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    void mostrarPasos() {
        int contador =  1;
        for (Paso paso:super.getLista_pasos()){
            System.out.println("Paso:" + contador);
            contador++;
            System.out.println(paso.getInstrucciom());
        }
    }
    @Override
    void mostrar() {
        if (temperatura.equals(Temperatura.CALIENTE))
        {
            System.out.println("Prende el horno");
        }
        System.out.println("Los pasos son:");
        this.mostrarPasos();
        if (temperatura.equals(Temperatura.FRIO))
            {
                System.out.println("guarde la preparacion en a heladera");
            }
        }

    @Override
    Tipo Tipo() {
        return Tipo.ENTRADA;
    }

}
