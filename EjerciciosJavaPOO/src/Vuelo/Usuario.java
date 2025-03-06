package Vuelo;
import java.util.Scanner;
public class Usuario {
    private String nombre;
    private Scanner scanner;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.scanner = new Scanner(System.in);
    }

    public void realizarReserva(Vuelo vuelo) {
        System.out.println("Bienvenido sr usuario " + nombre + ", Empezemos con tu reserva.");
        while (vuelo.AsientosDisponibles()) {
            vuelo.mostrarAsientosDisponibles();
            System.out.print("Selecciona el número de asiento que deseas reservar por favor: ");
            int numeroAsiento = scanner.nextInt() - 1; 

            if (vuelo.reservarAsiento(numeroAsiento)) {
                System.out.println("Reserva exitosa " + (numeroAsiento + 1));
            } else {
                System.out.println("El asiento seleccionado ya está ocupado o no existe. Intenta de nuevo por favor.");
            }
        }
        System.out.println("No hay más asientos disponibles.");
    }
}

