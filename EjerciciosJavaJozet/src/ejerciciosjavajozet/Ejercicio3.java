package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio3 {
    public static void Ascensor() {
        System.out.println("Ejercicio 3: Simulación de un ascensor con límite de peso");
        tomardatos();
    }
    
    public static void tomardatos(){
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese su peso en kg: ");
        int peso = dato.nextInt();
        System.out.print("Ingrese el piso al que desea ir (0-10): ");
        int opcion = dato.nextInt();
        ProcesoAsc.procesarInfo(peso, opcion);
    }
}

class ProcesoAsc {
    public static void procesarInfo(int peso, int opcion) {
        System.out.println("Peso ingresado: " + peso + " kg");
        System.out.println("Opción ingresada: " + opcion);
        int limitePeso = 1000; 
        if (peso <= limitePeso) {
            if (opcion <= 10 && opcion >= 0) {
                Mostrar2.mostrarInfo(true, opcion);
            } else {
                Mostrar2.mostrarInfo(false, opcion);
            }
        } else {
            Mostrar2.mostrarInfo(false, peso);
        }
    }
}

class Mostrar2 {
    public static void mostrarInfo(boolean estado, int opcion) {
        if (estado) {
            System.out.println("El ascensor se está moviendo al piso " + opcion);
        } else {
            if (opcion > 10 || opcion < 0) {
                System.out.println("No existe el piso " + opcion);
            } else {
                System.out.println("El ascensor está sobrecargado. El peso excede el límite permitido.");
            }
        }
    }
}

