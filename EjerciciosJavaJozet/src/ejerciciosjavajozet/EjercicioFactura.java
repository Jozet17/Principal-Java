package ejerciciosjavajozet;
import java.util.Scanner;

public class EjercicioFactura {

    public static void main(String[] args) {
        Scanner objleer = new Scanner(System.in);
        String nombreCliente = "Jozet Buendia";
        String producto = "Colanta";
        int cantidad = 5;
        double precio = 20.000;
        System.out.print("Ingrese la cantidad del producto: ");
        cantidad = objleer.nextInt();
        double subtotal = cantidad * precio;
        double impuesto = subtotal * 0.13; 
        double total = subtotal + impuesto;
        System.out.println("\nFactura de Compra:");
        System.out.println("--------------------");
        System.out.println("Nombre del Cliente: " + nombreCliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: $" + precio);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto (13%): $" + impuesto);
        System.out.println("Total: $" + total);
        objleer.close();
    }
}