package ud1_fundamentos.examen.repaso.dia5;

import java.util.Scanner;

/*
 * 
 Ejemplo para n = 5:

  *  
  *  
*****
  *  
  *  

 
 */

public class Ejercicio08_CruzCompleta {

	public static void main(String[] args) {

		int altura;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la diagonal de la X a dibujar:");
		altura = entrada.nextInt();

		// Filas
		for (int i = 0; i < altura; i++) {

			// Columnas

			for (int j = 0; j < altura  ; j++) {

				if (i == altura/2 || j == altura/2) {

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

