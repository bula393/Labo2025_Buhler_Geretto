package random;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int DIA, int MES, int ANIO) {
        dia = DIA;
        mes = MES;
        anio = ANIO;
    }

    public Fecha() {
        dia = 1;
        mes = 1;
        anio = 2000;
    }

    public int getDía() {
        return dia;
    }

    public int getMES() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int Dia) {
        dia = Dia;
    }

    public void setMes(int Mes) {
        mes = Mes;
    }

    public void setAnio(int Anio) {
        anio = Anio;
    }

    public void valida() {
        boolean valida = true;
        if (anio < 0) {
            anio = 2000;
            valida = false;
        }
        if (mes < 0 || mes > 12) {
            mes = 1;
            valida = false;
        }
        if (dia < 0 || dia > this.diasMes()) {
            dia = 15;
            valida = false;
        }
        if (valida) {
            System.out.println("La fecha es valida");
        } else {
            System.out.println("La fecha es invalida");
        }
    }

    public int diasMes() {
        int dias = 0;
        switch (this.mes) {
            case 1:
                dias = 31;
                break;
            case 2:
                dias = 28;
                break;
            case 3:
                dias = 31;
                break;
            case 4:
                dias = 30;
                break;
            case 5:
                dias = 31;
                break;
            case 6:
                dias = 30;
                break;
            case 7:
                dias = 31;
                break;
            case 8:
                dias = 31;
                break;
            case 9:
                dias = 30;
                break;
            case 10:
                dias = 31;
                break;
            case 11:
                dias = 30;
                break;
            case 12:
                dias = 31;
                break;
        }
        return dias;
    }

    public void corta() {
        System.out.println(dia + "-" + mes + "-" + anio);
    }

    public void larga() {
        String Mes = "";
        String s_dia = "";
        if(dia==1||dia==8||dia==15||dia==22||dia==29){
            s_dia="lunes";
        }
        else if(dia==2||dia==9||dia==16||dia==23||dia==30){
            s_dia="martes";
        }
        else if(dia==3||dia==10||dia==17||dia==24||dia==31){
            s_dia="miercoles";
        }
        else if(dia==4||dia==11||dia==18||dia==25){
            s_dia="jueves";
        }
        else if(dia==5||dia==12||dia==19||dia==26){
            s_dia="viernes";
        }
        else if(dia==6||dia==13||dia==20||dia==27){
            s_dia="sabado";
        }
        else if(dia==7||dia==14||dia==21||dia==28){
            s_dia="sabado";
        }
        switch (mes) {
            case 1:
                Mes = "enero";
                break;
            case 2:
                Mes = "febrero";
                break;
            case 3:
                Mes = "marzo";
                break;
            case 4:
                Mes = "abril";
                break;
            case 5:
                Mes = "mayo";
                break;
            case 6:
                Mes = "junio";
                break;
            case 7:
                Mes = "julio";
                break;
            case 8:
                Mes = "agosto";
                break;
            case 9:
                Mes = "septiembre";
                break;
            case 10:
                Mes = "octubre";
                break;
            case 11:
                Mes = "noviembre";
                break;
            case 12:
                Mes = "diciembre";
                break;
        }

        System.out.println("día de la semana "+ s_dia + dia + " de " + Mes + "de" + anio);
    }

    public void siguiente() {
        dia++;
        if (dia > diasMes()) {
            mes++;
            dia = 1;
        }
        if (mes > 12) {
            anio++;
            mes = 1;
        }
    }

    public void anterior() {
        dia--;
        if (dia < 1) {
            mes--;
            dia = diasMes();
        }
        if (mes < 1) {
            anio--;
            mes = 12;
        }
    }

    public void igualQue(Fecha fecha1, Fecha fecha2) {
        if ((fecha1.getDía() == fecha2.getDía()) && (fecha1.getMES() == fecha2.getMES()) && (fecha1.getAnio() == fecha2.getAnio())) {
            System.out.println("son iguales");
        } else {
            System.out.println("son diferentes");
        }

    }

    public void menorQue(Fecha fecha1, Fecha fecha2) {

        boolean menor = false;
        if (fecha1.getAnio() < fecha2.getAnio()) {
            menor = true;
        } else if (fecha1.getMES() < fecha2.getMES()) {
            menor = true;
        } else if (fecha1.getDía() < fecha2.getDía()) {
            menor = true;
        }

        if (menor) {
            System.out.println("Es menor");
        } else {
            System.out.println("no es menor");
        }

    }

    public void mayorQue(Fecha fecha1, Fecha fecha2) {

        boolean mayor = false;
        if (fecha1.getAnio() > fecha2.getAnio()) {
            mayor = true;
        } else if (fecha1.getMES() > fecha2.getMES()) {
            mayor = true;
        } else if (fecha1.getDía() > fecha2.getDía()) {
            mayor = true;
        }

        if (mayor) {
            System.out.println("Es mayor");
        } else {
            System.out.println("no es mayor");
        }

    }

    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(15, 5, 2023);
        Fecha fecha2 = new Fecha(12, 8, 2022);
        Fecha fecha3 = new Fecha(15, 5, 2023);

        fecha1.valida();
        fecha2.valida();

        System.out.println("fecha 1:");
        fecha1.corta();
        fecha1.larga();

        System.out.println("fecha 2:");
        fecha2.corta();
        fecha2.larga();

        System.out.println("Comparación de fechas:");
        fecha1.igualQue(fecha1, fecha3);
        fecha1.menorQue(fecha1, fecha2);
        fecha1.mayorQue(fecha1, fecha2);

        System.out.println("Avanzar un día desde fecha 1:");
        fecha1.siguiente();
        fecha1.corta();

        System.out.println("Retroceder un día desde fecha 2:");
        fecha2.anterior();
        fecha2.corta();
    }
}
