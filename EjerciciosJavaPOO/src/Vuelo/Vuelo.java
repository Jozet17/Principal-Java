package Vuelo;
public class Vuelo {
    private int capacidadTotal;
    private boolean[] asientos;

    public Vuelo(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        asientos = new boolean[capacidadTotal]; 
    }
    
    public boolean AsientosDisponibles() {
        for (boolean asiento : asientos) {
            if (!asiento) { 
                return true;
            }
        }
        return false;
    }

    public boolean reservarAsiento(int numeroAsiento) {
        if (numeroAsiento >= 0 && numeroAsiento < capacidadTotal && !asientos[numeroAsiento]) {
            asientos[numeroAsiento] = true; 
            return true;
        }
        return false; 
    }

    public void mostrarAsientosDisponibles() {
        System.out.println("Asientos disponibles:");
        for (int i = 0; i < capacidadTotal; i++) {
            if (!asientos[i]) {
                System.out.println("Asiento " + (i + 1));
            }
        }
    }
}
