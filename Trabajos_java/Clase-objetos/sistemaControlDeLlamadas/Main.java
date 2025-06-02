package sistemaControlDeLlamadas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ana", "García", 12345678, "Argentina", 1111);
        Empleado e2 = new Empleado("Luis", "Martínez", 87654321, "Brasil", 2222);
        Empleado e3 = new Empleado("Sofía", "López", 55555555, "Argentina", 3333);

        registrarLlamada(e1, e2, 10);
        registrarLlamada(e1, e3, 5);
        registrarLlamada(e2, e3, 20);
        registrarLlamada(e3, e1, 15);

        System.out.println("\nLlamadas realizadas por Ana:");
        listarLlamadas(e1);

        System.out.println("\nRanking de empleados que más llamaron al exterior:");
        mostrarRankingLlamadasAlExterior(Arrays.asList(e1, e2, e3));
    }

    public static void registrarLlamada(Empleado origen, Empleado destino, int duracion) {
        Llamada llamada = new Llamada(origen, destino, duracion);
        origen.getLlamadas().add(llamada);
    }

    public static void listarLlamadas(Empleado empleado) {
        List<Llamada> llamadas = empleado.getLlamadas();
        for (int i = 0; i < llamadas.size(); i++) {
            Llamada llamada = llamadas.get(i);
            System.out.println("Llamada " + (i + 1) + ": " + llamada);
        }
    }

    public static void mostrarRankingLlamadasAlExterior(List<Empleado> empleados) {
        List<EmpleadoTiempo> listaRanking = new ArrayList<>();

        for (Empleado emp : empleados) {
            int tiempoTotalExterior = 0;

            for (Llamada llamada : emp.getLlamadas()) {
                String paisOrigen = llamada.getOrigen().getPaís();
                String paisDestino = llamada.getDestino().getPaís();
                if (!paisOrigen.equalsIgnoreCase(paisDestino)) {
                    tiempoTotalExterior += llamada.getDuracionEnMinutos();
                }
            }

            if (tiempoTotalExterior > 0) {
                listaRanking.add(new EmpleadoTiempo(emp, tiempoTotalExterior));
            }
        }

        Collections.sort(listaRanking, new Comparator<EmpleadoTiempo>() {
            @Override
            public int compare(EmpleadoTiempo o1, EmpleadoTiempo o2) {
                return o2.tiempo - o1.tiempo; // orden descendente
            }
        });

        for (EmpleadoTiempo et : listaRanking) {
            Empleado e = et.empleado;
            System.out.println(e.getNombre() + " " + e.getApellido() + " - " + et.tiempo + " minutos");
        }
    }
}

class EmpleadoTiempo {
    Empleado empleado;
    int tiempo;

    public EmpleadoTiempo(Empleado empleado, int tiempo) {
        this.empleado = empleado;
        this.tiempo = tiempo;
    }
}
