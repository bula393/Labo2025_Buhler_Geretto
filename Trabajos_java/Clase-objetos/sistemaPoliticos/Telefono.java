package sistemaPoliticos;

public class Telefono extends DispocitivoElectronico implements Mensajero {
    private CompaniaTelefonica companiaTelefonica;
    private int numeroCelular;
    private int saldo;

    public Telefono(int nSerie, String fabricante, String modelo, Boolean encendido, int saldo, int numeroCelular, CompaniaTelefonica companiaTelefonica) {
        super(nSerie, fabricante, modelo, encendido);
        this.saldo = saldo;
        this.numeroCelular = numeroCelular;
        this.companiaTelefonica = companiaTelefonica;
    }

    public CompaniaTelefonica getCompaniaTelefonica() {
        return companiaTelefonica;
    }

    public void setCompaniaTelefonica(CompaniaTelefonica companiaTelefonica) {
        this.companiaTelefonica = companiaTelefonica;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
    @Override
    public void hacerCampaña(String mensaje) {
        if (super.getEncendido()){
            System.out.println("Conectando con la antena más cercana");
            if (saldo > 0) {
                System.out.println(mensaje);
            }
        }
    }
}

