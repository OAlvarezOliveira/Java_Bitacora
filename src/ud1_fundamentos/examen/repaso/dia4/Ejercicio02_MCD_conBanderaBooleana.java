package ud1_fundamentos.examen.repaso.dia4;

import java.util.Scanner;

/**
 * Pide dos números y calcula su Máximo Común Divisor (MCD)
 * mediante bucles (sin usar funciones matemáticas).
 * 
 * Pista: el primer divisor común que aparezca (empezando desde el menor) es el MCD.
 *
 * Curso 2025-26
 * @author oalva
 */
public class Ejercicio02_MCD_conBanderaBooleana {
    public static void main(String[] args) {

        // Declarar variables
        int num1;
        int num2;
        int menor;
        boolean encontrado;

        // Inicializar variables
        Scanner entrada = new Scanner(System.in);
        encontrado = false;

        System.out.println("Introduce el primer número para hallar su MCD:");
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo número para hallar su MCD:");
        num2 = entrada.nextInt();

        // Determinar el menor de los dos
        if (num1 < num2) {
            menor = num1;
        } else {
            menor = num2;
        }

        int i = menor; // empezamos desde el menor

        // Bucle controlado por bandera
        while (!encontrado) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("El MCD de (" + num1 + ", " + num2 + ") es: " + i);
                encontrado = true;
            } else {
                i--; // Decrementamos i una unidad para probar el siguiente divisor
            }
        }

        entrada.close();
    }
}
