package ud1_fundamentos.examen.repaso.dia5;

import java.util.Scanner;

/*
 * Pedir un número n y calcular la suma 
 * de todos sus divisores impares
 */

public class Ejercicio02_SumaDivisoresImpares {

	public static void main(String[] args) {

		// Definimos Variables
		int num, sum;
		Scanner entrada = new Scanner(System.in);

		// Declaramos Variables
		sum = 0;

		// Entrada de datos
		System.out.println("Introduce el numero a comprobar");
		num = entrada.nextInt();

		// Operativa
		for (int i = 1; i <= num; i += 2) {

			// Sumo divisores impares y acumulo el resultado en sum
			if (num % i == 0) {
				sum += i;
				System.out.println(i + " es divisor impar de " + num);

			}
		}
		// Salida de datos
		System.out.println("La suma de toods los divisores impares de " + num + " es " + sum);

		entrada.close();
	}

}
