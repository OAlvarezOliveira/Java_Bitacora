package ud1_fundamentos.examen2.repaso.dia1;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        // DECLARACIÓN
        int casos ;
        int penultimo;
        int ultimo;
        int fibonacci ;
        Scanner entrada;

        // INICIALIZACIÓN
        entrada = new Scanner(System.in);
        penultimo = 0; //primer termino de una seria fibonacci
        ultimo = 1;    //segundo termino de una seria fibonacci


        // ENTRADA + VALIDACIÓN
        do {
            System.out.print("Introduce cantidad (>=6 y par): ");
            casos = entrada.nextInt();

            if (casos  < 6 || casos  % 2 != 0) {
                System.out.println("Error: debe ser >=6 y par");
            }

        } while (casos  < 6 || casos  % 2 != 0);
        // FIN DO-WHILE
        
        
        //OPERATIVA FIBONACCI
        for (int i = 1; i <= casos ; i++) {
            // Imprimir término actual
            if (i != casos ) {
                System.out.print(penultimo + ", ");  // Con coma
            } else {
                System.out.print(penultimo);  // Sin coma (último)
            }

            // Calcular siguiente (intercambio con auxiliar fibonacci)

            fibonacci  = penultimo + ultimo;          
            penultimo = ultimo ;
            ultimo  = fibonacci;
        }

        System.out.println();  // Salto de línea final
        entrada.close();
    }
}