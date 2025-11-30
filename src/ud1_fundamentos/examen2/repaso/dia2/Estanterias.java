
package ud1_fundamentos.examen2.repaso.dia2;

import java.util.Scanner;

/**
PROBLEMA 2: ESTANTERÍAS
Enunciado:
Tienes una estantería con capacidad máxima de C kg. Vas a colocar libros que pesan: 1kg, 2kg, 3kg, 4kg, 5kg... (peso progresivo).
Colocas el libro de 1kg, luego el de 2kg, luego el de 3kg... hasta que el siguiente libro ya no cabe.
Entrada:

Primera línea: número de casos
Cada caso: capacidad C (entero positivo ≤ 1.000.000)

Salida:

Para cada caso: número de libros que caben

Ejemplo:
Entrada:
3
6
10
1

Salida:
3
4
1
Explicación:

C = 6: Libros de 1+2+3 = 6kg → 3 libros
C = 10: Libros de 1+2+3+4 = 10kg → 4 libros
C = 1: Libro de 1kg → 1 libro
 */
public class Estanterias {


	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int capacidadAcumulada;
		int libros;

		
		int casos = entrada.nextInt();

		for (int i = 0; i < casos; i++) {
			//reset
			capacidadAcumulada = 0;
			libros = 0;
			
		    int capacidad = entrada.nextInt();
		    
			for (int j = 1; j + capacidadAcumulada <= capacidad; j++) {
			    
				capacidadAcumulada+=j;
				libros++;
		}
			System.out.println(libros);

	} // Fin caso
		
		entrada.close();
	}

}
