package ud1_fundamentos.examen.repaso.dia2;

import java.util.Scanner;

/**
 * Dibuja un cuadrado lleno de asteriscos según el tamaño introducido. Repaso
 * examen - Día 1 (Sesión 2) Curso 2025-26
 * 
 * @author oalva
 */
public class Ejercicio02_CuadradoHueco {
	public static void main(String[] args) {
		// TODO: pedir tamaño y dibujar el cuadrado lleno con bucles anidados

		// Declarar variables
		int lado;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el tamaño de lado para dibujar el cuadrado:");
		lado = entrada.nextInt();

		for (int i = 0; i < lado; i++) {

			for (int j = 0; j < lado; j++) {

				if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		entrada.close();
	}
}