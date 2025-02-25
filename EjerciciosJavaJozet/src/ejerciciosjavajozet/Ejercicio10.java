package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio10 {
    public static void Clasificacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el resultado del partido (ganado, perdido, empatado): ");
        String resultado = scanner.next().toLowerCase();
        int puntosEquipo1 = 0;
        int puntosEquipo2 = 0;

        switch (resultado) {
            case "ganado":
                puntosEquipo1 += 3;
                System.out.println("Equipo 1 gana 3 puntos.");
                break;
            case "perdido":
                puntosEquipo2 += 3;
                System.out.println("Equipo 2 gana 3 puntos.");
                break;
            case "empate":
                puntosEquipo1 += 1;
                puntosEquipo2 += 1;
                System.out.println("Empate, ambos equipos ganan 1 punto.");
                break;
            default:
                System.out.println("Resultado inválido.");
                return; // Salir si el resultado es inválido
        }

        System.out.println("Clasificación actual:");
        System.out.println("Equipo 1: " + puntosEquipo1 + " puntos.");
        System.out.println("Equipo 2: " + puntosEquipo2 + " puntos.");
    }

}

