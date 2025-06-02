package sistemaControlDeLlamadas;

import org.junit.Test;
import static org.junit.Assert.*;

public class LlamadaTest {

    @Test
    public void testCrearLlamada() {
        Empleado e1 = new Empleado("Ana", "García", 12345678, "Argentina", 1111);
        Empleado e2 = new Empleado("Luis", "Martínez", 87654321, "Brasil", 2222);

        Llamada llamada = new Llamada(e1, e2, 15);

        assertEquals(e1, llamada.getOrigen());
        assertEquals(e2, llamada.getDestino());
        assertEquals(15, llamada.getDuracionEnMinutos());
    }

    @Test
    public void testToString() {
        Empleado e1 = new Empleado("Ana", "García", 12345678, "Argentina", 1111);
        Empleado e2 = new Empleado("Luis", "Martínez", 87654321, "Brasil", 2222);

        Llamada llamada = new Llamada(e1, e2, 15);

        String esperado = "De: Ana García a: Luis Martínez - Duración: 15 minutos";
        assertEquals(esperado, llamada.toString());
    }
}
