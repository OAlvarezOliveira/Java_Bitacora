package ud1_fundamentos.examen.repaso.dia5;

import java.util.Scanner;

public class Ejercicio03_PiramideInvertidaHueca {

	public static void main(String[] args) {

		int altura;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la altura de la piramide a dibujar:");
		altura = entrada.nextInt();

		// Filas
		for (int i = 0; i < altura; i++) {

			// Columnas

			for (int j = 0; j < ((2 * altura) - 1); j++) {

				if (i == 0 || j == i || j == (2 * altura - 2) - i) {

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
