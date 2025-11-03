package ud1_fundamentos.examen.repaso.dia2;

import java.util.Scanner;

/**
 * Dibuja un triángulo creciente con asteriscos.
 */
public class Ejercicio03_TrianguloCreciente {
	public static void main(String[] args) {
		// Declarar variables
		int altura;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la altura del triangualo creciente:");
		altura = entrada.nextInt();

		for (int i = 0; i < altura; i++) {

			for (int j = 0; j <= i; j++) {

					System.out.print("*");

			}
			System.out.println();
		}
		entrada.close();
	}
}