package ud1_fundamentos.fundamentos.dia9;

import java.util.Scanner;

/**
 * Pide números al usuario hasta que introduzca 0.
 * Muestra el mayor, el menor y el promedio de los números introducidos.
 */
public class MayorMenorPromedio {

    public static void main(String[] args) {

        int num;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int suma = 0;
        int contador = 0;
        double promedio = 0.0;
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce un número (0 para salir): ");
            num = entrada.nextInt();
            if (num == 0) break;

            suma += num;
            contador++;

            if (num > mayor) mayor = num;
            if (num < menor) menor = num;
        }

        if (contador == 0) {
            System.out.println("No se han introducido valores para comparar.");
        } else {
            promedio = (double) suma / contador;
            System.out.println("El mayor valor introducido es: " + mayor);
            System.out.println("El menor valor introducido es: " + menor);
            System.out.println("El promedio de los números introducidos es: " + promedio);
        }

        entrada.close();
    }
}

