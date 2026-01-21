/**
 * 
 */
package ud2_arrays.examen.dia1;
import java.util.Scanner;

/**
 * "Crear un programa que almacene las notas de 3 estudiantes en 4 asignaturas.
 * El programa debe:
 * 
 * Pedir el nombre de cada estudiante Pedir las 4 notas de cada estudiante
 * Mostrar la tabla completa de notas Calcular y mostrar la nota media de cada
 * estudiante Mostrar qué estudiante tiene la media más alta"
 * 
 * Ejemplo de ejecución: === TABLA DE NOTAS === Estudiante Asig1 Asig2 Asig3
 * Asig4 Media ------------------------------------------------------- Juan 7.5
 * 8.0 6.5 9.0 7.75 María 9.0 9.5 8.5 10.0 9.25 Pedro 6.0 7.0 5.5 8.0 6.63
 * 
 * Estudiante con mejor media: María (9.25)
 */
public class NotasEstudiantes {

	private static final int ESTUDIANTES = 3;
	private static final int ASIGNATURAS = 4;

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in, "UTF-8");

		String[] nombres = new String[ESTUDIANTES];
		double[][] notas = new double[ESTUDIANTES][ASIGNATURAS];
		double[] medias = new double[ESTUDIANTES];
		String[] asignaturas = { "Matemáticas", "Lengua", "Inglés", "Historia" };
		int indiceMejorMedia;

		leerDatos(entrada, nombres, notas, asignaturas);
		calcularMedias(notas, medias);
		indiceMejorMedia = encontrarMejorMedia(medias);
		mostrarTabla(nombres, notas, medias, asignaturas);

		System.out.printf("Estudiante con mejor media: %s (%.2f) \n", nombres[indiceMejorMedia],
				medias[indiceMejorMedia]);
		
		entrada.close();

	}

	private static void mostrarTabla(String[] nombres, double[][] notas, double[] medias, String[] asignaturas) {
		// 1. Imprimir encabezado
		System.out.printf("=== TABLA DE NOTAS === \n");
		System.out.printf("Estudiante\t%s\t%s\t%s\t%s\tMedia\n", asignaturas[0], asignaturas[1], asignaturas[2],
				asignaturas[3]);
		// 2. Bucle para cada estudiante
		for (int i = 0; i < ESTUDIANTES; i++) {
			// Imprimir nombre
			System.out.printf("%s\t", nombres[i]);

			// Imprimir las 4 notas (sin \n)
			for (int j = 0; j < ASIGNATURAS; j++) {
				System.out.printf("%.2f\t", notas[i][j]);
			}

			// Imprimir media (CON \n para cambiar de línea)
			System.out.printf("%.2f\n", medias[i]);
		}
	}

	private static int encontrarMejorMedia(double[] medias) {

		double mediaMayor = Double.MIN_VALUE;
		int posicionMediaMayor = -1;

		for (int i = 0; i < medias.length; i++) {

			if (mediaMayor < medias[i]) {
				mediaMayor = medias[i];
				posicionMediaMayor = i;
			}

		}

		return posicionMediaMayor;
	}

	private static void calcularMedias(double[][] notas, double[] medias) {

		for (int i = 0; i < ESTUDIANTES; i++) {
			double media = 0;

			for (int j = 0; j < ASIGNATURAS; j++) {
				media += notas[i][j];
			}

			medias[i] = media / ASIGNATURAS;
		}

	}

	private static void leerDatos(Scanner entrada, String[] nombres, double[][] notas, String[] asignaturas) {

		for (int i = 0; i < ESTUDIANTES; i++) {
			System.out.printf("Introduce el nombre del estudiante \n");
			nombres[i] = entrada.nextLine();

			for (int j = 0; j < ASIGNATURAS; j++) {
				System.out.printf("Introduce la nota de la %s correspondiente al estudiante %s \n", asignaturas[j],
						nombres[i]);
				notas[i][j] = entrada.nextDouble();
				entrada.nextLine();

			}
			System.out.printf("---Siguiente Estudiante--- \n");

		}

	}

}
