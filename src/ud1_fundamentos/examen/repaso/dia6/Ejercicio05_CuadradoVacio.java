
package ud1_fundamentos.examen.repaso.dia6;

import java.util.Scanner;

/**
 * Ejercicio 5 — Cuadrado hueco de asteriscos Ejemplo para n = 4:
 ****
 * 
 * * *
 ****f
 * 
 */
public class Ejercicio05_CuadradoVacio {

	public static void main(String[] args) {

		int n;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el lado del cuadrado");
		n = entrada.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
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