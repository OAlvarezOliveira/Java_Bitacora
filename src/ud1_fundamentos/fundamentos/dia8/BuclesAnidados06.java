package ud1_fundamentos.fundamentos.dia8;

import java.util.Scanner;

/**
 * Muestra los primeros N números primos.
 */
public class BuclesAnidados06 {

    public static void main(String[] args) {

        // Declaración
        int numero;
        int repeticiones;
        int contador;
        boolean esPrimo;
        Scanner entrada;

        // Inicialización
        contador = 0;
        numero = 2;
        entrada = new Scanner(System.in);

        // Entrada
        System.out.print("¿Cuántos números primos quieres mostrar?: ");
        repeticiones = entrada.nextInt();

        // Proceso
        while (contador < repeticiones) {
            esPrimo = true; // Reiniciar para cada número

            // Comprobamos si el número es primo
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            // Si es primo, lo mostramos y aumentamos contador
            if (esPrimo) {
                System.out.print(numero + " ");
                contador++;
            }

            numero++; // Pasamos al siguiente número
        }

        // Salida final
        System.out.println("\nFin del programa.");
        entrada.close();
    }
}

