package ud1_fundamentos.examen.repaso.dia1;


import java.util.Scanner;

/**
 * Leer números hasta que el usuario introduzca 0 y 
 * mostrar la suma total de todos los números introducidos.
 * Repaso examen - Día 1
 * Curso 2025-26
 * @author oalva
 */
public class Ejercicio05_SumaHasta0 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
    	int suma = 0;
        
        do {
        	
        	System.out.println("Introduce el numero a sumar (0 para terminar): ");
        	num = entrada.nextInt();
        	suma += num; 
    
        	
        }while(num!=0);
        
        System.out.println("La Suma total de los numeros introducidos es "+suma);
        entrada.close();
    }
}
