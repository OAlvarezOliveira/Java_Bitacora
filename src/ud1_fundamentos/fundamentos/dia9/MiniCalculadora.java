package ud1_fundamentos.fundamentos.dia9;
import java.util.Scanner;

/**
 * Mini calculadora con método para leer operandos.
 */
public class MiniCalculadora {

    public static void main(String[] args) {

        char opcion;
        double resultado;
        double[] operandos;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\nMENÚ DE OPERACIONES");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Introduce una opción: ");
            opcion = entrada.next().charAt(0);

            switch (opcion) {
                case '1' -> {
                    operandos = leerOperandos(entrada);
                    resultado = operandos[0] + operandos[1];
                    System.out.println("Resultado: " + resultado);
                }
                case '2' -> {
                    operandos = leerOperandos(entrada);
                    resultado = operandos[0] - operandos[1];
                    System.out.println("Resultado: " + resultado);
                }
                case '3' -> {
                    operandos = leerOperandos(entrada);
                    resultado = operandos[0] * operandos[1];
                    System.out.println("Resultado: " + resultado);
                }
                case '4' -> {
                    operandos = leerOperandos(entrada);
                    if (operandos[1] == 0) {
                        System.out.println("No se puede dividir entre 0.");
                    } else {
                        resultado = operandos[0] / operandos[1];
                        System.out.println("Resultado: " + resultado);
                    }
                }
                case '5' -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != '5');

        entrada.close();
    }

    // 🔹 Método auxiliar para leer dos operandos y devolverlos como array
    static double[] leerOperandos(Scanner entrada) {
        double[] operandos = new double[2];
        System.out.print("Introduce el primer número: ");
        operandos[0] = entrada.nextDouble();
        System.out.print("Introduce el segundo número: ");
        operandos[1] = entrada.nextDouble();
        return operandos;
    }
}

