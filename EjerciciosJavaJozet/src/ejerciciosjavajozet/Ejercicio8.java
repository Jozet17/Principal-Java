package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio8 {
    public static void IMC() {
        Scanner dato = new Scanner(System.in);
        
        // Solicitar datos al usuario
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = dato.nextDouble();
        
        System.out.print("Ingrese su altura en metros: ");
        double altura = dato.nextDouble();
        
        // Validar que los valores ingresados sean positivos
        if (peso > 0 && altura > 0) {
            // Calcular el IMC
            double imc = peso / (altura * altura);
            
            // Determinar la categoría del IMC
            String categoria = "";
            if (imc < 18.5) {
                categoria = "Bajo peso";
            } else if (imc < 24.9) {
                categoria = "Peso normal";
            } else if (imc < 29.9) {
                categoria = "Sobrepeso";
            } else {
                categoria = "Obesidad";
            }
            
            // Mostrar el resultado
            System.out.println("Su IMC es: " + imc);
            System.out.println("Categoría: " + categoria);
        } else {
            System.out.println("Por favor, ingrese valores válidos para peso y altura.");
        }
        
        dato.close(); // Cerrar el scanner
    }
}
