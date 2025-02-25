package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio6 {
    public static void PisoTemperatura() {
        double tempMin = 18.0;
        double tempMax = 25.0;
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese la temperatura actual por favor: ");
        double temperatura = dato.nextDouble();
        
        if (temperatura >= tempMin && temperatura <= tempMax) {
            System.out.print("Ingrese el piso al que desea ir (0-10): ");
            int piso = dato.nextInt();
            if (piso >= 0 && piso <= 10) {
                System.out.println("El ascensor se mueve al piso " + piso);
            } else {
                System.out.println("Este piso no existe el piso " + piso);
            }
        } else {
            System.out.println("La temperatura no es adecuada. El ascensor no puede moverse.");
        }
    }
}
