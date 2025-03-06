package Vuelo;

public class Principal {
    public static void main(String[] args) {
        Vuelo vuelo = new Vuelo(5); 
        Usuario usuario = new Usuario("");
        usuario.realizarReserva(vuelo);
    }
}

