package ud1_fundamentos.examen.repaso.dia6;


import java.util.Scanner;

/*
 
Pirámide centrada de asteriscos

Enunciado:

Pide al usuario un número entero n y dibuja una pirámide centrada invertida de altura n.

Ejemplo para n = 4:

*******
 *****
  ***
   *

 */
public class Ejercicio09_PiramideInvertida {

	public static void main(String[] args) {

		// Declara Variables
		int altura;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un número entero n (altura):");
		altura = entrada.nextInt();

		for (int i = altura; i >=  1; i--) {

			// asteriscos
			for (int j = 1; j <= altura - i ; j++) {
				System.out.print(" ");
			}

			// asteriscos
			for (int j = 1; j <= 2*i - 1 ; j++) {
				System.out.print("*");
			}

			System.out.println();

		}
		entrada.close();
	}
}
