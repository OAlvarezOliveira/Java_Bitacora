/**
 * 
 */
package ud1_fundamentos.examen2.repaso.dia5;

import java.util.Scanner;

/*
 Numero perfecto con validacion 
 */
public class NumeroPerfecto {

	public static void main(String[] args) {

		int numero;
		int suma;
		Scanner entrada;

		entrada = new Scanner(System.in);
		numero = -1;


		while (numero != 0) {

			numero = entrada.nextInt();
			suma = 0;

			for (int i = 1; i <= numero / 2; i++) {

				if (numero % i == 0) {
					suma += i;
				}

			}
			if (numero != 0) {

				if (suma == numero) {
					System.out.printf("%s %n", "PERFECTO");
				} else {
					System.out.printf("%s %n", "NO PERFECTO");
				}

			}

		}

		entrada.close();
	}

}
