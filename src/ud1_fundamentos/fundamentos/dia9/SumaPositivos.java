package ud1_fundamentos.fundamentos.dia9;

import java.util.Scanner;

/**
 * “Pide 5 números y muestra cuántos son positivos y la suma total de los negativos.”
 */
public class SumaPositivos {

    public static void main(String[] args) {

        int num;
        int suma = 0;
        int pos = 0;
        int datosEntrada = 0;
        Scanner entrada = new Scanner(System.in);

        while (datosEntrada < 5) {

            System.out.print("Introduce un número: ");
            num = entrada.nextInt();
            datosEntrada++;

            if (num > 0) {
                pos++;
            }
            if (num < 0) {
                suma += num;
            }
        }

        System.out.println("Cantidad de números positivos: " + pos);
        System.out.println("Suma total de los negativos: " + suma);

        entrada.close();
    }
}

