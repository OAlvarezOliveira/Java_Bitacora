package ud1_fundamentos.examen.repaso.dia7;

import java.util.Scanner;

/*

Ejercicio 1 — Contador de múltiplos

Enunciado:

Pide al usuario un número entero positivo n.
El programa debe indicar:

cuántos números entre 1 y n son múltiplos de 3,

cuántos son múltiplos de 5,

y cuántos son múltiplos de ambos (es decir, de 15).
 
*/

public class Ejercicio01ContadorMultiplos {

	public static void main(String[] args) {

		// Declarar Variables
		int n;
		int multi15;
		int multi5;
		int multi3;
		Scanner entrada = new Scanner(System.in);

		// Inicializar Variables
		multi15 = 0;
		multi5 = 0;
		multi3 = 0;

		// Toma de datos
		System.out.println("Introduce un número entero positivo para comprobar los multiplso de 3 y 5 que contiene");
		n = entrada.nextInt();

		// Operativa
		for (int i = 1; i <= n; i++) {

			multi15 += (i % 15 == 0) ? 1 : 0; // Es divisor de 15
            multi5  += (i % 5  == 0) ? 1 : 0; // Es divisor de 5
            multi3  += (i % 3  == 0) ? 1 : 0; // Es divisor de 3

			}

		entrada.close();
		// Salida de datos
		System.out.println("Múltiplos de 3 y 5: " + multi15);
		System.out.println("Múltiplos de 5: " + multi5);
		System.out.println("Múltiplos de 3: " + multi3);

	}
}
