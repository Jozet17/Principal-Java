/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luces;
import java.util.Random;

public class Luces {
    private boolean Noche() {
        return new Random().nextBoolean(); 
    }

    private boolean hayMovimiento() {
        return new Random().nextBoolean(); 
    }

    public void iniciarControl() {
        while (true) {
            boolean lucesPrendidas;

            if (Noche() && hayMovimiento()) {
                lucesPrendidas = true; 
            } else {
                lucesPrendidas = false; 
            }

            if (lucesPrendidas) {
                System.out.println("Las luces están Prendidas .");
            } else {
                System.out.println("Las luces están apagadas.");
            }

            try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
                // Esto lo que hace es esperar 10 segundos
            }
        }
    }
}

