/**
 * 
 */
package ud2_arrays.examen.dia1;

import java.util.Scanner;

/**
 * "Crear un programa que almacene información de 3 productos de una tienda:
 * nombre y precio. El programa debe:
 * 
 * Pedir al usuario el nombre y precio de cada producto Mostrar todos los
 * productos con sus precios Mostrar cuál es el producto más caro y cuál el más
 * barato Calcular y mostrar el precio promedio"
 */
public class ListadoProductos {

	private static final int CANT = 3;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in, "UTF-8");
		String[] nombres = new String[CANT];
		double[] precios = new double[CANT];
		int posicionMasCaro, posicionMasBarato;
		double promedio;

		leerProductos(entrada, nombres, precios);

		mostrarProductos(nombres, precios);

		posicionMasCaro = encontrarMasCaro(nombres, precios);
		System.out.printf("Producto más caro: %s %.2f: \n", nombres[posicionMasCaro], precios[posicionMasCaro]);

		posicionMasBarato = encontrarMasBarato(nombres, precios);
		System.out.printf("Producto más barato: %s %.2f: \n", nombres[posicionMasBarato], precios[posicionMasBarato]);

		promedio = calcularPromedio(precios);
		System.out.printf("El precio promedio de los productos es %.2f \n", promedio);

		entrada.close();

	}

	private static double calcularPromedio(double[] precios) {

		double promedio = 0;

		for (int i = 0; i < precios.length; i++) {

			promedio += precios[i];
		}
		promedio = promedio / precios.length;

		return promedio;

	}

	private static int encontrarMasBarato(String[] nombres, double[] precios) {
		double precioMenor = Double.MAX_VALUE;
		int posicionMenor = 0;

		for (int i = 0; i < precios.length; i++) {

			if (precioMenor > precios[i]) {
				precioMenor = precios[i];
				posicionMenor = i;
			}

		}

		return posicionMenor;
	}

	private static int encontrarMasCaro(String[] nombres, double[] precios) {

		double precioMayor = Double.MIN_VALUE;
		int posicionMayor = 0;

		for (int i = 0; i < precios.length; i++) {

			if (precioMayor < precios[i]) {
				precioMayor = precios[i];
				posicionMayor = i;
			}

		}

		return posicionMayor;
	}

	private static void mostrarProductos(String[] nombres, double[] precios) {

		int j = 1;
		System.out.printf("=== LISTADO DE PRODUCTOS === \n");

		for (int i = 0; i < nombres.length; i++, j++) {

			System.out.printf("%d.   %s   -  %.2f  \n", j, nombres[i], precios[i]);

		}

	}

	private static void leerProductos(Scanner entrada, String[] nombres, double[] precios) {
		int j = 1;

		for (int i = 0; i < nombres.length; i++, j++) {

			System.out.printf("Introduce el nombre del  artículo %d: \n", j);
			nombres[i] = entrada.nextLine();

			System.out.printf("Introduce el precio del  artículo %d: \n", j);
			precios[i] = entrada.nextDouble();
			entrada.nextLine();

		}

	}

}
