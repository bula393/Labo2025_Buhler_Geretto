package sistema_de_recetas;

import java.util.ArrayList;

public class PlatoPrincipal extends Plato{
    private int tiempoCoccion;
    private int numeroComensales;

    public PlatoPrincipal(String nombre, Dificultad dificultad, ArrayList<Paso> lista_pasos) {
        super(nombre, dificultad, lista_pasos);
    }

    @Override
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
        System.out.println("Esta receta tarda en cocinarse:" + this.tiempoCoccion);
        System.out.println("Los pasos son:");
        this.mostrarPasos();
    }

    @Override
    Tipo Tipo() {
        return Tipo.PLATOPRINCIPAL;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public int getNumeroComensales() {
        return numeroComensales;
    }

    public void setNumeroComensales(int numeroComensales) {
        this.numeroComensales = numeroComensales;
    }

}
