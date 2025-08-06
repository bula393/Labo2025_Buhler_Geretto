package vacunatorio;

import java.util.*;

public class SistemaVacunatorio {

    public static void main(String[] args) {
        HashMap<String, List<Vacunas>> historialVacunas = new HashMap<>();

        // Vacunas de ejemplo
        Vacunas vacuna1 = new Vacunas("Argentina", "2023-05-10", 123, 456, "Moderna");
        Vacunas vacuna2 = new Vacunas("EEUU", "2024-03-12", 789, 101, "Pfizer");

        // Asociar vacunas a un DNI
        List<Vacunas> vacunasList = new ArrayList<>();
        vacunasList.add(vacuna1);
        vacunasList.add(vacuna2);
        historialVacunas.put("12345678", vacunasList);

        // Mostrar el historial completo
        for (String dniEnMapa : historialVacunas.keySet()) {
            System.out.println("DNI: " + dniEnMapa);

            List<Vacunas> vacunasDelCiudadano = historialVacunas.get(dniEnMapa);

            if (vacunasDelCiudadano != null && !vacunasDelCiudadano.isEmpty()) {
                for (Vacunas v : vacunasDelCiudadano) {
                    System.out.println("  - Vacuna: " + v.getNombreComercial()
                            + " | Fecha: " + v.getFecha_aplicacion()
                            + " | Lote: " + v.getNumerolote());
                }
            } else {
                System.out.println("  No tiene vacunas registradas.");
            }

            System.out.println(); // salto de línea
        }
    }
}


