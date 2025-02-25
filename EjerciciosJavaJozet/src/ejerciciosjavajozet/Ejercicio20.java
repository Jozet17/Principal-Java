package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio20 {

    public static void SensorTemperatura() {
        Scanner scanner = new Scanner(System.in);
        double temperatura;

        do {
            System.out.print("Ingrese la temperatura actual: ");
            temperatura = scanner.nextDouble();

            if (temperatura < 18 || temperatura > 25) {
                System.out.println("¡Alerta! La temperatura no está en el rango aceptable (18°C - 25°C).");
            }
        } while (temperatura < 18 || temperatura > 25);

        System.out.println("La temperatura " + temperatura + "°C está dentro del rango aceptable.");
        scanner.close();
    }
}

