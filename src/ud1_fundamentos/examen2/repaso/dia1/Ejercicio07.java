package ud1_fundamentos.examen2.repaso.dia1;

import java.util.Scanner;

/**
 * EJERCICIO 7: Calculadora de precios con IVA
 * 
 * Enunciado:
 * Pide un precio base (double) y calcula:
 * - IVA (21%)
 * - Precio final
 * 
 * Ejemplo de salida:
 * Introduce el precio base: 49.99
 * Precio base:  49.99 €
 * IVA (21%):    10.50 €
 * -----------------------
 * Precio final: 60.49 €
 */

public class Ejercicio07 {
    
    public static void main(String[] args) {
        
        // Declarar Variables
    	final double IVA = 0.21;
        double precioBase;
        double importeIVA;
        double precioFinal;
        Scanner entrada;
        
        // Inicializar Variables
        precioBase = 0.0;
        importeIVA = 0.0;
        precioFinal = 0.0;
		entrada = new Scanner(System.in);

        
        //Entrada de datos
        System.out.println ("Introduce el precio base del artículo");
        precioBase = entrada.nextDouble();
        
        // 3. Calcular IVA e importe final
        
        importeIVA =  precioBase * IVA;
        precioFinal = precioBase + importeIVA;
        
        // Salida de datos
        
        System.out.printf("Precio base:  %.2f €%n", precioBase);
        System.out.printf("IVA (21%%):    %.2f €%n", importeIVA);
        System.out.printf("-----------------------%n");
        System.out.printf("Precio final: %.2f €%n", precioFinal);
        //fin
        entrada.close();

    }
}