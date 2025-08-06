package pago_empleados;

public enum Tipo_diseñador {
    UX(8),UI(7),IT(12);

    private int comicion;

    Tipo_diseñador(int comicion) {
        this.comicion = comicion;
    }
}
