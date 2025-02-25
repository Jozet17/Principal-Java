package ejerciciosjavajozet;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio17 {

    public static void Juego() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        int intentos = 0;
        System.out.println("¡Bienvenido señor usuario al juego de adivinanza!");
        System.out.println("Piense en un número entre 1 y 100. ¡Intenta adivinarlo!");

        while (true) {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor. Intenta nuevamente.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor. Intenta nuevamente.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                break; 
            }
        }
        scanner.close();
    }
}
