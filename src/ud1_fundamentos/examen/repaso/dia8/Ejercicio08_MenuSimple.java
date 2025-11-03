package ud1_fundamentos.examen.repaso.dia8;

import java.util.Scanner;

public class Ejercicio08_MenuSimple {

	public static void main(String[] args) {

		int opc;
		Scanner entrada = new Scanner(System.in);

		do {
			
			System.out.println("\nMENÚ PRINCIPAL");
			System.out.println("1. Sumar ");
			System.out.println("2. Restar ");
			System.out.println("3. Salir");
			System.out.print("Elige una opción: ");
			opc = entrada.nextInt();

			switch (opc) {
			case 1 -> System.out.println("Has elegido la opción de Sumar ");
			case 2 -> System.out.println("Has elegido la opción de Restar ");
			case 3 -> System.out.println("Has elegido la opción de Salir");

			default -> System.out.println("La opcion elegida no es valida");

			}
		}while (opc != 3);
		
		entrada.close();
        System.out.println("Fin de la ejecución. ¡Hasta pronto!");

	}

}
