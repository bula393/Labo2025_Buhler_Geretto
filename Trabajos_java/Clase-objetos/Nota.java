public class Nota {
    int puntuacion;
    String materia;

    public Nota(int puntuacion, String materia) {
        this.puntuacion = puntuacion;
        this.materia = materia;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
