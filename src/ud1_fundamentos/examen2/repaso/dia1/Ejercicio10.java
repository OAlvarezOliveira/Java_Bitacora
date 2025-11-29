package ud1_fundamentos.examen2.repaso.dia1;

/*
  EJERCICIO 10: Tabla de conversión °C → °F
Enunciado:
Crea una tabla de conversión de temperaturas de Celsius a Fahrenheit.

Desde 0°C hasta 100°C
De 10 en 10
Fórmula: F = C * 9/5 + 32

Salida esperada:
===== CONVERSIÓN °C → °F =====
 Celsius  Fahrenheit
--------------------------
    0 °C      32,00 °F
   10 °C      50,00 °F
   20 °C      68,00 °F
   30 °C      86,00 °F
   40 °C     104,00 °F
   50 °C     122,00 °F
   60 °C     140,00 °F
   70 °C     158,00 °F
   80 °C     176,00 °F
   90 °C     194,00 °F
  100 °C     212,00 °F
Requisitos:

Celsius: alineado a la derecha, ancho 5 (para números de hasta 3 dígitos)
Fahrenheit: 2 decimales, alineado a la derecha, ancho 9
 */

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        // DECLARACIÓN
        int celsius;
        double fahrenheit;
        
        // SALIDA - Cabecera
        System.out.printf("===== CONVERSIÓN °C → °F =====%n");
        System.out.printf(" Celsius  Fahrenheit%n");
        System.out.printf("--------------------------%n");
        
        // BUCLE - Conversión
        for (celsius = 0; celsius <= 100; celsius += 10) {
            
            // Calcular Fahrenheit
            fahrenheit = celsius * 9.0 / 5.0 + 32;
            //                    ^^^ Importante: 9.0 para decimal, no 9
            
            System.out.printf("%5d °C %9.2f °F%n", celsius, fahrenheit);
            
        }
    }
}