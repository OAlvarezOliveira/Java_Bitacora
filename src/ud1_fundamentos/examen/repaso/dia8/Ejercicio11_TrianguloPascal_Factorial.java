package ud1_fundamentos.examen.repaso.dia8;

import java.util.Scanner;

/*
Ejercicio 4 — Triángulo de Pascal (nivel alto)

*/

public class Ejercicio11_TrianguloPascal_Factorial {

	public static void main(String[] args) {

		// Declaracion de variables
		int n;
		int valor;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el número de filas del Triángulo de Pascal: ");
		n = entrada.nextInt();

		// Bucle principal: filas
		for (int i = 0; i < n; i++) {

			// Espacios (para centrar un poco)
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}

			// Bucle interno: columnas
			for (int j = 0; j <= i; j++) {

				// Fórmula combinatoria: n! / (k! * (n - k)!)
				valor = factorial(i) / (factorial(j) * factorial(i - j));
				System.out.print(valor + " ");
			}

			System.out.println();
		}

		entrada.close();
	}

	// Función factorial 
	public static int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
}
