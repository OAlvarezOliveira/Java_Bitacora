package ud1_fundamentos.examen.repaso.dia1;


import java.util.Scanner;

/**
 * Pide 5 números y muestra la suma de los negativos.
 * Repaso examen - Día 1
 * Curso 2025-26
 * @author oalva
 */
public class Ejercicio02_SumarNegativos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int suma = 0;
        int contador = 0;


        
        while(contador < 5 ) {
        	System.out.println("Introduce el numero a validar: ");
        	num = entrada.nextInt();
        	
        	if(num<0) {suma+=num;}
        	contador++;
        }
        System.out.println("La suma de los negativos es " + suma);

        entrada.close();
    }
}
