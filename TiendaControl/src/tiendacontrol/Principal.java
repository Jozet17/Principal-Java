/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendacontrol;

public class Principal {
    public static void main(String[] args) {
        // Aqui lo que se hace es simular la entrada de 3 clientes
        for (int i = 0; i < 3; i++) {
            Usuario cliente = new Usuario();
            System.out.println("Cliente " + (i + 1) + ": Hora actual: " + cliente.getHora());
            cliente.validarEntrada();
        }
    }
}
