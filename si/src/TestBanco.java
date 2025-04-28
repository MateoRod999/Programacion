import java.util.Scanner;

public class TestBanco {
    public static void main(String[] args) {
        Banco miCuenta = new Banco(1000, "Roberto", 99923);
        int opcion;
        Scanner decision = new Scanner(System.in);

        miCuenta.cuenta();

        do {
            System.out.println("\nElija una opción\n");
            System.out.println("1. Depositar saldo");
            System.out.println("2. Ver saldo");
            System.out.println("3. Retirar saldo");
            System.out.println("4. Salir...\n");
            opcion = decision.nextInt();
            decision.nextLine();

            switch (opcion) {
                case 1:
                    miCuenta.depositar();
                    break;
                case 2:
                    miCuenta.consultarSaldo();
                    break;
                case 3:
                    miCuenta.retirar();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingreso un valor incorrecto...");
                    break;
            }
        } while (opcion != 4);

        decision.close();
    }
}