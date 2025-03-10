/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Principal.java
package sensoralarma;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        SensorAlarma[] sensores = { new SensorAlarma(), new SensorAlarma(), new SensorAlarma() };
        Alarmita alarma = new Alarmita();
        Scanner scanner = new Scanner(System.in);
        boolean Noche = true; 

        while (true) {
            int detecciones = 0;
            for (SensorAlarma sensor : sensores) {
                if (sensor.detectarMovimiento()) detecciones++;
            }

            if (Noche && detecciones >= 2) alarma.activar();
            else alarma.desactivar();
            alarma.mostrarEstado();
            System.out.println("1.Activar alarma\n2.Desactivar alarma\n3.Salir");
            System.out.print("Seleccione una opción que quiera por favor: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1: alarma.activar(); break;
                case 2: alarma.desactivar(); break;
                case 3: scanner.close(); return;
                default: System.out.println("Opción no válida, lo sentimos.");
            }
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            // Aqui lo que hace es que introduce un retraso de 1 segundo en la ejecución del programa y maneja cualquier posible interrupción que pueda ocurrir durante ese tiempo.
        }
    }
}
