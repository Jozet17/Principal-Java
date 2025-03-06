/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sensor;

public class Principal {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();

        while (true) {
            double temperatura = sensor.leerTemperaturaS();
            System.out.println("Temperatura leída: " + temperatura + "°C");
            sensor.mostrarResultado(temperatura);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Error :): " + e.getMessage());
            }
        }
    }
}
// En el main lo que hice fue crear un bucle que le temperatura y que muestre y luego de eso esperar 5 segundos
