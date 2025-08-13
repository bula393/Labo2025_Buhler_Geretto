package sistemaBarrios;

public abstract class Lugar {
    private String nombre;
    private int codigo;
    private Cordenada cordenada;

    public Lugar(String nombre, int codigo, Cordenada cordenada) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cordenada = cordenada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cordenada getCordenada() {
        return cordenada;
    }

    public void setCordenada(Cordenada cordenada) {
        this.cordenada = cordenada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public abstract int calculaPoblacion();
}
