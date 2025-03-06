package calculadora;
import java.util.Scanner;

public class Proceso {
    private Calculadora calculadora;
    private Scanner scanner;

    public Proceso() {
        calculadora = new Calculadora();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean seguir = true;

        while (seguir) {
            System.out.print("Ingrese el primer número por favor: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número por favor: ");
            double num2 = scanner.nextDouble();

            System.out.print("Ingrese el proceso que deseas (suma, resta, multiplicación, división): ");
            String proceso = scanner.next().toLowerCase();

            double resultado = 0;
            switch (proceso) {
                case "suma":
                    resultado = calculadora.sumar(num1, num2);
                    break;
                case "resta":
                    resultado = calculadora.restar(num1, num2);
                    break;
                case "multiplicación":
                    resultado = calculadora.multiplicar(num1, num2);
                    break;
                case "división":
                    resultado = calculadora.dividir(num1, num2);
                    break;
                default:
                    System.out.println("Error. Operación no válida.");
                    continue;
            }

            System.out.println("El resultado es: " + resultado);
            System.out.print("¿Desea realizar otro proceso seleccione? (si/no): ");
            String solucion = scanner.next().toLowerCase();
            if (solucion.equals("si")) {
                seguir = false;
            }
        }

        scanner.close();
    }
}
