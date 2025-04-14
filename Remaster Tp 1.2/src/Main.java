import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        int nota1, nota2, nota3;
        Scanner si = new Scanner(in);
        out.println("Ingrese la nota de su primer parcial: ");
        nota1 = si.nextInt();
        out.println("Ingrese la nota de su segundo parcial: ");
        nota2 = si.nextInt();
        out.println("Ingrese la nota de su tercer parcial: ");
        nota3 = si.nextInt();

        if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10 && nota3 >= 0 && nota3 <= 10) {
            int suma = nota1 + nota2 + nota3;
            float promedio = suma / 3.0f;

            if (promedio >= 8) {
                out.println("Felicitaciones, promocionaste!\nTu promedio es: " + promedio);
            } else {
                out.println("Lo siento, pero tu promedio no es suficiente para promocionar.\nTu promedio es: " + promedio);
            }
        } else {
            out.println("Una o más notas ingresadas no son correctas, saliendo del programa...");
        }
    }
}