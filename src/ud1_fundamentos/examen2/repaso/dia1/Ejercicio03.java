
package ud1_fundamentos.examen2.repaso.dia1;

import java.util.Scanner;

/**
 * EJERCICIO 3: Validar nota entre 0 y 10
 ** 
 * Enunciado:** Pide una nota (double). Debe estar entre 0.0 y 10.0 (ambos
 * incluidos). Usa `printf` para mostrar al final: "Nota registrada: X.XX"
 ** 
 * Requisitos:** - Usar `double` para la nota - Validación con `do-while` -
 * Salida con `printf("Nota registrada: %.2f%n", nota);`
 */

public class Ejercicio03 {

	public static void main(String[] args) {

		// DECLARACIÓN
		double nota;
		Scanner entrada;

		// INICIALIZACIÓN
		entrada = new Scanner(System.in);

		// ENTRADA + VALIDACIÓN
		do {
			System.out.println("Introduce la nota  a comprobar: ");
			nota = entrada.nextDouble();

			if (nota < 0.0 || nota > 10.0) {
				System.out.println("Nota no válida. Debe estar entre 0.0 y 10.0.");
			}

		} while (nota < 0.0 || nota > 10.0);

		// SALIDA
		System.out.printf("Nota registrada: %.2f%n", nota);

		entrada.close();
	}

}


