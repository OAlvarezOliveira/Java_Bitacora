package ud1_fundamentos.examen.repaso.dia8;

import java.util.Scanner;

/*
 
Pide tres números enteros distintos y muestra cuál es el del medio (ni el mayor ni el menor).
Si hay empates, indícalo.

*/

public class Ejercicio14_Condicionales {

	public static void main(String[] args) {

		// Declaracion de variables
		int a;
		int b;
		int c;
		int medio;
		Scanner entrada = new Scanner(System.in);

		// Inicializar variables
		medio = 0;
		
		// Toma de datos
		System.out.println("Introduce el primer numero ");
		a = entrada.nextInt();
		System.out.println("Introduce el segundo numero ");
		b = entrada.nextInt();
		System.out.println("Introduce el tercero numero ");
		c = entrada.nextInt();

		//medio
		
		if ((a > b && a < c) || (a < b && a > c)) {System.out.println("a es el medio ");} 
		if ((b > a && b < c) || (b < a && b > c)) {System.out.println("b es el medio ");} 
		if ((c > a && c < b) || (c < a && c > b)) {System.out.println("c es el medio ");} 

		
		//empates
		if (a == b && a == c && b == c) {
			System.out.println("Los 3 valores son iguales ");
		} else if (a == b ) {
			System.out.println("A es igual a B ");
		} else if (a == c) {
			System.out.println("A es igual a C ");
		} else if ( b == c) {
			System.out.println("B es igual a C ");
		}
		
		

		entrada.close();
		System.out.println("El valor medio es  " + medio);
	}

}
