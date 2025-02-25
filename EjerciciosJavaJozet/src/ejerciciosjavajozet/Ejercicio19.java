package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio19 {

    public static void ComidasRapidas() {
        Scanner scanner = new Scanner(System.in);
        double costoTotal = 0;
        int opcion;
        
        do {
            System.out.println("Menú de Comidas Rápidas:");
            System.out.println("1. Hamburguesa - $5.00");
            System.out.println("2. Papas fritas - $2.50");
            System.out.println("3. Refresco - $1.50");
            System.out.println("4. Pizza - $8.00");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción (1-5): ");
            
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    costoTotal += 5.00;
                    System.out.println("Hamburguesa agregada a tu pedido.");
                    break;
                case 2:
                    costoTotal += 2.50;
                    System.out.println("Papas fritas agregadas a tu pedido.");
                    break;
                case 3:
                    costoTotal += 1.50;
                    System.out.println("Refresco agregado a tu pedido.");
                    break;
                case 4:
                    costoTotal += 8.00;
                    System.out.println("Pizza agregada a tu pedido.");
                    break;
                case 5:
                    System.out.println("Gracias por tu pedido.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 5.");
            }
            
        } 
        while (opcion != 5);
        System.out.println("El costo total de tu pedido es: $" + costoTotal);
        System.out.println("¡Gracias por tu compra! ¡Que disfrutes tu comida!");
        scanner.close();
    }
}


