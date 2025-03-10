/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendacontrol;

import java.util.Random;

public class Usuario {
    private static final Random random = new Random();
    private int TipoMembresia; // 
    private int hora;

    public Usuario() {
        this.TipoMembresia = random.nextInt(3); 
        this.hora = random.nextInt(24);
    }

    public void validarEntrada() {
        String resultado;
        if (TipoMembresia == 1 && hora >= 6 && hora <= 18) {
            resultado = "El cliente tiene membresía y pudo entrar.";
        } else if (TipoMembresia == 2 && hora >= 6 && hora <= 18) {
            resultado = "El cliente es empleado y pudo entrar.";
        } else {
            resultado = "El cliente no pudo entrar.";
        }
        TiendaControl.mostrarResultado(resultado);
    }

    public int getHora() {
        return hora;
    }
}
