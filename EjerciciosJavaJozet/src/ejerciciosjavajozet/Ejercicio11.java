package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio11 {

    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        System.out.println("Menú de platos: 1. $10, 2. $15, 3. $20");
        System.out.print("Seleccione los platos (ejemplo: 1 2): ");
        String platos = scanner.nextLine();
        System.out.println("Menú de bebidas: 4. $5, 5. $3, 6. $4");
        System.out.print("Seleccione las bebidas (ejemplo: 4 5): ");
        String bebidas = scanner.nextLine();
        
        for (String plato : platos.split(" ")) {
            if (plato.equals("1")) total += 10;
            if (plato.equals("2")) total += 15;
            if (plato.equals("3")) total += 20;
        }
        
        for (String bebida : bebidas.split(" ")) {
            if (bebida.equals("4")) total += 5;
            if (bebida.equals("5")) total += 3;
            if (bebida.equals("6")) total += 4;
        }
        
        System.out.println("Método de pago: 1. Efectivo, 2. Tarjeta, 3. Cheque");
        System.out.print("Seleccione el método de pago: ");
        int metodoPago = scanner.nextInt();
        double descuento = 0;
        if (metodoPago == 1) descuento = total * 0.10; 
        if (metodoPago == 2) descuento = total * 0.05; 
        if (metodoPago == 3) descuento = total * 0.07; 
        double totalConDescuento = total - descuento;
        System.out.println("Total: $" + total);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);
    }
}

