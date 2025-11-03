package ud1_fundamentos.examen.repaso.dia8;

import java.util.Scanner;

public class Ejercicio04_CalificacionCualitativa {

	public static void main(String[] args) {

		int n;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la nota del alumno : ");
		n = entrada.nextInt();

		if (n < 0 || n > 10) {
			System.out.println("Nota inválida");

		} else if (n >= 0 && n <= 4) {
			System.out.println("Suspenso");

		} else if (n >= 5 && n <= 6) {
			System.out.println("Aprobado");

		} else if (n >= 7 && n <= 8) {
			System.out.println("Notable");

		} else  {
			System.out.println("Sobresaliente");

		}

		entrada.close();
	}

}
