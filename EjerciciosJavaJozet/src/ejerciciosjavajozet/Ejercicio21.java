package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio21 {

    public static void Examenes() {
        Scanner scanner = new Scanner(System.in);
        double totalNotas = 0;
        int cantidadExamenes = 0;
        double promedio;
        String respuesta;

        do {
            System.out.print("Ingrese la calificación del examen: ");
            double nota = scanner.nextDouble();
            totalNotas += nota;
            cantidadExamenes++;
            System.out.print("¿Desea ingresar otro examen? (sí/no): ");
            respuesta = scanner.next().toLowerCase();

        } 
        while (respuesta.equals("sí"));

        if (cantidadExamenes > 0) {
            promedio = totalNotas / cantidadExamenes;
            System.out.println("\nPromedio de los exámenes: " + promedio);
            if (promedio >= 6) {
                System.out.println("¡Felicidades, has aprobado!");
            } else {
                System.out.println("Lo siento, has reprobado.");
            }
        } else {
            System.out.println("No se ingresaron resultados.");
        }
        scanner.close();
    }
}

