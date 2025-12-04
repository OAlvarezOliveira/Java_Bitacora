package ud1_fundamentos.examen2.repaso.dia4;

import java.util.Scanner;

/*
 
Ejercicio: Calculadora de precio de entrada al cine
Pide la edad del cliente (debe ser entre 0 y 120, si no, error y termina).
Pide el día de la semana (1=Lunes, 2=Martes... 7=Domingo). Si no está entre 1-7, error y termina.
Reglas de precio:

Niños (0-12 años): 5€

Jóvenes (13-25 años):
Lunes a jueves: 7€
Viernes a domingo: 9€


Adultos (26-64 años):
Lunes a jueves: 10€
Viernes a domingo: 12€


Mayores (65+ años): 6€

Muestra el precio final con formato: "Precio: X.XX€"

Ejemplo:
Edad: 20
Día (1-7): 6
Precio: 9.00€

*/

public class EntradasCine {

	public static void main(String[] args) {

		// Declarar Variables

		int edadCliente;
		int diaSemana;
		double precioEntrada;

		final double TARIFA_NINOS = 5;
		final double TARIFA_MAYORES = 6;

		final double TARIFA_SEMANA_JOVENES = 7;
		final double TARIFA_FIDNE_JOVENES = 9;

		final double TARIFA_SEMANA_ADULTOS = 10;
		final double TARIFA_FIDNE_ADULTOS = 12;
		Scanner entrada;

		// inicializar Variables
		precioEntrada = 0;
		entrada = new Scanner(System.in);

		// Entrada de datos
		System.out.printf("¿Edad del cliente? %n");
		edadCliente = entrada.nextInt();

		// Operativa

		if (edadCliente >= 0 && edadCliente <= 120) {

//			System.out.printf("edadCliente %n"+ edadCliente ); //DEBUGG

			System.out.printf("¿Que dia de la semama es? %n");
			diaSemana = entrada.nextInt();

			if (diaSemana >= 1 && diaSemana <= 7) {

				if (edadCliente >= 0 && edadCliente <= 12) {

					// niños
					precioEntrada = TARIFA_NINOS;

				} else if (edadCliente >= 13 && edadCliente <= 25) {

					// jovenes

					if (diaSemana >= 1 && diaSemana <= 4) {
						precioEntrada = TARIFA_SEMANA_JOVENES;
					} else {
						precioEntrada = TARIFA_FIDNE_JOVENES;
					}

				} else if (edadCliente >= 26 && edadCliente <= 64) {

					// adultos
					if (diaSemana >= 1 && diaSemana <= 4) {
						precioEntrada = TARIFA_SEMANA_ADULTOS;
					} else {
						precioEntrada = TARIFA_FIDNE_ADULTOS;
					}

				} else { // mayores

					precioEntrada = TARIFA_MAYORES;

				}

				// Salida de datos

				System.out.printf("%s %.2f %n", "Precio:", precioEntrada);
//				System.out.printf("diaSemana %n" + diaSemana); //DEBUGG

			} else {
				System.out.printf("Error día incorrecto %n");
			}

		} else {
			System.out.printf("Error edad incorrecta %n");

		}

		entrada.close();

	}

}
