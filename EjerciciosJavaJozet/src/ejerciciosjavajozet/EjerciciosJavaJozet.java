package ejerciciosjavajozet;
import java.util.Scanner;
        
public class EjerciciosJavaJozet {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        System.out.println("Ingrese el ejercicio que quieras ver (1-30):");
        int opcion = menu.nextInt();
        
        if(opcion >0 && opcion <=30){
            if (opcion == 1) {EjercicioFactura objEjercicioFactura = new EjercicioFactura();}
            if (opcion == 2) {Ejercicio2.Ascensor();}
            if (opcion ==3) {Ejercicio3.Ascensor();}
            if (opcion ==4) {Ejercicio4.SensorTemperatura();}
            if (opcion ==5) {Ejercicio5.Sensor();}
            if (opcion ==6) {Ejercicio6.PisoTemperatura();}
            if (opcion ==7) {Ejercicio7.PrecioProductos();}
            if (opcion ==8) {Ejercicio8.IMC();}
            if (opcion ==9) {Ejercicio9.AsistenteVirtual();}
            if (opcion ==9) {Ejercicio9.AsistenteVirtual();}
            if (opcion ==10) {Ejercicio10.Clasificacion();}
            if (opcion ==11) {Ejercicio11.Menu();}
            if (opcion ==12) {Ejercicio12.CajeroAutomatico();}
            if (opcion ==13) {Ejercicio13.TiendaEnLinea();}
            if (opcion ==14) {Ejercicio14.Impresora();}
            if (opcion ==15) {Ejercicio15.Viaje();}
            if (opcion ==16) {Ejercicio16.CuentaRegresiva();}
            if (opcion ==17) {Ejercicio17.Juego();}
            if (opcion ==18) {Ejercicio18.Biblioteca();}
            if (opcion ==19) {Ejercicio19.ComidasRapidas();}
            if (opcion ==20) {Ejercicio20.SensorTemperatura();}
            if (opcion ==21) {Ejercicio21.Examenes();}
            if (opcion ==22) {Ejercicio22.GestionTareas();}
            if (opcion ==23) {Ejercicio23.RegistroVentas();}
            if (opcion ==24) {Ejercicio24.RegistroDeVehiculos();}
            if (opcion ==25) {Ejercicio25.CarritoCompras();}
            if (opcion ==26) {Ejercicio26.AgendaContactos();}
            if (opcion ==27) {Ejercicio27.SumatoriaNumeros();}
            if (opcion ==28) {Ejercicio28.VentasTienda();}
        }
    }
    
}
