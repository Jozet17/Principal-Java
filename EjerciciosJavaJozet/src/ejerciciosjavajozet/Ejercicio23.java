package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio23 {
    
    public static void RegistroVentas() {
        Scanner scanner = new Scanner(System.in);
        double montoTotal = 0;
        String respuesta;

        do {
            System.out.print("Producto: ");
            String producto = scanner.nextLine();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();
            montoTotal += precio;
            System.out.print("¿Quieres registrar otra venta? (sí/no): ");
            respuesta = scanner.nextLine().toLowerCase();
        } 
        while (respuesta.equals("sí"));
        System.out.println("Monto total de las ventas: $" + montoTotal);
        scanner.close();
    }
}

