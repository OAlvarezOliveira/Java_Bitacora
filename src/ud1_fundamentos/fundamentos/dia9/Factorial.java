package ud1_fundamentos.fundamentos.dia9;
import java.util.Scanner;

/**
 * Calcula el factorial de un número entero positivo.
 */
public class Factorial {

    public static void main(String[] args) {

        int num;
        int factorial = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el número para calcular su factorial: ");
        num = entrada.nextInt();

        if (num < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + num + " es " + factorial);
        }

        entrada.close();
    }
}
