package ud1_fundamentos.examen.repaso.dia1;


import java.util.Scanner;

/**
 * Dibuja una Rombo combiando piramide + piramide invertida
 */
public class Ejercicio08_Rombo {
	public static void main(String[] args) {
		// Declarar variables
		int diagonal;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la diagonal menor  del rombo :");
		diagonal = entrada.nextInt();

//parte positiva
		for (int i = 0; i < diagonal; i++) {

			// espacios
			for (int j = 0; j <= diagonal - i - 1; j++) {

				System.out.print(" ");

			}
			// asteriscos
			for (int j = 0; j <= i; j++) {

				System.out.print(" *");

			}
			System.out.println();
		}
//parte negativa		
		for (int i2 = 1; i2 < diagonal; i2++) {

			// espacios
			for (int j2 = 0; j2 < i2 + 1; j2++) {

				System.out.print(" ");

			}
			// asteriscos
			for (int j2 = 0; j2 <= diagonal - i2 - 1; j2++) {

				System.out.print(" *");

			}
			System.out.println();
		}

		entrada.close();
	}
}