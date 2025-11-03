package ud1_fundamentos.examen.repaso.dia8;

/*
Ejercicio 4 — Triángulo de Pascal (nivel alto)
sin funciones ni factoriales

*/

import java.util.Scanner;

public class Ejercicio12_TrianguloPascal_Basico {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el número de filas del triángulo: ");
        int n = entrada.nextInt();

        // Bucle principal: controla las filas
        for (int i = 0; i < n; i++) {
            int valor = 1; // el primer valor de cada fila siempre es 1

            // Espacios para centrar un poco
            for (int e = 0; e < n - i; e++) {
                System.out.print(" ");
            }

            // Imprimir valores de la fila
            for (int j = 0; j <= i; j++) {
                System.out.print(valor + " ");
                // Actualizar el siguiente valor sin usar arrays ni funciones
                valor = valor * (i - j) / (j + 1);
            }

            System.out.println();
        }

        entrada.close();
    }
}

