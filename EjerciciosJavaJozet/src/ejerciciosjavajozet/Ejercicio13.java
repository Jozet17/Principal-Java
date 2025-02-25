package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio13 {

    public static void TiendaEnLinea() {
        Scanner scanner = new Scanner(System.in);
        double costoTotal = 0;
        boolean agregarOtroProducto = true;
        System.out.println("Bienvenido a la tienda de compra en línea.");
        
        while (agregarOtroProducto) {
            // Solicitar el precio del producto y la cantidad que se desea :)
            System.out.print("Ingrese el precio del producto: ");
            double precioProducto = scanner.nextDouble();
            System.out.print("Ingrese la cantidad que desea comprar por favor: ");
            int cantidad = scanner.nextInt();
            double costoProducto = precioProducto * cantidad;
            costoTotal += costoProducto;    
            System.out.println("Costo del producto: $" + costoProducto);
            System.out.print("¿Desea agregar otro producto? (sí/no): ");
            String respuesta = scanner.next().toLowerCase();
            if (respuesta.equals("no")) {
                agregarOtroProducto = false;
            }
        }
        
        System.out.println("El costo total de su compra es: $" + costoTotal);
    }
}


