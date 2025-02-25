package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio24 {

    public static void RegistroDeVehiculos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos vehículos ingresarán al parqueadero? ");
        int numeroVehiculos = scanner.nextInt();
        scanner.nextLine(); 
        String placas = "";
        String horasIngreso = "";

        for (int i = 1; i <= numeroVehiculos; i++) {
            System.out.print("Ingrese la placa del vehículo #" + i + ": ");
            String placa = scanner.nextLine();
            placas += placa + "\n";  

            System.out.print("Ingrese la hora de ingreso del vehículo por favor " + i + ": ");
            String horaIngreso = scanner.nextLine();
            horasIngreso += horaIngreso + "\n";
        }
        System.out.println("\nResumen de vehículos registrados:");
        System.out.println("Placas:\n" + placas);
        System.out.println("Horas de ingreso:\n" + horasIngreso);
        scanner.close();
    }
}

