package ud1_fundamentos.fundamentos.dia8;
import java.util.Scanner;

/**
 * Pide al usuario una cantidad indeterminada de números enteros y determina
 * cuál es el mayor y cuál es el menor.
 * El proceso termina cuando el usuario introduce 0.
 * Al finalizar, muestra:
 *  - El número mayor introducido.
 *  - El número menor introducido.
 */
public class BuclesAndAcumuladores03 {

    public static void main(String[] args) {

        // Declaración e inicialización
        int numero = 1;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        boolean introducido = false;
        Scanner entrada = new Scanner(System.in);

        // Proceso
        while (numero != 0) {
            System.out.print("Introduce un número (0 para salir): ");
            numero = entrada.nextInt();

            if (numero != 0) {
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
                introducido = true;
            } else {
                System.out.println("Has introducido cero... saliendo del programa");
            }
        }

        // Salida
        if (introducido) {
            System.out.println("El número mayor introducido es: " + mayor);
            System.out.println("El número menor introducido es: " + menor);
        } else {
            System.out.println("No se introdujeron números válidos.");
        }

        entrada.close();
    }
}

