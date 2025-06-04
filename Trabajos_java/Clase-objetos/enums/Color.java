package enums;

public enum Color {
    ROJO("ff0000"),VERDE("008000"),AZUL("0000ff"),NEGRO("000000"),BLANCO("ffffff"),AMARILLO("ffff00");
    private String codigo;
    private Color(String codigo){
        this.codigo=codigo;
    }

}
