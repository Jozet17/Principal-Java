package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio25 {

    public static void CarritoCompras() {
        Scanner scanner = new Scanner(System.in);
        double totalCompra = 0;  
        String productos = "";  
        String respuesta;

        do {
            System.out.print("Ingrese el nombre del producto por favor: ");
            String nombreProducto = scanner.nextLine();
            System.out.print("Ingrese el precio del producto por favor: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); 
            totalCompra += precio;
            productos += nombreProducto + " - $" + precio + "\n";
            System.out.print("¿Desea agregar otro producto señor usuario? (sí/no): ");
            respuesta = scanner.nextLine().toLowerCase();

        } 
        while (respuesta.equals("sí"));
        System.out.println("\nResumen de la compra:");
        System.out.println(productos);
        System.out.println("Total de la compra: $" + totalCompra);
        scanner.close();
    }
}
