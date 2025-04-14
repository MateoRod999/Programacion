import java.util.Scanner;
public class Main {
    public static void main() {
        int Nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nota: ");
        Nota = sc.nextInt();
        if (Nota < 4){
            System.out.println("Desaprobaste la materia");
        } else if (Nota==10) {
            System.out.println("Usted obtuvo un Sobresaliente, Felicitaciones!");

        }
        else {
            System.out.println("Usted aprobó la materia, sigue así.");
        }
    }
}