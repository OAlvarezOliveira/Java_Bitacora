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
public class Ejercicio02_TablaMultiplicar {
	public static void main(String[] args) {
		// TODO: pedir tamaño y dibujar el cuadrado lleno con bucles anidados

		// Declarar variables e inicializar variables
		int num;
		int accPares = 0;
		int sumaImp = 0;
		Scanner entrada = new Scanner(System.in);

		// Operativa		
		for (int i = 0; i < 5; i++) {

			System.out.println("Introduce el numero a comprobar:");
			num = entrada.nextInt();

			if (num % 2 == 0) {
				accPares++;
			} else {
				sumaImp += num;
			}
		// Salida de datos	
		}
		System.out.println("Has introducido " + accPares + " numeros pares.");
		System.out.println("La suma de todos los impares introducidos es : " + sumaImp);
		entrada.close();

	}

}