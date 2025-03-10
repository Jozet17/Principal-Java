/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// Sensor.java
package sensoralarma;

import java.util.Random;

public class SensorAlarma {
    public boolean detectarMovimiento() {
        return new Random().nextBoolean(); 
    }
}

