package ud1_fundamentos.examen.repaso.dia3;

import java.util.Scanner;

/**
 * Dibuja una figura con forma de arco:
 *
 * *
 * **
 * ***
 * ****
 * ***
 * **
 * *
 *
 * Curso 2025-26
 * @author oalva
 */
public class Ejercicio03_Arco {
    public static void main(String[] args) {

        // Declarar variables
        int num;
        Scanner entrada = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduce la altura del arco: ");
        num = entrada.nextInt();

        // --- Parte 1: Creciente ---
        // Va desde 1 hasta num -> cada fila añade un asterisco
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // --- Parte 2: Decreciente ---
        // Va desde num-1 hasta 1 -> cada fila quita un asterisco
        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        entrada.close();
    }
}
