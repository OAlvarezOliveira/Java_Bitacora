package ud1_fundamentos.examen.repaso.dia5;

import java.util.Scanner;

/*
 * Un número es perfecto si la suma de todos sus divisores propios (todos los divisores menores que él mismo) es igual al propio número.
 * Ejemplo: 6 → 1+2+3 = 6 → perfecto.
 */

public class Ejecicio01_NumPerfecto {

	public static void main(String[] args) {

		// Declaramos variables
		int num;
		int suma;
		Scanner entrada = new Scanner(System.in);

		// Inicializamos variables
		suma = 0;

		// Entrada de datos
		System.out.println("Introduce el numero a comprobar si es o no perfecto");
		num = entrada.nextInt();

		// Operativa
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				suma += i;
			}
		}

		// Salida de datos

		if (suma == num) {
			System.out.println("El número " + num + " es perfecto");
		} else {
			System.out.println("El número " + num + " no es perfecto");
		}
		entrada.close();

	}

}
