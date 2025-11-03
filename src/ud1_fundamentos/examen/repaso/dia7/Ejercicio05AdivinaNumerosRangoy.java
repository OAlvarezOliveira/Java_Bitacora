package ud1_fundamentos.examen.repaso.dia7;

import java.util.Random;
import java.util.Scanner;

/*
 Control de intentos (versión “Adivina el número”)

Enunciado:

El programa genera un número aleatorio entre 1 y 50.
El usuario debe adivinarlo en un máximo de 5 intentos.

En cada intento el programa mostrará:

“Demasiado alto” si el número introducido es mayor.

“Demasiado bajo” si es menor.

“¡Acertaste!” si coincide.

Si se agotan los intentos, mostrará:

“Has agotado tus intentos. El número era X.”

*/

public class Ejercicio05AdivinaNumerosRangoy {

	public static void main(String[] args) {

		// Declaracion de variables
		int n;
		int numSecreto;
		int margen;
		boolean acertado;
		int limiteInferior;
		int limiteSuperior;
		Random aleatorio;
		aleatorio = new Random();
		Scanner entrada = new Scanner(System.in);

		// Inicializacion de variables
		acertado = false;

		// Operativa
		numSecreto = aleatorio.nextInt(1, 51); // genera aleatorio del 1 al 50.
		// System.out.println(numSecreto); // for debug

		while (!acertado) {
			margen = aleatorio.nextInt(1, 9); // genera el margen entre 1-8
			limiteInferior = Math.max(1, numSecreto - margen);
			limiteSuperior = Math.min(50, numSecreto + margen);

			System.out.println("Introduce tu número (1–50):");
			n = entrada.nextInt();

			if (n > numSecreto) {
				System.out.println(
						"Demasiado alto. Pista: el número está entre " + limiteInferior + " y " + limiteSuperior);

			} else if (n < numSecreto) {
				System.out.println(
						"Demasiado bajo. Pista: el número está entre " + limiteInferior + " y " + limiteSuperior);

			} else {
				acertado = true;
				System.out.println("¡Acertaste!");
			}

		}
		entrada.close();

	}

}
