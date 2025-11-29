package ud1_fundamentos.examen2.repaso.dia1;

import java.util.Scanner;

public class Ejercicio08 {
    
    public static void main(String[] args) {
        
        // DECLARACIÓN
        int segundosTotales;
        int horas;
        int minutos;
        int segundos;
        Scanner entrada;
        
        // INICIALIZACIÓN
        entrada = new Scanner(System.in);
        
        // ENTRADA
        System.out.print("Introduce segundos totales: ");
        segundosTotales = entrada.nextInt();
        
        // CÁLCULOS
        horas = segundosTotales / 3600;
        minutos = (segundosTotales % 3600) / 60;
        segundos = segundosTotales % 60;
        
        // SALIDA
        System.out.printf("Tiempo: %02d:%02d:%02d%n", horas, minutos, segundos);
        //                         ^^^^ ^^^^ ^^^^
        //                         Relleno con ceros (01, 02, 05)
        
        entrada.close();
    }
}