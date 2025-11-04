package ud1_fundamentos.examen.repaso.dia8;

import java.util.Scanner;

/*
 
Pide un número n y dibuja un cuadrado de n x n con asteriscos *.

Ejemplo (n = 4):

****
****
****
****
 
*/

public class Ejercicio09_CuadradoLleno {

	public static void main(String[] args) {

		// Declaracion de variables
		int n;
		Scanner entrada = new Scanner(System.in);

		// Inicializar variables

		// Toma de datos
		System.out.println("Introduce el lado del cuadrado");
		n = entrada.nextInt();

		for (int i = 0; i < n; i++) {

			for (int j = 0 ; j < n; j++) {

				if (i == 0 || j == 0 || i == n - 1 || j == n - 1  ) {
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
