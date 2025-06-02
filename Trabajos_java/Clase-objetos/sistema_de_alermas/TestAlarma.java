package sistema_de_alermas;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.*;
public class TestAlarma {
    Sensor_precion prec;
    Detector_humo humo;
    Sensor_temperatura temp;
    SensorCompuesto sensorCompuesto;

    @Before
    public void setUp() {
        prec = new Sensor_precion(false, 75, LocalDate.of(2018, 3, 10), 20);
        humo = new Detector_humo(true, 100, LocalDate.of(2022, 7, 1), 15);
        temp = new Sensor_temperatura(true, 20, LocalDate.of(2022, 7, 1), 15);
    }

    @Test
    public void testImprimirSensortemp()
    {
        assertEquals("¡Cuidado! La temperatura sube", temp.imprimir());

    }

    @Test
        public void testImprimirSensorprec(){
            assertEquals("Sensor de presión activado", prec.imprimir());

        }
    @Test
    public void testImprimirSensorhumo(){
        assertEquals("llamada a los bomberos", humo.imprimir());
    }
    @Test
    public void testCalcularMedida(){
        SensorCompuesto c1 = new SensorCompuesto(true,LocalDate.of(2022, 7, 1),prec,temp,humo);
        assertEquals(65,c1.calcularMedida());
    }
    @Test
    public void testCalcularUmbral(){
        SensorCompuesto c1 = new SensorCompuesto(true,LocalDate.of(2022, 7, 1),prec,temp,humo);
        assertEquals(16,c1.calcularUmbral());
    }
}
