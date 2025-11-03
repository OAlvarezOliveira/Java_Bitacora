package ud1_fundamentos.examen.repaso.dia8;

import java.util.Scanner;

public class Ejercicio13_TrianguloPascal_Trazas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el número de filas del triángulo: ");
        int n = entrada.nextInt();

        System.out.println("\n--- Generando Triángulo de Pascal con trazas ---\n");

        for (int i = 0; i < n; i++) {

            int valor = 1; // el primer número de cada fila siempre es 1

            // Espacios para centrar
            for (int e = 0; e < n - i; e++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                // Imprimir el valor actual
                System.out.print(valor + " ");

                // Traza: mostrar cómo se calcula el siguiente
                System.out.print("[i=" + i + ", j=" + j + ", valor=" + valor);

                if (j < i) { // mientras no sea el último
                    int siguiente = valor * (i - j) / (j + 1);
                    System.out.print(" → nuevo=" + valor + " * (" + (i - j) + ")/(" + (j + 1) + ")=" + siguiente);
                    valor = siguiente; // actualizar para el siguiente número
                }

                System.out.print("] ");
            }

            System.out.println("\n"); // salto de línea para la siguiente fila
        }

        entrada.close();
    }
}
