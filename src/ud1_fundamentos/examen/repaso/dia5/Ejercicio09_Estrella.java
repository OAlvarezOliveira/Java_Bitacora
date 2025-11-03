package ud1_fundamentos.examen.repaso.dia5;

import java.util.Scanner;

/*
 Para n = 7:
 
*     *     * 
  *   *   *   
    * * *     
* * * * * * * 
    * * *     
  *   *   *   
*     *     * 

 
 */

public class Ejercicio09_Estrella {

	public static void main(String[] args) {

		int altura;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la diagonal de la X a dibujar:");
		altura = entrada.nextInt();

		// Filas
		for (int i = 0; i < altura; i++) {

			// Columnas

			for (int j = 0; j < altura  ; j++) {

				if ( (i == j || i + j == altura - 1) || (i == altura/2 || j == altura/2) ) {

					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();

		}
		entrada.close();
	}

}

