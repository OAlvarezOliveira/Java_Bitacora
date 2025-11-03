package ud1_fundamentos.examen.repaso.dia3;

import java.util.Scanner;

/**
Pide dos números y calcula su Mínimo Común Múltiplo (MCM)
mediante bucles (sin usar funciones matemáticas).
Pista: el primer múltiplo común que aparezca es el MCM.

 * 2025-26
 * 
 * @author oalva
 */
public class Ejercicio04_MCM {
	public static void main(String[] args) {
		// TODO: pedir tamaño y dibujar el cuadrado lleno con bucles anidados

		// Declarar variables e inicializar variables
		int num1;
		int mayor;
		int num2;
		
		mayor=Integer.MIN_VALUE;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer numero para hayar su MCM:");
		num1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero para hayar su MCM:");
		num2 = entrada.nextInt();

		// Operativa	
		
		//encontrar el menor 
		if(num1  != num2) {
		if(num1 > num2) {mayor = num1;}else {mayor = num2;} 
		
		for(int i = mayor; ;i++ ) {
			
			if (i % num1 == 0  && i % num2 == 0  ) {   System.out.println("EL MCM es : " +i); break; }
		}
		
		
		
		}else {	System.out.println("Los numeros son iguales");
} 

entrada.close();

	}

}