package ud1_fundamentos.examen.repaso.dia1;


import java.util.Scanner;

/**
 * Dibuja un triángulo creciente con asteriscos alineado a la derecha.
 */
public class Ejercicio05_TrianguloDerecha {
	public static void main(String[] args) {
		// Declarar variables
		int altura;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la altura del triangualo creciente alineado a Derecha:");
		altura = entrada.nextInt();

		for (int i = 0; i < altura; i++) {
			
			//espacios
			for (int j = 0; j < altura - i - 1; j++) {

				System.out.print(" ");

		}
			//asteriscos
			for (int j = 0; j <= i; j++) {

					System.out.print("*");

			}
			System.out.println();
		}
		entrada.close();
	}
}