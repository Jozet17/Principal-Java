package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio14 {

    public static void Impresora() {
        Scanner scanner = new Scanner(System.in);
        int capacidadPapel = 100; 
        int papelRestante = capacidadPapel;
        System.out.println("Bienvenido a la impresora.");
        
        while (papelRestante > 0) {
            System.out.print("¿Cuántas páginas desea imprimir? (quedan " + papelRestante + " páginas disponibles): ");
            int paginasAImprimir = scanner.nextInt();
            if (paginasAImprimir > papelRestante) {
                System.out.println("Error: No hay suficiente papel para imprimir " + paginasAImprimir + " páginas.");
                System.out.println("Solo quedan " + papelRestante + " páginas disponibles.");
            } else {
                papelRestante -= paginasAImprimir;
                System.out.println("Imprimiendo " + paginasAImprimir + " páginas...");
                System.out.println("Papel restante: " + papelRestante + " páginas.");
            }
            
            if (papelRestante > 0) {
                System.out.print("¿Desea imprimir más páginas? (sí/no): ");
                String respuesta = scanner.next().toLowerCase();
                if (respuesta.equals("no")) {
                    break;  
                }
            }
        }
        System.out.println("La impresora ha terminado. No hay más papel disponible.");
    }
}
