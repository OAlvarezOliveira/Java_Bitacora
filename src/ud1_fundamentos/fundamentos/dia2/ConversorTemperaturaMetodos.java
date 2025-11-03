package ud1_fundamentos.fundamentos.dia2;

import java.util.Scanner;

public class ConversorTemperaturaMetodos {

    // Método para convertir de Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // Método para convertir de Fahrenheit a Celsius
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        // Declaración de variables
        double temperatura;
        char unidad;
        double resultado = 0;

        // Inicialización del Scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Conversor de Temperatura (v2 con métodos)");
        System.out.print("Introduce la temperatura: ");
        temperatura = sc.nextDouble();
        System.out.print("¿La temperatura está en (C)elsius o (F)ahrenheit? ");
        unidad = sc.next().toUpperCase().charAt(0);
        sc.close();

        // Operativa usando métodos
        if (unidad == 'C') {
            resultado = celsiusAFahrenheit(temperatura);
            System.out.println(temperatura + " °C equivalen a " + resultado + " °F");
        } else if (unidad == 'F') {
            resultado = fahrenheitACelsius(temperatura);
            System.out.println(temperatura + " °F equivalen a " + resultado + " °C");
        } else {
            System.out.println("Unidad no reconocida. Usa C o F.");
        }
    }
}

