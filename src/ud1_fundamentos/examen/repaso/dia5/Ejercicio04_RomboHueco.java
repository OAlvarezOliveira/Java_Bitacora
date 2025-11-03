
package ud1_fundamentos.examen.repaso.dia5;

import java.util.Scanner;

/**
 * Dibujar un rombo hueco de altura n (por ejemplo, n = 4).
 *
 * 
 * * * * * *
 *
 * 
 */
public class Ejercicio04_RomboHueco {

	public static void main(String[] args) {

		int diagonal;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la diagonal menor  del rombo a dibujar:");
		diagonal = entrada.nextInt();

		// Filas Positivas
		for (int i = 0; i <= diagonal - 1; i++) {

			// Filas espacios
			for (int j = 0; j < (diagonal) - i - 1; j++) {
				System.out.print(" ");
			}
			// Que solo se pinten los bordes
			for (int k = i; k >= 0; k--) {
				// Filas asteriscos
				if (k == 0 || k == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();

		}
		// Filas Negativas
		for (int i = diagonal - 2; i >= 0; i--) {
			// Filas espacios
			for (int j = 0; j < (diagonal) - i - 1; j++) {
				System.out.print(" ");
			}
			// Que solo se pinten los bordes
			for (int k = i; k >= 0; k--) {
				// Filas asteriscos
				if (k == 0 || k == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();

		}
		entrada.close();
	}

}
