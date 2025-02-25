package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio16 {

    public static void CuentaRegresiva() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo para iniciar la cuenta regresiva por favor: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número positivo.");
        } else {
       
            while (numero >= 0) {
                System.out.println(numero);
                numero--;  
            }
            System.out.println("¡Tiempo cumplido!");
        }
    }
}


    

