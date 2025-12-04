package ud1_fundamentos.examen2.repaso.dia3;

import java.util.Scanner;

/**
 * Tabla con validacion y printf
 */
public class TablaMultiplicarValidar {
	public static void main(String[] args) {
		// Declarar variables
		int multiplicando;
		int producto;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce el valor del multiplicando :");
		multiplicando = entrada.nextInt();
		
		if(multiplicando > 0 && multiplicando < 11  ) {

		for (int multiplicador  = 1; multiplicador <= 10; multiplicador++) {
			
			producto = multiplicando * multiplicador;
			
	
			System.out.printf("%d X %d = %d%n",multiplicando,multiplicador,producto);
		} //fin for
		
		} else {System.out.printf("Error: número fuera de rango"); }
		
		entrada.close();

	}
	
}