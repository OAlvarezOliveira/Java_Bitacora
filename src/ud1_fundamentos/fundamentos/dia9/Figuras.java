package ud1_fundamentos.fundamentos.dia9;

public class Figuras {

	public static void main(String[] args) {

		int n = 4;

		// parte superior
		for (int i = 1; i <= n; i++) {                   // controla las filas
			for (int j = 1; j <= n - i; j++) {           // imprime espacios
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {       // imprime estrellas   
				System.out.print("*");
			}
			System.out.println();                       // salto de línea
		}

		// parte inferior
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
