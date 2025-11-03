package ud1_fundamentos.examen.repaso.dia7;

import java.util.Scanner;

/*
 
Enunciado:
Pide al usuario tres números enteros y muestra cuál es el mayor y cuál el menor usando solo Math.max() y Math.min().

Ejemplo de salida:

Introduce tres números: 5 9 3
El mayor es 9
El menor es 
  
 * */

public class Ejercicio07_MaxMinMathVersion {

	public static void main(String[] args) {

		//Declarar Variables
		int a;
		int b;
		int c;
		int max;
		int min;
		Scanner entrada = new Scanner (System.in);
		
		//Toma de datos
		System.out.println("Introduce el primer decimal positivo: ");
		a = entrada.nextInt();
		System.out.println("Introduce el segundo decimal positivo: ");
		b = entrada.nextInt();
		System.out.println("Introduce el tercer decimal positivo: ");
		c = entrada.nextInt();
		
		//Operativa
		max = Math.max(a, Math.max(b, c));
		min = Math.min(a, Math.min(b, c));

		
		
		//Salida de datos
		System.out.println("El mayor es "+ max);
		System.out.println("El menor es: "+ min);

		entrada.close();
	}

}
