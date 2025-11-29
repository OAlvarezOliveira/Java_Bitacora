package ud1_fundamentos.examen2.repaso.dia1;

import java.util.Scanner;

/*
 EJERCICIO 6: Tabla de multiplicar con printf

**Enunciado:**
Pide un número del 1 al 10 y muestra su tabla de multiplicar usando `printf`.

**Formato de salida:**
```
=== Tabla del 7 ===
 7 x  1 =  7
 7 x  2 = 14
 7 x  3 = 21
 7 x  4 = 28
 7 x  5 = 35
 7 x  6 = 42
 7 x  7 = 49
 7 x  8 = 56
 7 x  9 = 63
 7 x 10 = 70
 * */

public class Ejercicio06 {

	public static void main(String[] args) {

		// Declaracion de Variables
		int numero;
		int resultado;
		Scanner entrada;

		// Inicializacion de Variables
		entrada = new Scanner(System.in);
		numero = 0;

		while (numero < 1 || numero > 10) {
			System.out.println("Introduce un numero del 1 al 10");
			numero = entrada.nextInt();

			if (numero < 1 || numero > 10) {
				System.out.println("Numero incorrecto");
			} else {

				for (int i = 1; i <= 10; i++) {
					
					resultado = numero *i; 
					System.out.printf("%2d X %2d = %2d\n",numero,i,resultado);
				} 
			}

		}
		entrada.close();
	}

}
