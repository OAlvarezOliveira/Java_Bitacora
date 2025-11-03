
package ud1_fundamentos.examen.repaso.dia6;

import java.util.Random;
import java.util.Scanner;

/**
 * Enunciado:
 * 
 * Realiza un programa que genere un número entero aleatorio entre 0 y 100
 * (ambos incluidos). El usuario debe intentar adivinarlo en un máximo de 5
 * intentos.
 * 
 * En cada intento el programa debe:
 * 
 * Pedir al usuario un número.
 * 
 * Compararlo con el número secreto.
 * 
 * Mostrar un mensaje:
 * 
 * “Demasiado alto” si el número introducido es mayor.
 * 
 * “Demasiado bajo” si es menor.
 * 
 * “¡Has acertado!” si coincide.
 * 
 * Si el usuario no acierta en los 5 intentos, el programa mostrará el mensaje:
 * 
 * “Has agotado tus intentos. El número era X.”
 */
public class Ejercicio01_AdivinaNúmero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Declarar Variables
		int num;
		int numSecret;
		int vidas;
		boolean acertado;
		Random aleatorio;
		aleatorio = new Random();
		Scanner entrada = new Scanner(System.in);

		// Inicio Variables
		vidas = 5;
		acertado = false;
		numSecret = aleatorio.nextInt(0, 101); // genero el numero del 0-100 para adivinar

		while (vidas > 0 && !acertado) {
		    System.out.println("Introduce el número (0-100). Te quedan " + vidas + " vidas:");
		    num = entrada.nextInt();

		    if (num == numSecret) {
		        acertado = true;
		        System.out.println("¡Has acertado!");
		    } else if (num > numSecret) {
		        System.out.println("¡Demasiado alto!");
		        vidas--;
		    } else {
		        System.out.println("¡Demasiado bajo!");
		        vidas--;
		    }
		}

		if (!acertado) {
		    System.out.println("Has agotado tus intentos. El número era: " + numSecret);
		}// Fin While
		entrada.close();
	}

}
