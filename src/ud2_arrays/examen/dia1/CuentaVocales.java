/**
 * 
 */
package ud2_arrays.examen.dia1;

import java.util.Scanner;

/**
"Crear un programa que pida al usuario una frase. El programa debe contar cuántas veces aparece cada vocal (a, e, i, o, u) en la frase y mostrar el resultado. Debe ignorar mayúsculas/minúsculas."
Ejemplo:
Entrada: "Hola Mundo"
Salida:
A: 1
E: 0
I: 0
O: 2
U: 1 
 */
public class CuentaVocales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String frase;
		int[] cantVocales = new int[5];
		char[] nombreVocales = { 'A', 'E', 'I', 'O', 'U' };
		Scanner entrada = new Scanner(System.in, "UTF-8");

		frase = tomadatos(entrada);

		cantVocales = cuentaVocales(frase);

		for (int i = 0; i < cantVocales.length; i++) {

			System.out.printf("%c: %d \n", nombreVocales[i], cantVocales[i]);

		}

		entrada.close();
	}

	private static int[] cuentaVocales(String frase) {

		int[] vocales = new int[5];

		frase = frase.toLowerCase();

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == 'a') {
				vocales[0]++;
			} else if (frase.charAt(i) == 'e') {
				vocales[1]++;
			} else if (frase.charAt(i) == 'i') {
				vocales[2]++;
			} else if (frase.charAt(i) == 'o') {
				vocales[3]++;
			} else if (frase.charAt(i) == 'u') {
				vocales[4]++;
			}

		}

		return vocales;

	}

	private static String tomadatos(Scanner entrada) {

		System.out.printf("Introduce una frase: \n");
		return entrada.nextLine();

	}

}
