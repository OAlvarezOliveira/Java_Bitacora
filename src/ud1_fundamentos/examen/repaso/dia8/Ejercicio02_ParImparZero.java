package ud1_fundamentos.examen.repaso.dia8;


/*
Pedir un número entero y mostrar si es:

Cero

Par distinto de cero

Impar
 */

import java.util.Scanner;

public class Ejercicio02_ParImparZero {

	public static void main(String[] args) {
		
		int n;
		Scanner entrada = new Scanner(System.in);


		
		System.out.println("Introduce el  numero : ");
		n = entrada.nextInt();
		
		
		if (n == 0) {
			System.out.println("Es cero ");
			
		} else if (n % 2 == 0) {
			System.out.println("Es par ");

		} else { 
			System.out.println("Es impar  ");
			
		}
		entrada.close();
	}

}
