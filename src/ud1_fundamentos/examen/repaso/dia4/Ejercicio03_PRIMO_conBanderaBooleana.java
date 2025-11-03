package ud1_fundamentos.examen.repaso.dia4;

import java.util.Scanner;

/**
 * Pide un número para comprobar si es primo
 *
 * Curso 2025-26
 * 
 * @author oalva
 */
public class Ejercicio03_PRIMO_conBanderaBooleana {
	public static void main(String[] args) {

		// Declarar variables
		int num;
		boolean esPrimo;

		// Inicializar variables
		Scanner entrada = new Scanner(System.in);
		esPrimo = true;

		System.out.println("Introduce el  número para comprobar si es primo:");
		num = entrada.nextInt();

		// Bucle controlado por bandera , se inicia i en 2 por que 1 es condicion de primo
        for(int i = 2 ; i< num && esPrimo ;i++) {
        	
        	if(num%i == 0) {esPrimo =  false;}
        	
        }
        
        if (esPrimo) { 		System.out.println("El número " +num + " es Primo. ");

			
		} else { System.out.println("El número " +num + " no es Primo. ");

		}
        

		entrada.close();
	}
}
