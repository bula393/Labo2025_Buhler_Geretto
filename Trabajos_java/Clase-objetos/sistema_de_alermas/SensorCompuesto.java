package sistema_de_alermas;

import java.time.LocalDate;

public class SensorCompuesto extends Dispocitivo {
    private Sensor_precion sensorPrecion;
    private Sensor_temperatura sensorTemperatura;
    private Detector_humo detectorHumo;

    public SensorCompuesto(boolean prendido, LocalDate año_de_publicacion, Sensor_precion sensorPrecion, Sensor_temperatura sensorTemperatura, Detector_humo detectorHumo) {
        super(prendido, año_de_publicacion);
        this.sensorPrecion = sensorPrecion;
        this.sensorTemperatura = sensorTemperatura;
        this.detectorHumo = detectorHumo;
        this.setMedida(this.calcularMedida());
        this.setUmbral_incial(this.calcularUmbral());


    }

    public Sensor_precion getSensorPrecion() {
        return sensorPrecion;
    }

    public void setSensorPrecion(Sensor_precion sensorPrecion) {
        this.sensorPrecion = sensorPrecion;
    }

    public Sensor_temperatura getSensorTemperatura() {
        return sensorTemperatura;
    }

    public void setSensorTemperatura(Sensor_temperatura sensorTemperatura) {
        this.sensorTemperatura = sensorTemperatura;
    }

    public Detector_humo getDetectorHumo() {
        return detectorHumo;
    }

    public void setDetectorHumo(Detector_humo detectorHumo) {
        this.detectorHumo = detectorHumo;
    }
    public int calcularUmbral(){
        return (this.detectorHumo.getUmbral_incial()+this.sensorPrecion.getUmbral_incial()+this.sensorTemperatura.getUmbral_incial())/3;
    }
    public int calcularMedida(){
        return (this.detectorHumo.getMedida()+this.sensorPrecion.getMedida()+this.sensorTemperatura.getMedida())/3;
    }

    @Override
    String imprimir() {
        return "";
    }
}
