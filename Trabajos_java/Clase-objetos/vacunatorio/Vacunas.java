package vacunatorio;

public class Vacunas {
    private String fabricacion;
    private String fecha_aplicacion;
    private int numerolote;
    private int numerofabricacion;
    private String NombreComercial;

    public Vacunas(String fabricacion, String fecha_aplicacion, int numerolote, int numerofabricacion, String nombreComercial) {
        this.fabricacion = fabricacion;
        this.fecha_aplicacion = fecha_aplicacion;
        this.numerolote = numerolote;
        this.numerofabricacion = numerofabricacion;
        NombreComercial = nombreComercial;
    }

    public int getNumerolote() {
        return numerolote;
    }

    public void setNumerolote(int numerolote) {
        this.numerolote = numerolote;
    }

    public String getFecha_aplicacion() {
        return fecha_aplicacion;
    }

    public void setFecha_aplicacion(String fecha_aplicacion) {
        this.fecha_aplicacion = fecha_aplicacion;
    }

    public int getNumerofabricacion() {
        return numerofabricacion;
    }

    public void setNumerofabricacion(int numerofabricacion) {
        this.numerofabricacion = numerofabricacion;
    }

    public String getNombreComercial() {
        return NombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        NombreComercial = nombreComercial;
    }

    public String getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(String fabricacion) {
        this.fabricacion = fabricacion;
    }
}
