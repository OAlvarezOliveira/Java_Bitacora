package ud1_fundamentos.examen.repaso.dia3;

import java.util.Scanner;

/**
 * Para una altura n, dibuja esta figura:

*
**
***
****
***
**
*


 * 2025-26
 * 
 * @author oalva
 */
public class Ejercicio03_ArcoOrtodoxo {
	public static void main(String[] args) {

		// Declarar variables e inicializar variables
		int num;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la altura de la figura  a dibujar:");
		num = entrada.nextInt();

		// Operativa		
		for (int i = 0; i < num; i++) {

			for (int j = 0; j <= i - 1 ; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();

		}
		
		for (int i = 0; i < num; i++) {

			for (int j = 0; j < num - i - 2; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();

		}
		entrada.close();

	}

}