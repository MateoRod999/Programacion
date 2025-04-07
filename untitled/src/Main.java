import java.util.Locale;

public class Main {
    public static void main(String[] args) {
       String text = "y una polla";
       int pito = text.length();
        System.out.println(pito);

        String texto = text.replace("polla","poronga");
        System.out.println(texto);

        System.out.println(texto.endsWith("poronga"));
        System.out.println(texto.startsWith("y"));
        System.out.println(texto.contains("oro"));
        System.out.println(texto.indexOf("un"));

        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());

        String malo = "   me cago en la puta   ";
        System.out.println(malo.trim());
        System.out.println(malo);


    }
}