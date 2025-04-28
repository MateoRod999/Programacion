import java.util.Scanner;

public class Banco {
    private double saldo;
    private String nombre;
    private int numCuenta;
    private Scanner scanner = new Scanner(System.in);

    public Banco(double saldo, String nombre, int numCuenta) {
        this.saldo = saldo;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void cuenta() {
        boolean acceso;
        do {
            acceso = false;
            System.out.println("Ingrese el nombre de usuario: ");
            String confirmacionNom = scanner.nextLine();
            System.out.println("Ingrese su número de cuenta: ");
            int confnumCuenta = scanner.nextInt();
            scanner.nextLine();

            if (nombre.equalsIgnoreCase(confirmacionNom) && numCuenta == confnumCuenta) {
                System.out.println("Bienvenido a su cuenta: " + nombre);
                acceso = true;
            } else {
                System.out.println("Ingreso una cuenta inexistente.\n\nRedirigiendo al login...\n\n");
            }
        } while (!acceso);
    }

    public void depositar() {
        System.out.println("¿Cuánto desea depositar?");
        double deposito = scanner.nextDouble();
        scanner.nextLine();
        if (deposito < 0) {
            System.out.println("Ingrese un número válido...");
        } else {
            saldo += deposito;
            System.out.printf("Se han depositado %.2f. Su nuevo saldo es: %.2f\n", deposito, saldo);
        }
    }

    public void retirar() {
        System.out.println("¿Cuánto desea retirar?");
        double retirar = scanner.nextDouble();
        scanner.nextLine();
        if (retirar > saldo) {
            System.out.println("No puede retirar más dinero del que posee...");
        } else {
            saldo -= retirar;
            System.out.printf("Acción realizada, retiró %.2f. Su nuevo saldo es: %.2f\n", retirar, saldo);
        }
    }

    public void consultarSaldo() {
        System.out.printf("Su saldo es: %.2f\n", saldo);
    }
}