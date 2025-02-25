package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio18 {

    public static void Biblioteca() {
        Scanner scanner = new Scanner(System.in);
        String librosRegistrados = ""; 
        String respuesta;
        
        do {
            System.out.print("Ingrese el título del libro: ");
            String titulo = scanner.nextLine();
            System.out.print("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();
            System.out.print("Ingrese el número de páginas: ");
            int paginas = scanner.nextInt();
            scanner.nextLine(); 
            librosRegistrados += "Título: " + titulo + "\nAutor: " + autor + "\nPáginas: " + paginas + "\n\n";

            System.out.print("¿Desea registrar otro libro? (sí/no): ");
            respuesta = scanner.nextLine().toLowerCase();
        } 
        while (respuesta.equals("sí"));
        System.out.println("\nLibros registrados:\n" + librosRegistrados);
        scanner.close();
    }
}




