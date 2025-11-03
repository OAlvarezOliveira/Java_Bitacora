/**
 * 
 */
package ud1_fundamentos.fundamentos.dia7;
import java.util.Scanner;

/**
Escribe un programa que pida un número n y calcule el 
producto de los números del 1 al n.
 */
public class Acumuladores06 {


	public static void main(String[] args) {
		
		//declaracion 
		int repeticiones ;
		int producto;
        Scanner entrada;
		
		//inicializacion 
        producto = 1;
        entrada = new Scanner(System.in);
        
		//toma de datos 
        System.out.println("Introduce el número máximo de la progresión a multiplicar: ");
		repeticiones = entrada.nextInt();
		
		//operativa
		for (int i = 1; i <= repeticiones; i++) {
			
			producto *= i;
          }
		
		//salida del programa
		System.out.println("El producto de los números hasta " + repeticiones + " es: " + producto);
	    entrada.close();
	
	}
	
}