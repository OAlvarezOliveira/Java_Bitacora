package ud1_fundamentos.examen.repaso.dia8;

/*
 Ejercicio 7 — Contar pares e impares
📄 Enunciado

Realiza un programa que pida al usuario cuántos números va a introducir.

A continuación, deberá pedir uno a uno esos números por teclado.

Al finalizar, el programa mostrará cuántos de los números introducidos son pares y cuántos son impares.

*/

import java.util.Scanner;

public class Ejercicio07_ContarParesImpares {

	public static void main(String[] args) {

		// Declarar Variables
		int num;
		int valor;
		int acP;
		int acI;
		Scanner entrada = new Scanner(System.in);

		// Iniciar Variables
		num = 0;
		valor = 0;
		acP = 0;
		acI = 0;

		// Peticion de Datos
		System.out.println("Introduce los numeros quieres introducir : ");
		num = entrada.nextInt();

		// Operativa

		while (num > 0) {

			num--;

			System.out.println("Introduce los numeros quieres meter: ");
			valor = entrada.nextInt();

			if (valor % 2 == 0) {
				acP++;
			} else {
				acI++;
			}
		
			System.out.println("Todos los numeros han sido procesados");
		}

		entrada.close();

		// Salida de datos
		System.out.println("Has introducido " + acP + " numeros pares");
		System.out.println("Has introducido " + acI + " numeros impares");

	}
}
