package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio26 {

    public static void AgendaContactos() {
        Scanner scanner = new Scanner(System.in);
        String contactos = "";
        String respuesta;

        do {
            System.out.print("Ingrese el nombre del contacto por favor: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el número de teléfono por favor: ");
            String telefono = scanner.nextLine();
            contactos += "Nombre: " + nombre + " - Teléfono: " + telefono + "\n";
            System.out.print("¿Desea agregar otro contacto selecciones señor usuario? (sí/no): ");
            respuesta = scanner.nextLine().toLowerCase();

        } 
        while (respuesta.equals("sí"));
        System.out.println("\nLista de contactos registrados:");
        System.out.println(contactos);
        scanner.close();
    }
}
