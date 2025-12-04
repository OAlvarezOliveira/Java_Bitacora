/**
 * 
 */
package ud1_fundamentos.examen2.repaso.dia4;

import java.util.Scanner;

/**
 * Ejercicio: Triángulo rectángulo con validación Pide al usuario un número
 * entre 3 y 10 (altura del triángulo). Si no está en ese rango, muestra "Error:
 * altura fuera de rango" y termina. Si es válido, dibuja un triángulo
 * rectángulo creciente con asteriscos: Ejemplo con altura 5:
 *
 **
 ***
 ****
 *****
 * Trabaja:
 * 
 * Validación if-else Bucle anidado (fila + columna) Sin saltos de línea extra
 */
public class TrianguloValidacion {

	public static void main(String[] args) {

		int altura;
		String mensaje = "Error: altura fuera de rango";
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la altura del Triángulo rectángulo :");
		altura = entrada.nextInt();

		if (altura >= 3 && altura <= 8) {

			for (int fila  = 0; fila  < altura; fila++) {

				for (int asterisco  = 0; asterisco  < altura - fila  ; asterisco++) {

					System.out.printf("*");

				}

				System.out.printf("%n");
			}

		} else {

			System.out.printf("%s%n", mensaje);

		}
		entrada.close();
	}

}
