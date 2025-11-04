package ud1_fundamentos.examen.repaso.dia8;

import java.util.Scanner;

/*
 

Pide una edad entre 18 y 65.
Si el usuario introduce un valor fuera del rango, repite la pregunta hasta obtener una edad válida.
Después muestra:
“Edad válida: XX años”
 
*/

public class Ejercicio15_Bucles {

	public static void main(String[] args) {

		// Declaracion de variables
		int edad;
;
		Scanner entrada = new Scanner(System.in);

		// Inicializar variables
		edad = 0;


		// Operativa
		while  ((edad < 18 || edad > 65 ) ) {

			// Toma de datos
			System.out.println("Introduce la edad a validar:");
			edad = entrada.nextInt();


		}
		// Salida de datos
		System.out.println("Edad válida: "+edad+" años");

		entrada.close();
		

	}

}
