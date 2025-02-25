package ejerciciosjavajozet;
import java.util.Scanner;

public class Ejercicio9 {
    public static void AsistenteVirtual() {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = dato.nextInt();
        String recomendacion;
        
        if (edad < 7) {  
            recomendacion = "Recomendamos películas animadas y educativas aptas para todas las edades.";
        } else if (edad >= 7 && edad <= 17) { 
            recomendacion = "Recomendamos películas adecuadas para la familia, como animaciones, aventuras y comedias familiares.";
        } else if (edad >= 18 && edad <= 30) { 
            recomendacion = "Recomendamos una variedad de géneros: acción, drama, comedia y ciencia ficción.";
        } else { 
            recomendacion = "Recomendamos películas clásicas y dramas que podrían ser de su interés.";
        }
        System.out.println(recomendacion);
    }
}



