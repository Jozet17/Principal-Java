package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio28 {

    public static void VentasTienda() {
        Scanner scanner = new Scanner(System.in);
        double totalVentas = 0;
        String respuesta;

        do {
            System.out.print("Ingrese el nombre del producto por favor: ");
            String producto = scanner.nextLine();
            System.out.print("Ingrese el precio del producto por favor: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese la cantidad vendida por favor: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();  

            totalVentas += precio * cantidad;
            System.out.print("¿Desea registrar otra venta seleccione por favor? (sí/no): ");
            respuesta = scanner.nextLine().toLowerCase();
        } 
        while (respuesta.equals("sí"));
        System.out.println("Total de ventas: $" + totalVentas);
        scanner.close();
    }
}

