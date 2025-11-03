package ud1_fundamentos.examen.repaso.dia6;

import java.util.Random;

/**
 * Lanzamiento de moneda (3 caras seguidas)
 * 
 * Enunciado:
 * 
 * Simula el lanzamiento de una moneda hasta obtener 3 caras consecutivas.
 * Muestra por pantalla el resultado de cada lanzamiento (“cara” o “cruz”) y al
 * finalizar indica cuántas tiradas fueron necesarias en total.
 */
public class Ejercicio06_Moneda {

	public static void main(String[] args) {

		//Declara Variables 
		int n;
		int intento;
		int cara;
		Random aleatorio = new Random();
		
		//Inicializar variables
		intento = 0;
		cara = 0;

		while (cara < 3) {

			intento++;
			n = aleatorio.nextInt(0, 2); // genero un random del 0-1

			if (n == 0) {
				System.out.println("Cara");
				cara++;
			} else {
				System.out.println("Cruz");
				cara = 0;
			}

		}

		System.out.println("Fueron necesarios " + intento + " para sacar 3 caras seguidas");

	}
}
