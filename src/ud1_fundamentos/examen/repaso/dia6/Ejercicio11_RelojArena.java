package ud1_fundamentos.examen.repaso.dia6;

import java.util.Scanner;

/**
 * Ejercicio 11 — Reloj de arena
 * Dibuja un reloj de arena centrado con altura n.
 * Ejemplo para n = 5:
 *
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */
public class Ejercicio11_RelojArena {

    public static void main(String[] args) {

        int altura;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número entero n (altura): ");
        altura = entrada.nextInt();

        // Parte superior (pirámide invertida)
        for (int i = altura; i >= 1; i--) {

            // espacios
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }

            // asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Parte inferior (pirámide normal)
        for (int i = 2; i <= altura; i++) {

            // espacios
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }

            // asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        entrada.close();
    }
}

