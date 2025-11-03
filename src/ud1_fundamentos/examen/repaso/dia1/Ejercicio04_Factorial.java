package ud1_fundamentos.examen.repaso.dia1;


import java.util.Scanner;

/**
 * Pide 1 numero y calcula su factorial
 * Repaso examen - Día 1
 * Curso 2025-26
 * @author oalva
 */
public class Ejercicio04_Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int fac = 1;

    	System.out.println("Introduce el numero para calcular su factorial: ");
    	num = entrada.nextInt();
        
        for(int i=num; i >= 1 ; i-- ) {
        	
        	fac *= i;


        }
        System.out.println("El factorial de "+num+ " es "  + fac);
        entrada.close();
    }
}
