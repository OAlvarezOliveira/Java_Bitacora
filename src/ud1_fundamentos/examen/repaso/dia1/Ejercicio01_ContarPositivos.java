package ud1_fundamentos.examen.repaso.dia1;

import java.util.Scanner;

/**
 * Pide 5 números y muestra cuántos son positivos.
 * Repaso examen - Día 1
 * Curso 2025-26
 * @author oalva
 */
public class Ejercicio01_ContarPositivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int positivos = 0;
        int contador = 0;

        // TODO: usar un bucle while que se repita 5 veces
        // dentro del bucle, pedir un número y si es positivo, aumentar el contador
        
        while(contador < 5 ) {
        	System.out.println("Introduce el numero a validar: ");
        	num = entrada.nextInt();
        	
        	if(num>0) {positivos++;}
        	contador++;
        }
        System.out.println("Has introducido " + positivos + " números positivos.");

        entrada.close();
    }
}
