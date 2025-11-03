package ud1_fundamentos.examen.repaso.dia8;


/*
Ejercicio 2 — Suma hasta introducir 0

Pide números al usuario y suma todos hasta que escriba 0.

*/

import java.util.Scanner;

public class Ejercicio06_SumaHasta0 {
	
public static void main(String[] args) {



	
	//Declarar Variables
	int num = 0;
	int sum= 0;
	Scanner entrada = new Scanner (System.in);
	
	//Iniciar Variables
	num = -1;
	sum= 0;
	
	//Operativa
	while (num!=0) {
		    
		   //Entrada de datos 		
           System.out.println("Introduce los numeros a sumar (0 para salir): ");
           num= entrada.nextInt();
		
		sum += num;
		
	}
	entrada.close();
	//salida de datos
    System.out.println("Has introducido 0 . Fin del juego");
    System.out.println("La suma de los numeros introducidos es: "+sum);

	
	}
}


