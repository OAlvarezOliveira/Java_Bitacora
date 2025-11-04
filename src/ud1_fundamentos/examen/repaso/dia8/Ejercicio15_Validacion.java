package ud1_fundamentos.examen.repaso.dia8;

import java.util.Scanner;

/*
 

Diseña un programa que pida números positivos hasta que se introduzca un número negativo.
Al finalizar, debe mostrar:

La suma total de los positivos.

Cuántos números se han introducido.

La media aritmética.
 
*/

public class Ejercicio15_Validacion {

	public static void main(String[] args) {

		// Declaracion de variables
		int n;
		int contador;
		double suma;
		double media;
		Scanner entrada = new Scanner(System.in);

		// Inicializar variables
		n = 0;
		contador = 0;
		suma = 0;
		media = 0;

		// Operativa
		while (n >= 0) {

			// Toma de datos
			System.out.println("Introduce el numero a contabilizar (num negativo para salir)");
			n = entrada.nextInt();
			// consideramos no contabilizar para la media aritmetica el negativo de salida
			if (n >= 0) {
				contador++;
				suma += n;
			}

		}
		entrada.close();
		// salida de datos
		if (contador > 0) {
			media = suma / contador;
		} else {
			System.out.println("No se introdujeron números positivos.");
		}

		System.out.println("La suma total de los positivos es : " + suma);
		// consideramos no contabilizar el negativo de salida , de querer hacerlo sumar
		// una unidad a acc
		System.out.println("Se han introducido :" + contador + " numeros.");
		// consideramos no contabilizar para la media aritmetica el negativo de salida
		System.out.println("La media aritmética es : " + media);

	}

}
