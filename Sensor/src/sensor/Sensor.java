/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sensor;
import java.util.Random;

public class Sensor {
    private Random random;

    public Sensor() {
        random = new Random();
    }

    public double leerTemperaturaS() {
        return random.nextDouble() * 40;
    }

    public void mostrarResultado(double temperatura) {
        if (temperatura < 10) {
            System.out.println("Calefactor: Esta Activado");
            System.out.println("Ventilador: Esta Desactivado");
        } else if (temperatura > 25) {
            System.out.println("Calefactor: Esta Desactivado");
            System.out.println("Ventilador: Esta Activado");
        } else {
            System.out.println("Calefactor: Esta Desactivado");
            System.out.println("Ventilador: Esta Desactivado");
        }
    }
}