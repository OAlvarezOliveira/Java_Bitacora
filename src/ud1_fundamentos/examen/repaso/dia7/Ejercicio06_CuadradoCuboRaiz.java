package ud1_fundamentos.examen.repaso.dia7;

import java.util.Scanner;

/*
 
 Enunciado:
Pide al usuario un número decimal positivo.
Muestra su cuadrado, cubo y raíz cuadrada, redondeados a dos decimales.

Salida esperada:
Introduce un número: 5
Cuadrado: 25.00
Cubo: 125.00
Raíz cuadrada: 2.24
  
 * */

public class Ejercicio06_CuadradoCuboRaiz {

	public static void main(String[] args) {

		//Declarar Variables
		int n;
		int cuadrado;
		int cubo;
		double raiz;
		Scanner entrada = new Scanner (System.in);
		
		//Toma de datos
		System.out.println("Introduce un número decimal positivo: ");
		n = entrada.nextInt();
		
		//Operativa
		cuadrado = (int) Math.pow(n, 2); 
		cubo = (int) Math.pow(n, 3);
		raiz= (double) Math.sqrt(n);

		//Salida de datos
		System.out.println("Cuadrado: "+ Math.round(cuadrado * 100.0) / 100.0);
		System.out.println("Cubo: "+ Math.round(cubo * 100.0) / 100.0);
		System.out.println("Raíz cuadrada: "+ Math.round(raiz * 100.0) / 100.0);

		entrada.close();
	}

}
