package ud1_fundamentos.examen.repaso.dia6;

import java.util.Scanner;

/**
 * Ejercicio 1 – Múltiplos de 3 y 5
 */
public class Ejercicio05_Multiplos3_5 {

	public static void main(String[] args) {

		int n;
		int mult3 = 0;
		int mult5 = 0;
		int multAmbos = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				multAmbos++;
			} else if (i % 3 == 0) {
				mult3++;
			} else if (i % 5 == 0) {
				mult5++;
			}
		}

		System.out.println("Múltiplos de 3: " + mult3);
		System.out.println("Múltiplos de 5: " + mult5);
		System.out.println("Múltiplos de ambos (3 y 5): " + multAmbos);

		entrada.close();
	}
}
