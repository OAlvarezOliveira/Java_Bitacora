package ud1_fundamentos.fundamentos.dia8;
import java.util.Scanner;

/**
 * Lee números hasta que el usuario introduzca 0, y al final muestra:
 * - La suma total
 * - El promedio
 * - El número mayor
 * - El número menor
 * - La cantidad de números introducidos (sin contar el 0)
 */
public class BuclesAndAcumuladores04 {

    public static void main(String[] args) {

        // Declaración e inicialización
        int numero = 1;
        int suma = 0;
        int contador = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        double promedio = 0;
        boolean introducido = false;
        Scanner entrada = new Scanner(System.in);

        // Proceso
        while (numero != 0) {
            System.out.print("Introduce un número (0 para salir): ");
            numero = entrada.nextInt();

            if (numero != 0) {
                suma += numero;

                if (numero > mayor) mayor = numero;
                if (numero < menor) menor = numero;

                contador++;
                introducido = true;
            } else {
                System.out.println("Has introducido cero... saliendo del programa");
            }
        }

        // Salida
        if (introducido) {
            promedio = (double) suma / contador;
            System.out.println("El número mayor introducido es: " + mayor);
            System.out.println("El número menor introducido es: " + menor);
            System.out.println("La cantidad de números introducidos es: " + contador);
            System.out.println("La suma de los números introducidos es: " + suma);
            System.out.println("El promedio de los números introducidos es: " + promedio);
        } else {
            System.out.println("No se introdujeron números válidos.");
        }

        entrada.close();
    }
}

