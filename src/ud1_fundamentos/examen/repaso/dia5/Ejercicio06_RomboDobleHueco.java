package ud1_fundamentos.examen.repaso.dia5;

import java.util.Scanner;

/*
 
 Queremos esto (para n = 4):

   *     *
  * *   * *
 *   * *   *
*     **    *
 *   * *   *
  * *   * *
   *     *
 

  
 */
public class Ejercicio06_RomboDobleHueco {

	public static void main(String[] args) {

		int diagonal;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la diagonal menor  del rombo doble vaciado  a dibujar:");
		diagonal = entrada.nextInt();

		// Filas Positivas
		for (int i = 0; i <= diagonal - 1; i++) {

			// Espacios a la izquierda
			for (int k = 0; k < diagonal - i - 1; k++) {
				System.out.print(" ");
			}

			// Pirámide izquierda
			for (int k = 0; k < 2 * i + 1; k++) {

				if (k == 0 || k == 2 * i ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			// Espacios centrales
			for (int k = 0; k < 2 * (diagonal - i - 1); k++) {
				System.out.print(" ");

			}
			// Pirámide derecha
			for (int k = 0; k < 2 * i + 1; k++) {

				if (k == 0 || k == 2 * i ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

		// Filas negativas
		for (int i = diagonal - 2; i >= 0; i--) {

			// Espacios a la izquierda
			for (int k = 0; k < diagonal - i - 1; k++) {
				System.out.print(" ");
			}

			// Pirámide izquierda
			for (int k = 0; k < 2 * i + 1; k++) {

				if (k == 0 || k == 2 * i ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			// Espacios centrales
			for (int k = 0; k < 2 * (diagonal - i - 1); k++) {
				System.out.print(" ");

			}
			// Pirámide derecha
			for (int k = 0; k < 2 * i + 1; k++) {

				if (k == 0 || k == 2 * i || i == diagonal - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
		entrada.close();

	}
}
