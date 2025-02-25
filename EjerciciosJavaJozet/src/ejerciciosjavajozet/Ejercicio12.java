package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio12 {

    public static void CajeroAutomatico() {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.00; // Saldo inicial de la cuenta
        double montoRetirar;

        System.out.println("Bienvenido al Cajero Automático.");
        
        // Bucle para solicitar un monto válido hasta que sea correcto
        while (true) {
            System.out.print("Ingrese el monto que desea retirar: ");
            montoRetirar = scanner.nextDouble();

            if (montoRetirar > saldo) {
                System.out.println("Error: El monto ingresado excede el saldo disponible.");
            } else if (montoRetirar <= 0) {
                System.out.println("Error: El monto debe ser positivo.");
            } else {
                saldo -= montoRetirar;
                System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
                break; // Salir del bucle una vez que el retiro es exitoso
            }
        }
    }
}

