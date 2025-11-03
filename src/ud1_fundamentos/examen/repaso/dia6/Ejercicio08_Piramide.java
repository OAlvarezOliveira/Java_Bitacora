package ud1_fundamentos.examen.repaso.dia6;


import java.util.Scanner;

/*
 
Pirámide centrada de asteriscos

Enunciado:

Pide al usuario un número entero n y dibuja una pirámide centrada de altura n.

Ejemplo para n = 4:

   *
  ***
 *****
*******


 */
public class Ejercicio08_Piramide {

	public static void main(String[] args) {

		// Declara Variables
		int altura;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un número entero n (altura):");
		altura = entrada.nextInt();

		for (int i = 1; i <=  altura; i++) {

			// asteriscos
			for (int j = i; j < altura  ; j++) {
				System.out.print(" ");
			}

			// asteriscos
			for (int j = 0; j < 2*i - 1 ; j++) {
				System.out.print("*");
			}

			System.out.println();

		}
		entrada.close();
	}
}
