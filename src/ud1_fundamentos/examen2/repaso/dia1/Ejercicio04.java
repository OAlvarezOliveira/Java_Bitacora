package ud1_fundamentos.examen2.repaso.dia1;

import java.util.Scanner;


/*
Ejercicio 4** (menú con opciones 1-4)

Este es importante porque combina:
- Validación
- `switch` (decisión múltiple)
- Menú

**Enunciado recordatorio:**
```
=== MENÚ ===
1. Sumar
2. Restar
3. Multiplicar
4. Salir
Elige opción:  
 */

public class Ejercicio04 {

    public static void main(String[] args) {
        // Declaracion Variables
        int opcion;
        String operacion;
        Scanner entrada;

        // Inicializacion Variables
        entrada = new Scanner(System.in);
        operacion = "";

        // ENTRADA + VALIDACIÓN
        do {
            System.out.printf("""
                    === MENÚ ===
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. Salir
                    Elige opción:
                    """);
            opcion = entrada.nextInt();

            if (opcion < 1 || opcion > 4) {
                System.out.println("Opción inválida. Elige entre 1 y 4.");
            }

        } while (opcion < 1 || opcion > 4);

        // PROCESAMIENTO (después de validar)
        switch (opcion) {
            case 1 -> operacion = "Sumar";
            case 2 -> operacion = "Restar";
            case 3 -> operacion = "Multiplicar";
            case 4 -> operacion = "Salir";
        }

        // SALIDA
        System.out.printf("Has elegido la opción: %d - %s%n", opcion, operacion);

        entrada.close();
    }
}
