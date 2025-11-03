package ud1_fundamentos.examen.repaso.dia8;


import java.util.Scanner;

/*
 🧮 Ejercicio 1 — El mayor de tres

Pide tres números enteros por teclado y 
muestra cuál es el mayor de los tres.
Si hay empate, indícalo también 
(por ejemplo, “hay dos números iguales y son los mayores”).
 
  
 */

public class Ejercicio01_Mayor3 {

	public static void main(String[] args) {

		int n1;
		int n2;
		int n3;
		int mayor;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el primer numero : ");
		n1 = entrada.nextInt();
		mayor = n1;
		System.out.println("Introduce el segundo numero : ");
		n2 = entrada.nextInt();
		if (n2 > mayor) {
			mayor = n2;
		}
		System.out.println("Introduce el tercer numero : ");
		n3 = entrada.nextInt();
		if (n3 > mayor) {
			mayor = n3;
		}

		if (n1 == mayor && n2 == mayor && n3 == mayor) {
		    System.out.println("Todos los números introducidos son iguales.");
		} else if (n1 == mayor && n2 == mayor) {
		    System.out.println("Los números " + n1 + " y " + n2 + " son iguales y los mayores.");
		} else if (n1 == mayor && n3 == mayor) {
		    System.out.println("Los números " + n1 + " y " + n3 + " son iguales y los mayores.");
		} else if (n2 == mayor && n3 == mayor) {
		    System.out.println("Los números " + n2 + " y " + n3 + " son iguales y los mayores.");
		} else {
		    System.out.println("Todos los números introducidos son distintos.");
		}
	

		System.out.println("El valor mas grande introducido es  " + mayor);

		entrada.close();

	}

}
