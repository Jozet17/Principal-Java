package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio22 {
    public static void GestionTareas() {
        Scanner scanner = new Scanner(System.in);
        String tareasRegistradas = ""; 
        String respuesta;

        do {
            System.out.print("Ingrese la descripción de la tarea que deseas por favor: ");
            String descripcion = scanner.nextLine();
            System.out.print("Ingrese la fecha de vencimiento (DD/MM/YYYY) por favor: ");
            String fechaVencimiento = scanner.nextLine();
            tareasRegistradas += "Tarea: " + descripcion + "\nFecha de vencimiento: " + fechaVencimiento + "\n\n";
            System.out.print("¿Desea agregar otra tarea? (sí/no): ");
            respuesta = scanner.nextLine().toLowerCase();
        } 
        while (respuesta.equals("sí"));
        System.out.println("\nLista de tareas registradas:");
        System.out.println(tareasRegistradas);
        scanner.close();
    }
}


