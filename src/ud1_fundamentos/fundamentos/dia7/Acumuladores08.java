package ud1_fundamentos.fundamentos.dia7;
import java.util.Scanner;

/**
 * Pide al usuario cuántos números va a introducir (n),
 * luego léelos uno a uno y calcula su promedio (media aritmética).
 * Ejemplo: Si el usuario introduce 2, 4, 6, 8 → promedio = 5.0
 */
public class Acumuladores08 {

    public static void main(String[] args) {

        // Declaración
        int n, numero, suma = 0;
        double promedio;
        Scanner entrada = new Scanner(System.in);

        // Entrada de datos
        System.out.print("¿Cuántos números deseas introducir?: ");
        n = entrada.nextInt();

        // Proceso
        for (int i = 1; i <= n; i++) {
            System.out.print("Introduce el número " + i + ": ");
            numero = entrada.nextInt();
            suma += numero;
        }

        promedio = (double) suma / n;

        // Salida
        System.out.println("El promedio de los números introducidos es: " + promedio);
        entrada.close();
    }
}
