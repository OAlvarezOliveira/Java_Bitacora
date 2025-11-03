/**
 * 
 */
package ud1_fundamentos.fundamentos.dia7;

import java.util.Scanner;

/**
Haz un programa que pida un número n y calcule la suma de los números del 1 al n.
Por ejemplo, si n = 5, la suma es 15.
 */
public class Acumuladores05 {


	public static void main(String[] args) {
		
		//declaracion 
		int repeticiones ;
		int suma;
        Scanner entrada;
		
		//inicializacion 
        suma = 0;
        entrada = new Scanner(System.in);
        
		//toma de datos 
		System.out.println("Introduce el numero  maximo de la progresion a sumar: ");
		repeticiones = entrada.nextInt();
		
		//operativa
		for (int i = 1; i <= repeticiones; i++) {
			
			suma += i;
          }
		
		//salida del programa
		System.out.println("La suma de los números del 1 al " + repeticiones + " es: " + suma);
	    entrada.close();
	
	}
	
}