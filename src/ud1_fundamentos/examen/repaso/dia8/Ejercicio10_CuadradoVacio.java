package ud1_fundamentos.examen.repaso.dia8;

import java.util.Scanner;

/*
 
Ejercicio 2 — Cuadrado hueco

Mismo tamaño, pero solo con bordes:

Ejemplo (n = 4):

****
*  *
*  *
****
 
*/

public class Ejercicio10_CuadradoVacio {

	public static void main(String[] args) {

		// Declaracion de variables
		int n;
		Scanner entrada = new Scanner(System.in);

		// Inicializar variables

		// Toma de datos
		System.out.println("Introduce el lado del cuadrado");
		n = entrada.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

}
