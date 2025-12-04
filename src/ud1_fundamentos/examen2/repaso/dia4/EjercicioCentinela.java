/**
 * 
 */
package ud1_fundamentos.examen2.repaso.dia4;

import java.util.Scanner;

/**
 * Ejercicio con centinela: Lee números enteros hasta que el usuario escriba -1
 * (centinela). Para todos los números leídos (sin contar el -1):
 * 
 * Cuenta cuántos son positivos Cuenta cuántos son negativos (excluyendo el -1)
 * Calcula la suma de todos
 * 
 * Muestra los resultados al final. Ejemplo: Introduce número: 5 Introduce
 * número: -3 Introduce número: 10 Introduce número: -1 Positivos: 2 Negativos:1
 * Suma total: 12
 */
public class EjercicioCentinela {

	public static void main(String[] args) {

		// Declaracion de Variables
		Scanner entrada;
		int numero;
		int contadorPositivos;
		int contadorNegativos;
		int sumaNumeros;

		// Inicializacion de Variables
		numero = 0;
		contadorPositivos = 0;
		contadorNegativos = 0;
		sumaNumeros = 0;
		entrada = new Scanner(System.in);

		// Operativa

		while (numero != -1) {

			System.out.printf("Introduce número: %n");
			numero = entrada.nextInt();

			if (numero != -1) {

				if (numero > 0) {

					contadorPositivos++;

				} else {

					contadorNegativos++;
				}

				sumaNumeros += numero;

			}

		}

		// Salida de datos

		System.out.printf("%s %d %n", "Positivos:", contadorPositivos);

		System.out.printf("%s %d %n", "Negativos:", contadorNegativos);

		System.out.printf("%s %d %n", "Suma total:", sumaNumeros);

		entrada.close();
	}// Fin

}
