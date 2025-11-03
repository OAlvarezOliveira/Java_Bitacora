package ud1_fundamentos.fundamentos.dia9;

import java.util.Scanner;

/**
 * Comprueba si un número entero positivo es perfecto.
 */
public class ContadorDeParesImpares {

	public static void main(String[] args) {

		int num;
		int contaP;
		int contaI;
		Scanner entrada;

		contaP = 0;
		contaI = 0;
		num = 1;
		entrada = new Scanner(System.in);

		while (num != 0) {

			System.out.print("Introduce un número para comprobar si es par o impar: ");
			num = entrada.nextInt();
			if (num != 0) {
				if (num % 2 == 0) {
					contaP++;

				} else {
					contaI++;

				}
			}
		}
		System.out.print("Has Introducido : " + contaP + " numeros pares");
		System.out.print("Has Introducido : " + contaI + " numeros impares");
		entrada.close();
	}
}
