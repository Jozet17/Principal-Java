package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio15 {

    public static void Viaje() {
        Scanner scanner = new Scanner(System.in);
        boolean continuarViaje = true; 

        while (continuarViaje) {
            System.out.print("Ingrese la distancia total del viaje que se va a recorrer: ");
            double distancia = scanner.nextDouble();
            System.out.print("Ingrese la velocidad promedio del coche (en km/h): ");
            double velocidad = scanner.nextDouble();
            
            if (velocidad > 0) {
                double tiempo = distancia / velocidad;  // El tiempo en horas
                System.out.println("El tiempo estimado de viaje es: " + tiempo + " horas.");
            } else {
                System.out.println("La velocidad debe ser mayor a 0.");
            }
            System.out.print("¿Desea hacer otro viaje? (sí/no): ");
            String respuesta = scanner.next().toLowerCase();

            if (respuesta.equals("no")) {
                continuarViaje = false;
            }
        }

        System.out.println("Gracias por usar el simulador de viajes en coche.");
    }
}

