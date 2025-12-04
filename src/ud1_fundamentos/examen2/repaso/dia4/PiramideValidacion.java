package ud1_fundamentos.examen2.repaso.dia4;

import java.util.Scanner;

/*
 
Ejercicio: Pirámide centrada con validación
Pide al usuario un número entre 3 y 7 (altura de la pirámide). Si no está en ese rango, muestra "Error: altura fuera de rango" y termina.
Si es válido, dibuja una pirámide centrada sólida:
Ejemplo con altura 5:
    *
   ***
  *****
 *******
*********
Trabaja:

Validación if-else
Bucle triple anidado: fila → espacios → asteriscos
Patrón de espacios y asteriscos 
 */

public class PiramideValidacion {

	public static void main(String[] args) {

		// Inicializar Variables
		int altura;
		String mensaje;
		Scanner entrada;

		// Declarar Variables
		mensaje = "Error: altura fuera de rango";
		entrada = new Scanner(System.in);

		// Entrada de datos
		System.out.printf("Introduce la altura del Triángulo rectángulo : %n");
		altura = entrada.nextInt();

		// Operativa

		if (altura >= 3 && altura <= 7) {

			for (int filas = 1; filas <= altura; filas++) {

				// espacios
				for (int espacios = 0; espacios < altura - filas; espacios++) {

					System.out.printf(" ");

				}
				// asteriscos + vaciado
				for (int asteriscos = 0; asteriscos < 2 * filas - 1; asteriscos++) {

					if (filas == altura || asteriscos == 0 || asteriscos == 2 * filas - 2) {
						System.out.printf("*");
					} else {
						System.out.printf(" ");
					}

				}

				System.out.printf("%n");

			} // Fin filas

		} else {

			System.out.printf("%s%n", mensaje);

		}

		// Salida de datos

		entrada.close();
	}

}
