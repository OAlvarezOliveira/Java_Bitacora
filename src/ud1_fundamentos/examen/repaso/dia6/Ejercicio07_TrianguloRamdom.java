package ud1_fundamentos.examen.repaso.dia6;

import java.util.Random;
import java.util.Scanner;

/**
 * Figura aleatoria con asteriscos
 * 
 * Enunciado:
 * 
 * Pide al usuario un número entero n (altura). El programa elegirá
 * aleatoriamente entre dos figuras:
 * 
 * un triángulo rectángulo, o
 * 
 * un triángulo invertido.
 * 
 * Según la elección, dibujará la figura correspondiente usando *.
 * 
 * Ejemplo de salida:
 * 
 * Introduce la altura: 4 El programa ha elegido: triángulo rectángulo
 *
 **
 ***
 ****
 * 
 * 
 * 
 * O bien:
 * 
 * Introduce la altura: 4 El programa ha elegido: triángulo invertido
 ****
 ***
 **
 *
 * 
 */
public class Ejercicio07_TrianguloRamdom {

	public static void main(String[] args) {

		// Declara Variables
		int altura;
		int n;
		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();

		// Inicializar variables
		n = aleatorio.nextInt(0, 2); // genero un random del 0-1 ,
										// 0 para triangulo creciente
										// 1 para triangulo decreciente

		System.out.println("Introduce un número entero n (altura):");
		altura = entrada.nextInt();

		for (int i = 0; i < altura; i++) {

			if (n == 0) {
				// Creciente
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
			}

			else {
//        	    //Decreciente
				for (int j = 0; j < altura - i; j++) {
					System.out.print("*");
				}
			}

			System.out.println();

		}
		entrada.close();
	}
}
