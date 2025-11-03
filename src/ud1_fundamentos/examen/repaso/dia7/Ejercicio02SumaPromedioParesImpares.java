package ud1_fundamentos.examen.repaso.dia7;

import java.util.Scanner;

/*
 Pide al usuario un número entero positivo n.
El programa debe recorrer los números del 1 al n y calcular:
La suma total de los pares,
La suma total de los impares,
El promedio de los pares,
El promedio de los impares.
Finalmente, mostrará todos los resultados por pantalla.
*/

public class Ejercicio02SumaPromedioParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar Variables
		int n;
		int acP;
		int acI;
		int sumP;
		int sumI;
		double promP;
		double promI;
		Scanner entrada = new Scanner(System.in);

		// Inicializar Variables
		acP = 0;
		acI = 0;
		sumP = 0;
		sumI = 0;
		promP = 0.0;
		promI = 0.0;

		// Entrada de datos
		System.out.println("Introduce un número entero positivo:");
		n = entrada.nextInt();

		// Operativa
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				acP++;
				sumP += i;
			} else {
				acI++;
				sumI += i;
			}
		}

		entrada.close();
		promP = (double)sumP/acP;
		promI = (double)sumI/acI;
		
		// Entrada de datos
		System.out.println("Suma de pares: "+sumP);
		System.out.println("Promedio de pares: "+promP);
		System.out.println("Suma de impares: "+sumI);
		System.out.println("Promedio de impares: "+promI);

	}

}
