package ud1_fundamentos.examen.repaso.dia1;


import java.util.Scanner;

/**
 * Pide 5 números y muestra la suma de los negativos.
 * Repaso examen - Día 1
 * Curso 2025-26
 * @author oalva
 */
public class Ejercicio03_TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int res = 0;

    	System.out.println("Introduce el numero base para crear su tabla de multiplicar: ");
    	num = entrada.nextInt();
        
        for(int i=1; i <=10 ; i++ ) {
        	
        	res = i*num;
            System.out.println(i+" X "+num+ " = "  + res);

        }

        entrada.close();
    }
}
