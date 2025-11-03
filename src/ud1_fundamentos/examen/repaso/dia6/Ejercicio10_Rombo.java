package ud1_fundamentos.examen.repaso.dia6;

import java.util.Scanner;

/*
 
 * Ejercicio 10 — Rombo de asteriscos
 * Dibuja un rombo centrado de altura n (ejm n= 5) : 

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *


 */
public class Ejercicio10_Rombo {

	public static void main(String[] args) {

		// Declara Variables
		int altura;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un número entero n (altura):");
		altura = entrada.nextInt();

		
		//parte positiva
		for (int i = 1 ; i <=  altura; i++) {

			// espacios
			for (int j = 1; j <= altura - i ; j++) {
				System.out.print(" ");
			}

			// asteriscos
			for (int j = 1; j <= 2*i - 1 ; j++) {
				System.out.print("*");
			}

			System.out.println();

		}
		//parte negativa
		for (int i = altura -1 ; i >= 1; i--) {

			// espacios
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
