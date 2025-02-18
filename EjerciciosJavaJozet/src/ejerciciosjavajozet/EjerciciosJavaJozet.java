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
        }
    }
    
}
