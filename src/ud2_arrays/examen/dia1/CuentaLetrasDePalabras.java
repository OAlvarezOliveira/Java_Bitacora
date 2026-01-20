/**
 * 
 */
package ud2_arrays.examen.dia1;

import java.util.Scanner;

/**
 * "Crear un programa que pida al usuario 5 palabras. El programa debe mostrar
 * cuál es la palabra más larga y cuál es la más corta (por número de letras)."
 * Ejemplo: Introduce palabra 1: Hola Introduce palabra 2: Programación
 * Introduce palabra 3: Java Introduce palabra 4: DAM Introduce palabra 5:
 * Ordenador
 * 
 * Palabra más larga: Programación (12 letras) Palabra más corta: DAM (3 letras)
 */
public class CuentaLetrasDePalabras {

	private static final int CANT = 5;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in, "UTF-8");
		String[] palabras = new String[CANT];
		String[] posicionesCardinales = { "primera", "segunda", "tercera", "cuarta", "quinta" };
		int indiceMasLarga;
		int indiceMasCorta;

		leerPalabras(entrada, palabras, posicionesCardinales);
		indiceMasLarga = encontrarMasLarga(palabras);
		indiceMasCorta = encontrarMasCorta(palabras);
		mostrarResultados(palabras, indiceMasLarga, indiceMasCorta);

		entrada.close();

	}

	private static void mostrarResultados(String[] palabras, int indiceMasLarga, int indiceMasCorta) {

		System.out.printf("Palabra más larga: %s (%d letras) \n", palabras[indiceMasLarga],
				palabras[indiceMasLarga].length());
		System.out.printf("Palabra más corta: %s (%d letras) \n", palabras[indiceMasCorta],
				palabras[indiceMasCorta].length());

	}

	private static int encontrarMasCorta(String[] palabras) {

		int longitud = Integer.MAX_VALUE;
		int posMasCorta = -1;

		for (int i = 0; i < palabras.length; i++) {

			if (palabras[i].length() < longitud) {
				longitud = palabras[i].length();
				posMasCorta = i;
			}

		}

		return posMasCorta;
	}

	private static int encontrarMasLarga(String[] palabras) {
		int longitud = Integer.MIN_VALUE;
		int posMasLarga = -1;

		for (int i = 0; i < palabras.length; i++) {

			if (palabras[i].length() > longitud) {
				longitud = palabras[i].length();
				posMasLarga = i;
			}

		}

		return posMasLarga;
	}

	private static void leerPalabras(Scanner entrada, String[] palabras, String[] posicionesCardinales) {

		for (int i = 0; i < palabras.length; i++) {
			System.out.printf("Introduce la %s palabra: \n", posicionesCardinales[i]);
			palabras[i] = entrada.nextLine();
		}

	}

}
