package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio5 {
    public static void Sensor() {
        double umbralAlerta = 30.0;
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese la temperatura actual por favor: ");
        double temperatura = dato.nextDouble();
        
        if (temperatura > umbralAlerta) {
            System.out.println("¡ALERTA! La temperatura está por encima del umbral de alerta.");
        } else {
            System.out.println("La temperatura es normal.");
        }
    }
}
