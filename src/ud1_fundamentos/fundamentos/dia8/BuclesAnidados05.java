package ud1_fundamentos.fundamentos.dia8;

import java.util.Scanner;

/**
 * Pide un número entero positivo n y muestra si es o no primo.
 */
public class BuclesAnidados05 {

    public static void main(String[] args) {

        // Declaración
        int numero;
        boolean esPrimo = true;
        Scanner entrada;

        // Inicialización
        entrada = new Scanner(System.in);

        // Proceso
        System.out.print("Introduce un número para averiguar si es o no primo: ");
        numero = entrada.nextInt();

        if (numero < 2) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break; // corta el bucle al primer divisor encontrado
                }
            }
        }

        // Salida
        if (esPrimo) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }

        entrada.close();
    }
}
