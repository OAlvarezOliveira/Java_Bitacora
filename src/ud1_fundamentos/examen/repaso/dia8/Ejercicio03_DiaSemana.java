package ud1_fundamentos.examen.repaso.dia8;

import java.util.Scanner;

public class Ejercicio03_DiaSemana {

	public static void main(String[] args) {


		int n;
		Scanner entrada = new Scanner(System.in);


		
		System.out.println("Introduce el numero de la semana (1-7) : ");
		n = entrada.nextInt();
		
		
		switch (n) {
		case 1 ->System.out.println("Hoy en lunes ");
		case 2 ->System.out.println("Hoy en martes ");
		case 3 ->System.out.println("Hoy en miercoles ");
		case 4 ->System.out.println("Hoy en jueves ");
		case 5 ->System.out.println("Hoy en viernes ");
		case 6 ->System.out.println("Hoy en sabado ");
		case 7 ->System.out.println("Hoy en domingo ");		
		default -> System.out.println("Número inválido ");
		}
		entrada.close();
	}

}
