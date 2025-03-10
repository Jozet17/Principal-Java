/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Alarma.java
package sensoralarma;

public class Alarmita {
    private boolean activada = false;

    public void activar() { activada = true; }
    public void desactivar() { activada = false; }
    public boolean isActivada() { return activada; }
    public void mostrarEstado() {
        System.out.println(activada ? "¡Alerta, Alarma activada!" : "Alerta, Alarma desactivada.");
    }
}
