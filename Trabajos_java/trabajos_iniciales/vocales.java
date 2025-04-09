public class vocales {
    public static void main(String[] args) {
        String frase = "Ayer me compré muñecos de la marca ‘ToyCo’ por internet." ;
        System.out.println(frase);
        frase = frase.toLowerCase();
        int cant = 0;
        for (int i = 0; i < frase.length(); i++) {

              if ((frase.charAt(i)=='a')||(frase.charAt(i)=='e')||(frase.charAt(i)=='i')||(frase.charAt(i)=='o')||(frase.charAt(i)=='u')){
            cant++;
        }

        }
        System.out.println("la cantidad de vocales es de :" + cant);
    }
}
