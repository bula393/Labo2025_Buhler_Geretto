package sistema_de_recetas;

import java.util.ArrayList;

public class Postre extends Plato{
    private int temperaturaPreparacion;
    private boolean aptoDiabeticos;

    public Postre(String nombre, Dificultad dificultad, ArrayList<Paso> lista_pasos, int temperaturaPreparacion, boolean aptoDiabeticos) {
        super(nombre, dificultad, lista_pasos);
        this.temperaturaPreparacion = temperaturaPreparacion;
        this.aptoDiabeticos = aptoDiabeticos;
    }
    void mostrarPasos() {
        int contador =  1;
        for (Paso paso:super.getLista_pasos()){
            System.out.println("Paso:" + contador);
            contador++;
            System.out.println(paso.getInstrucciom());
            System.out.println("mantener la cocina limpia y el horno al mínimo");
        }
    }
    @Override
    void mostrar() {

        System.out.println("Los pasos son:");
        this.mostrarPasos();
    }

    @Override
    Tipo Tipo() {
        return Tipo.POSTRE;
    }
}
