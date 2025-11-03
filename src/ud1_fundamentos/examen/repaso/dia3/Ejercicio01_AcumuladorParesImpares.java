package ud1_fundamentos.examen.repaso.dia3;

import java.util.Scanner;

/**
 * Pide al usuario 5 números enteros.
 * 
 * Muestra cuántos son pares.
 * 
 * Muestra la suma total de los impares. * examen - Día 3 (Sesión 2) Curso
 * 2025-26
 * 
 * @author oalva
 */
public class Ejercicio01_AcumuladorParesImpares {
	public static void main(String[] args) {
		// TODO: pedir tamaño y dibujar el cuadrado lleno con bucles anidados

		// Declarar variables e inicializar variables
		int num;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero a comprobar:");
		num = entrada.nextInt();

		// Operativa		
		for (int i = 1; i <= 10; i++) {

			System.out.println( num + "X" + i + "= " + num*i );

		}
		entrada.close();

	}

}