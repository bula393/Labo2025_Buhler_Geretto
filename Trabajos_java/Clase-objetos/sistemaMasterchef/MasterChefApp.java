package sistemaMasterchef;

import sistemaCalorias.Ingrediente;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class MasterChefApp {
    public static void main(String[] args) {
        HashSet<Ingrediente> ingredientes = new HashSet<>();
        ingredientes.add(Ingrediente.AJO);
        ingredientes.add(Ingrediente.PESCADO);
        HashMap<Ingrediente,Integer> ingreditescant = new HashMap<>();
        ingreditescant.put(Ingrediente.POLLO,10);
        ingreditescant.put(Ingrediente.ZANAHORIA,5);
        ingreditescant.put(Ingrediente.AJO,15);

        Principiante principiante = new Principiante("felipe","alonso", LocalDate.now(),ColorEquipo.AZUL,"Chacarita",ingredientes);
        Intermedio intermedio = new Intermedio("ulises","coppati",LocalDate.of(2007,05,9),ColorEquipo.VERDE,"villa urquiza",ingreditescant);
        Experto experto = new Experto("tomas","garayzar",LocalDate.of(2008,10,14),ColorEquipo.ROJO,"puerto madero");
        HashSet<Participante> participantes = new HashSet<>();


        System.out.println("preparen las mesas para cocinar");
        System.out.println(principiante.preparandoLaMesa());
        System.out.println(intermedio.preparandoLaMesa());
        System.out.println(experto.preparandoLaMesa());

        // primer entrada
        System.out.println("quines pueden cocinar la entrada");
        Plato entrada = new Plato(ingreditescant,45);

        try {
            principiante.cocinarServirEntrada(entrada);
            experto.cocinarServirEntrada(entrada);
        } catch (ErrorNohaytiempo e) {
            System.out.println(e.getMessage());
        }
        catch (ErrorNoPuedeUsarUnIngrediente e) {
            System.out.println(e.getMessage());
        }
        // primer principal
        System.out.println("quines pueden cocinar el principal");
        Plato principal = new Plato(ingreditescant,45);

        try {
            intermedio.cocinarServirPrincipal(principal);
            experto.cocinarServirPrincipal(principal);
        } catch (ErrorNohaytiempo e) {
            System.out.println(e.getMessage());
        }
        catch (ErrorNoHayStock e) {
            System.out.println(e.getMessage());
        }
        catch (ErrorNoHayStockSuficiente e) {
            System.out.println(e.getMessage());
        }
        // segundo principal
        System.out.println("quines pueden cocinar el principal2");
        ingreditescant.put(Ingrediente.ZANAHORIA,6);
        Plato principaldos = new Plato(ingreditescant,45);


        try {
            intermedio.cocinarServirPrincipal(principaldos);
        }
        catch (ErrorNoHayStock e) {
            System.out.println(e.getMessage());
        }
        catch (ErrorNoHayStockSuficiente e) {
            System.out.println(e.getMessage());
        }
        // tercer principal
        System.out.println("quines pueden cocinar el principal3");
        ingreditescant.put(Ingrediente.PAPA,1);
        Plato principaltres = new Plato(ingreditescant,45);

        try {
            intermedio.cocinarServirPrincipal(principaltres);
        }
        catch (ErrorNoHayStock e) {
            System.out.println(e.getMessage());
        }
        catch (ErrorNoHayStockSuficiente e) {
            System.out.println(e.getMessage());
        }



    }
}
