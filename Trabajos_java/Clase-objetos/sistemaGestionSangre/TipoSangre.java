package sistemaGestionSangre;

public class TipoSangre {
    private CaracteresSangre caracteresSangre;
    private Signo signo;

    public TipoSangre(CaracteresSangre caracteresSangre, Signo signo) {
        this.caracteresSangre = caracteresSangre;
        this.signo = signo;
    }

    public TipoSangre(){
        this.caracteresSangre = CaracteresSangre.A;
        this.signo = Signo.NEGATIVO;
    }

    public CaracteresSangre getCaracteresSangre() {
        return caracteresSangre;
    }

    public void setCaracteresSangre(CaracteresSangre caracteresSangre) {
        this.caracteresSangre = caracteresSangre;
    }

    public Signo getSigno() {
        return signo;
    }

    public void setSigno(Signo signo) {
        this.signo = signo;
    }
}
