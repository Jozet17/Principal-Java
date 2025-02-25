package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio4 {
    public static void SensorTemperatura() {
        System.out.println("Ejercicio 4: Simulación de sensor de temperatura");
        tomardatos();
    }
    
    public static void tomardatos() {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese la temperatura actual: ");
        double temperatura = dato.nextDouble();
        ProcesoTemperatura.procesarInfo(temperatura);
    }
}

class ProcesoTemperatura {
    public static void procesarInfo(double temperatura) {
        System.out.println("Temperatura ingresada: " + temperatura + "°C");
        double tempMin = 18.0;
        double tempMax = 25.0;
        if (temperatura >= tempMin && temperatura <= tempMax) {
            MostrarTemperatura.mostrarInfo(true);
        } else {
            MostrarTemperatura.mostrarInfo(false);
        }
    }
}

class MostrarTemperatura {
    public static void mostrarInfo(boolean estado) {
        if (estado) {
            System.out.println("La temperatura es adecuada.");
        } else {
            System.out.println("La temperatura está fuera del rango deseado.");
        }
    }
}
