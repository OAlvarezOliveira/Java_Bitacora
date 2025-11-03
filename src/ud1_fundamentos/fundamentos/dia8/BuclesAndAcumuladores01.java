package ud1_fundamentos.fundamentos.dia8;
import java.util.Scanner;

/**
 * Escribe un programa que pida números enteros al usuario hasta que se
 * introduzca un 0.
 * 
 * Al finalizar, el programa debe mostrar:
 *  - La suma total de los números introducidos.
 *  - La cantidad de números introducidos (sin contar el 0).
 *  - El promedio de esos números.
 */
public class BuclesAndAcumuladores01 {

    public static void main(String[] args) {

        // Declaración e inicialización
        int numero = 1, contador = 0, suma = 0;
        double promedio;
        Scanner entrada = new Scanner(System.in);

        // Proceso
        while (numero != 0) {
            System.out.print("Introduce un número (0 para salir): ");
            numero = entrada.nextInt();

            if (numero != 0) {
                suma += numero;
                contador++;
            } else {
                System.out.println("Has introducido cero... saliendo del programa");
            }
        }

        if (contador > 0) {
            promedio = (double) suma / contador;
        } else {
            promedio = 0;
        }

        // Salida
        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("La cantidad de números introducidos es: " + contador);
        System.out.println("El promedio de los números introducidos es: " + promedio);
        entrada.close();
    }
}

