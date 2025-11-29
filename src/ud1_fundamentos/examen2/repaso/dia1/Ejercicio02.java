package ud1_fundamentos.examen2.repaso.dia1;

import java.util.Scanner;

/*
 ## 💻 EJERCICIO 2: Validar edad entre 18 y 65

**Enunciado:**
Pide la edad al usuario. Debe estar entre 18 y 65 (ambos incluidos).
Si no es válida, muestra: "Edad no válida. Debe estar entre 18 y 65."
Cuando sea válida, muestra: "Edad registrada: X años"

Escríbelo completo tú desde cero (estructura completa).

---

 */
public class Ejercicio02 {

	public static void main(String[] args) {

		// DECLARACIÓN
		int edad;
		Scanner entrada;

		// INICIALIZACIÓN
		entrada = new Scanner(System.in);

		// ENTRADA + VALIDACIÓN
		do {
			System.out.println("Introduce la edad a comprobar: ");
			edad = entrada.nextInt();

			if (edad < 18 || edad > 65) {
				System.out.println("Edad no válida. Debe estar entre 18 y 65.");
			}

		} while (edad < 18 || edad > 65);

		// SALIDA
		System.out.printf("Edad registrada: %d  años %n", edad);

		entrada.close();
	}
}
