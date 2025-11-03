package ud1_fundamentos.fundamentos.dia9;

import java.util.Scanner;

/**
 * Comprueba si un número entero positivo es perfecto.
 */
public class Perfecto {

    public static void main(String[] args) {

        int num;
        int suma = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número para comprobar si es perfecto: ");
        num = entrada.nextInt();

        if (num <= 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    suma += i;
                }
            }

            if (suma == num) {
                System.out.println(num + " es un número perfecto.");
            } else {
                System.out.println(num + " no es un número perfecto.");
            }
        }

        entrada.close();
    }
}
