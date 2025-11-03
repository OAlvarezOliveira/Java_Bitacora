package ud1_fundamentos.fundamentos.dia2;

import java.util.Scanner;


public class ConversorTemperatura {

	public static void main(String[] args) {

		
		// Declaracion de variables
		
        double temperatura;          // temperatura introducida por el usuario
        char unidad;                 // unidad introducida (C o F)
        double resultado;            // resultado de la conversión
        Scanner sc;                  // para lectura desde teclado

		// Inicializacion
        
        sc = new Scanner(System.in);
        resultado = 0;

		// Entrada de datos
        System.out.println("Conversor de Temperatura");
        System.out.print("Introduce la temperatura: ");
        temperatura = sc.nextDouble();
        System.out.print("¿La temperatura está en (C)elsius o (F)ahrenheit? ");
        unidad = sc.next().toUpperCase().charAt(0);
        sc.close();

		// Operativa
        
        if (unidad == 'C') {
            resultado = temperatura * 9 / 5 + 32;  // °C → °F
        } else if (unidad == 'F') {
            resultado = (temperatura - 32) * 5 / 9; // °F → °C
        } else {
            System.out.println("Unidad no reconocida. Usa C o F.");
            return; // salir del programa
        }

		// Salida de informacion
        
        if (unidad == 'C') {
            System.out.println(temperatura + " °C equivalen a " + resultado + " °F");
        } else {
            System.out.println(temperatura + " °F equivalen a " + resultado + " °C");
        }


	}

}
