/**
 * 
 */
package ud2_arrays.examen.dia1;

import java.util.Scanner;
import java.util.Arrays;

/**
 * 
 */
public class OrdenAlfabeticamente {

	private static final int CANT = 4;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in, "UTF-8");
		String[] nombres = new String[CANT];
		String[] posicionesCardinales = { "primer", "segundo", "tercer", "cuarto" };

		leerNombres(entrada, nombres, posicionesCardinales);
		ordenarNombres(nombres);
	    System.out.printf("=== NOMBRES ORDENADOS === \n");
		mostrarNombres(nombres);
		
		entrada.close();

	}

	private static void mostrarNombres(String[] nombres) {

	    for (int i = 0; i < nombres.length; i++) {
	        System.out.printf("%s \n", nombres[i]);
	    }

	}

	private static void ordenarNombres(String[] nombres) {

		Arrays.sort(nombres);

	}

	private static void leerNombres(Scanner entrada, String[] nombres, String[] posicionesCardinales) {

		for (int i = 0; i < nombres.length; i++) {
			System.out.printf("Introduce el %s nombre: \n", posicionesCardinales[i]);
			nombres[i] = entrada.nextLine();
		}

	}

}
