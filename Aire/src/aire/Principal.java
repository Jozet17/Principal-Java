/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aire;
import java.util.Scanner;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Aire aireAcondicionado = new Aire();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuar = true;

        while (continuar) {
            double temperatura = 20 + random.nextDouble() * 20; 
            double humedad = random.nextDouble() * 100; 
            aireAcondicionado.verificarEstado(temperatura, humedad);
            aireAcondicionado.mostrarEstado();
            System.out.println("¿Desea continuar con el proceso? (s/n)");
            char opc = scanner.next().toLowerCase().charAt(0);
            continuar = (opc == 's');
        }

        scanner.close();
        System.out.println("Simulación finalizada xd.");
    }
}
