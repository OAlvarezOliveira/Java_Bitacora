package ud1_fundamentos.examen2.repaso.dia5;

import java.util.Scanner;

/*
 *Ejercicio: Calculadora de descuento en tienda
Pide la edad del cliente (debe ser entre 0 y 120, si no, error y termina).
Pide el importe de la compra en euros (debe ser mayor que 0, si no, error y termina).
Reglas de descuento:

Niños (0-12 años):

Si compra < 50€: sin descuento
Si compra >= 50€: 10% descuento


Adultos (13-64 años):

Si compra < 100€: sin descuento
Si compra >= 100€: 15% descuento


Mayores (65+ años):

Siempre 20% descuento (sin importar importe)



Muestra el precio final con 2 decimales: "Precio final: X.XX"
Ejemplo:
Edad: 70
Importe: 80.00
Precio final: 64.00
Edad: 25
Importe: 90.00
Precio final: 90.00

 */

public class CalculadoraDescuento {

	public static void main(String[] args) {

		// DECLARACION VARIABLES

		final double DESCUENTO_NINHOS;
		final double DESCUENTO_ADULTOS;
		final double DESCUENTO_MAYORES;
		final double MINIMACOMPRA_NINHOS;
		final double MINIMACOMPRA_ADULTOS;
		double importe;
		int edad;
		double precioFinal;
		boolean opera = true;
		Scanner entrada;

		// INICIALIZACION VARIABLES

		DESCUENTO_NINHOS = 0.1;
		DESCUENTO_ADULTOS = 0.15;
		DESCUENTO_MAYORES = 0.2;
		MINIMACOMPRA_NINHOS = 50;
		MINIMACOMPRA_ADULTOS = 100;
		importe = 0;
		precioFinal = 0;
		entrada = new Scanner(System.in);

		// OPERATIVA

		while (opera) {

			// Pide la edad si no termina

			edad = entrada.nextInt();
			if (edad < 0 || edad > 120) {
				System.out.printf("%s %n", "Edad Erronea");
				opera = false;
			} else {

				// Pide el importe si no termina

				importe = entrada.nextDouble();

				if (importe <= 0) {
					System.out.printf("%s %n", "Importe Erroneo");
					opera = false;
				} else {

					if (edad <= 12) { // Niños
						if (importe >= MINIMACOMPRA_NINHOS) {
							precioFinal = importe * (1 - DESCUENTO_NINHOS);
						} else {
							precioFinal = importe; // SIN descuento
						}
					} else if (edad <= 64) { // Adultos
						if (importe >= MINIMACOMPRA_ADULTOS) {
							precioFinal = importe * (1 - DESCUENTO_ADULTOS);
						} else {
							precioFinal = importe; // SIN descuento
						}
					} else { // Mayores (65+)
						precioFinal = importe * (1 - DESCUENTO_MAYORES);
					}

					// Salida de datos

					System.out.printf("Precio final: %.2f%n", precioFinal);

				}

			}

		}
		entrada.close();
	}

}
