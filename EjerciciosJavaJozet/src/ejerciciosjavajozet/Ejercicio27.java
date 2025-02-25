package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio27 {

    public static void SumatoriaNumeros() {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        String respuesta;

        do {
            System.out.print("Ingrese un número: ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("¡Este no es un número válido lo sentimos! Intente de nuevo.");
                scanner.next(); 
                System.out.print("Ingrese un número: ");
            }

            int numero = scanner.nextInt();
            suma += numero;
            System.out.print("¿Desea ingresar otro número? (sí/no): ");
            scanner.nextLine(); 
            respuesta = scanner.nextLine().toLowerCase();

        } while (respuesta.equals("sí"));
        System.out.println("La sumatoria total de los números es: " + suma);
        scanner.close();
    }
}

