package ud1_fundamentos.examen.repaso.dia4;

import java.util.Scanner;

/**
 * Pide dos números y calcula su Mínimo Común Múltiplo (MCM)
 * mediante bucles (sin usar funciones matemáticas).
 * 
 * Pista: el primer múltiplo común que aparezca es el MCM.
 *
 * Curso 2025-26
 * @author oalva
 */
public class Ejercicio01_MCM_conBanderaBooleana {
    public static void main(String[] args) {

        // Declarar variables
        int num1;
        int num2;
        int mayor;
        boolean encontrado;

        // Inicializar variables
        Scanner entrada = new Scanner(System.in);
        encontrado = false;
        
        
        System.out.println("Introduce el primer número para hallar su MCM:");
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo número para hallar su MCM:");
        num2 = entrada.nextInt();

        // Determinar el mayor de los dos
        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }


        int i = mayor; // empezamos desde el mayor

        // Bucle controlado por bandera
        while (!encontrado) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println("El MCM de (" + num1 + ", " + num2 + ") es: " + i);
                encontrado = true;
            } else {
                i+=mayor; // Incrementamos  de  mayor en mayor para ahorrar calculos 
            }
        }

        entrada.close();
    }
}
