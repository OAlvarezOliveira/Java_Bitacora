/**
 * 
 */
package ud2_arrays.examen.dia1;

import java.util.Scanner;

/**
 * "Crear un programa que pida al usuario 6 números enteros. El programa debe
 * mostrar:
 * 
 * Cuántos números son pares y cuántos impares Cuántos números son positivos,
 * negativos y ceros El número mayor y el número menor"
 * 
 * Ejemplo: Introduce número 1: -5 Introduce número 2: 8 Introduce número 3: 0
 * Introduce número 4: 12 Introduce número 5: -3 Introduce número 6: 7
 * 
 * === RESULTADOS === Pares: 3 (8, 12, 0) Impares: 3 (-5, -3, 7)
 * 
 * Positivos: 3 Negativos: 2 Ceros: 1
 * 
 * Número mayor: 12 Número menor: -5
 */
public class BusquedasArrays {

	private static final int CANTIDAD_NUMEROS = 6;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in, "UTF-8");

		int[] numeros = new int[CANTIDAD_NUMEROS];
		int[] resultados = new int[3];

		int cantPares;
		int cantImpares;
		int posMayor;
		int posMenor;

		leerNumeros(entrada, numeros);
		cantPares = contarPares(numeros);
		cantImpares = CANTIDAD_NUMEROS - cantPares;
		contarPositivosNegativosCeros(numeros, resultados);
		posMayor = encontrarMayor(numeros);
		posMenor = encontrarMenor(numeros);

		// Salida de datos

		System.out.printf("=== RESULTADOS === \n");
		System.out.printf("Pares: %d \n", cantPares);
		System.out.printf("Impares: %d \n", cantImpares);
		System.out.printf("\n");
		System.out.printf("Positivos:%d \n", resultados[0]);
		System.out.printf("Negativos:%d \n", resultados[1]);
		System.out.printf("Ceros:%d \n", resultados[2]);
		System.out.printf("\n");
		System.out.printf("Número mayor: %d \n", numeros[posMayor]);
		System.out.printf("Número menor: %d \n", numeros[posMenor]);
		
		entrada.close();

	}

	private static void contarPositivosNegativosCeros(int[] numeros, int[] resultados) {

		for (int i = 0; i < CANTIDAD_NUMEROS; i++) {

			if (numeros[i] > 0) {
				resultados[0]++;
			} else if (numeros[i] < 0) {
				resultados[1]++;
			} else {
				resultados[2]++;
			}
		}
	}

	private static int encontrarMenor(int[] numeros) {
		int valorMenor = Integer.MAX_VALUE;
		int posMenor = 0;

		for (int i = 0; i < CANTIDAD_NUMEROS; i++) {

			if (valorMenor > numeros[i]) {
				valorMenor = numeros[i];
				posMenor = i;
			}

		}

		return posMenor;
	}

	private static int encontrarMayor(int[] numeros) {
		int valorMayor = Integer.MIN_VALUE;
		int posMayor = 0;

		for (int i = 0; i < CANTIDAD_NUMEROS; i++) {

			if (valorMayor < numeros[i]) {
				valorMayor = numeros[i];
				posMayor = i;
			}

		}

		return posMayor;
	}

	private static int contarPares(int[] numeros) {

		int cantPares = 0;

		for (int i = 0; i < CANTIDAD_NUMEROS; i++) {

			if (numeros[i] % 2 == 0) {
				cantPares++;
			}
		}

		return cantPares;
	}

	private static void leerNumeros(Scanner entrada, int[] numeros) {

		for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
			System.out.printf("Introduce número %d: \n", i + 1);
			numeros[i] = entrada.nextInt();
			entrada.nextLine();

		}

	}

}
