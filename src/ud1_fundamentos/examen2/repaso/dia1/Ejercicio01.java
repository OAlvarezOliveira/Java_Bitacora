
package ud1_fundamentos.examen2.repaso.dia1;

import java.util.Scanner;

/**
  EJERCICIO 1: Validar número par entre 10 y 50
Enunciado:
Pide un número al usuario. Debe ser PAR y estar entre 10 y 50 
(ambos incluidos).
Mientras no cumpla ambas condiciones, sigue pidiendo.
Al final, muestra: "Número válido: X"
 */
public class Ejercicio01 {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        
	        // DECLARACIÓN
	        int numero;
	        Scanner entrada;
	        
	        // INICIALIZACIÓN
	        entrada = new Scanner(System.in);
	        
	        // ENTRADA + VALIDACIÓN
	        do {
	            System.out.print("Introduce un número par entre 10 y 50: ");
	            numero = entrada.nextInt();
	            
	            if    (numero < 10 || numero > 50 || numero % 2 != 0) {System.out.println("Número Invalido: ");} 
	            
	        } while    (numero < 10 || numero > 50 || numero % 2 != 0 );
	        
	        // SALIDA
	        System.out.println("Número válido: " + numero);
	        
	        entrada.close();
	    }
	}

