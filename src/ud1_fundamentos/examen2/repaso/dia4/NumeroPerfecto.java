
package ud1_fundamentos.examen2.repaso.dia4;

import java.util.Scanner;

/**
 * Ejercicio: Verificar si un número es perfecto Lee un número entero positivo.
 * Indica si es "PERFECTO" o "NO PERFECTO". Entrada de ejemplo: 6 12 28 0
 * Salida: PERFECTO NO PERFECTO PERFECTO
 */
public class NumeroPerfecto {

	public static void main(String[] args) {

		// Declaracion de Variables
		Scanner entrada;
		int numero;
		int sumaDivisores;

		// Inicializacion de Variables
		sumaDivisores = 0;
		numero = -1;
		entrada = new Scanner(System.in);
		
		
		//Operativa
		while (numero != 0) {

			System.out.printf("%s %n", "Introduce numero:");
			numero = entrada.nextInt();
			sumaDivisores = 0; // reset para caso nuevo;

			for (int i = 1; i <= numero / 2; i++) {

				if (numero % i == 0) {
					sumaDivisores += i;
				}
			}
			
		//Salida de datos	
			if (numero != 0) {

				if (sumaDivisores == numero) {
					System.out.printf("%s %n", "PERFECTO");
				} else {
					System.out.printf("%s %n", "NO PERFECTO");
				}

			}

		}

		entrada.close();
	}

}
