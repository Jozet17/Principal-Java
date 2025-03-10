/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aire;

public class Aire {
    private boolean encendido;

    public void verificarEstado(double temperatura, double humedad) {
        encendido = (temperatura > 28 && humedad > 60) || (temperatura > 30);
    }

    public boolean Encendido() {
        return encendido;
    }

    public void mostrarEstado() {
        if (encendido) {
            System.out.println("Aire acondicionado encendido");
        } else {
            System.out.println("Aire acondicionado apagado");
        }
    }
}
