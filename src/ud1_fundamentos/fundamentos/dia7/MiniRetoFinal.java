package ud1_fundamentos.fundamentos.dia7;
import java.util.Scanner;

/**
Pide un número n y luego solicita n números por teclado.
El programa debe calcular y mostrar:
La suma de los números pares introducidos.
La suma de los números impares introducidos.
Ejemplo:
Si el usuario introduce 6 números → 2, 3, 5, 8, 10, 7
Suma de pares = 2 + 8 + 10 = 20
Suma de impares = 3 + 5 + 7 = 15
 */
public class MiniRetoFinal {

    public static void main(String[] args) {

        // Declaración
        int n, numero, sumaP = 0,sumaI = 0;
        Scanner entrada = new Scanner(System.in);

        // Entrada de datos
        System.out.print("¿Cuántos números deseas introducir?: ");
        n = entrada.nextInt();

        // Proceso
        for (int i = 1; i <= n; i++) {
        	
            System.out.println("Introduce el numero " + i+":");
            numero = entrada.nextInt();
        
        	if (numero%2 == 0) {
        		
        		sumaP+= numero; 
				
			} else {
				sumaI+= numero;
			}
        	
        }



        // Salida
        System.out.println("La suma de los números pares introducidos es: " + sumaP);
        System.out.println("La suma de los números impares introducidos es: " + sumaI);
        entrada.close();
    }
}