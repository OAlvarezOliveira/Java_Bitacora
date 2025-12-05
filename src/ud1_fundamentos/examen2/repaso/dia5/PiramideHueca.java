
package ud1_fundamentos.examen2.repaso.dia5;

import java.util.Scanner;

/**
 * Piramide Hueca
 */
public class PiramideHueca {

	public static void main(String[] args) {

		int altura;
		Scanner entrada;

		entrada = new Scanner(System.in);

		altura = entrada.nextInt();

		if (altura >= 3 && altura <= 7) {

			for (int filas = 1; filas <= altura; filas++) {

				for (int j = 0; j <= altura - filas - 1; j++) {

					System.out.printf("%c", ' ');

				}

				for (int j = 1; j <= 2 * filas - 1; j++) {

					if (j == 1 || j == 2 * filas - 1 || filas == altura) {
						System.out.printf("%c", '*');
					} else {
						System.out.printf("%c", ' ');
					}

				}

				System.out.printf("%n");

			}

		} else {
			System.out.printf("Error: altura fuera de rango%n");
		}

		entrada.close();
	}

}
