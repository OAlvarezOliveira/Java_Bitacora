/**
 * 
 */
package ud1_fundamentos.fundamentos.dia7;

import java.util.Scanner;

/**
Pide 5 números al usuario y muestra su promedio.
 */
public class Acumuladores04 {


	public static void main(String[] args) {
		
		int num; 
		int suma;
		double promedio;
        Scanner entrada = new Scanner(System.in);
		
        suma = 0;
        promedio =0;
		
		for (int i = 1; i <= 5; i++) {
   
			System.out.println("Introduce el numero " + i + " para el promedio");
			num = entrada.nextInt();
			suma = num +suma;	
          }
		promedio = (double)suma /5;
	    System.out.println("El promedio de los numeros introducidos es " + promedio );
	    entrada.close();
	
	}
	
}