/**
 * 
 */
package ud1_fundamentos.fundamentos.dia7;
import java.util.Scanner;

/**
Pide un número n y cuenta cuántos números pares hay entre 1 y n.
 */
public class Acumuladores07 {


	public static void main(String[] args) {
		
		//declaracion 
		int repeticiones ;
		int pares;
        Scanner entrada;
		
		//inicializacion 
        pares = 0;
        entrada = new Scanner(System.in);
        
		//toma de datos 
        System.out.println("Introduce el número máximo para calcular los pares que le anteceden:");
		repeticiones = entrada.nextInt();
		
		//operativa
		for (int i = 1; i <= repeticiones; i++) {
			
			if( i%2 == 0) {
				pares++;
			}
          }
		
		//salida del programa
		System.out.println("La cantidad de pares hasta " + repeticiones + " es: " + pares);
	    entrada.close();
	
	}
	
}