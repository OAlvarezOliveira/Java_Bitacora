package ud1_fundamentos.fundamentos.dia8;

import java.util.Scanner;

/**
 Pide al usuario un número entero positivo n
y muestra la suma de todos sus divisores propios (es decir, sin contar el propio n).
 */
public class BuclesAnidados07 {

    public static void main(String[] args) {

        // Declaración
        int numero;
        Scanner entrada;
        int suma;

        // Inicialización
        suma = 0; 
        entrada = new Scanner(System.in);

        // Entrada
        System.out.println("Introduce un número entero positivo y "
      + "mostraré la suma de todos sus divisores propios "
      + "(es decir, sin contar el propio número) : ");
        numero = entrada.nextInt();

        // Proceso

        System.out.print("Los divisores de " +  numero + " son:");

            // Comprobamos si el número es divisor
            for (int i = 1; i < numero ; i++) {
                if (numero % i == 0) {
                   suma += i;
                   System.out.print(i+",");
                }
            } 

        // Salida final
        System.out.println();    
        System.out.println("La suma de sus divisores es: "+suma);    
        entrada.close();
    }
}

