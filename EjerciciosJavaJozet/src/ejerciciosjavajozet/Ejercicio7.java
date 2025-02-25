package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio7 {
    public static void PrecioProductos() {
        double precioA = 50.0; 
        double precioV = 100.0; 
        double precioE = 200.0; 
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese el tipo de producto que desea comprar (A - Alimentos, V - Vestimenta, E - Electrónicos): ");
        char producto = dato.next().toUpperCase().charAt(0);

        if (producto == 'A' || producto == 'V' || producto == 'E') {
            System.out.print("Ingrese la cantidad de unidades: ");
            int cantidad = dato.nextInt();
            if (cantidad > 0) {
                double precioBase = 0;
                double descuento = 0;
                double costoConDescuento = 0;
                double costoSinDescuento = 0;
                // Aqui se usa switch-case para calcular el costo según el tipo de producto :)
                switch (producto) {
                    case 'A': 
                        precioBase = precioA;
                        descuento = 0.10;
                        break;
                    case 'V': 
                        precioBase = precioV;
                        descuento = 0.05; 
                        break;
                    case 'E': 
                        precioBase = precioE;
                        descuento = 0.0; 
                        break;
                }

                costoSinDescuento = precioBase * cantidad;
                costoConDescuento = costoSinDescuento - (costoSinDescuento * descuento);
                System.out.println("Costo sin descuento: $" + costoSinDescuento);
                System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
                System.out.println("Costo con descuento: $" + costoConDescuento);
            } else {
                System.out.println("La cantidad debe ser un número positivo.");
            }
        } else {
            System.out.println("Producto inválido. Por favor, ingrese A, V o E.");
        }
    }
}

