package ud1_fundamentos.fundamentos.dia9;
import java.util.Scanner;

/**
 * Pide una nota (0–10) y muestra:
 * 0–4 → “Suspenso”
 * 5–6 → “Aprobado”
 * 7–8 → “Notable”
 * 9–10 → “Sobresaliente”
 */
public class CondicionalesAndLogicaCompuesta {

    public static void main(String[] args) {

        int nota;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce la nota a validar: ");
        nota = entrada.nextInt();

        switch (nota) {
            case 0, 1, 2, 3, 4 -> System.out.println("La nota es Suspenso");
            case 5, 6 -> System.out.println("La nota es Aprobado");
            case 7, 8 -> System.out.println("La nota es Notable");
            case 9, 10 -> System.out.println("La nota es Sobresaliente");
            default -> System.out.println("Nota no válida. Debe estar entre 0 y 10.");
        }

        entrada.close();
    }
}
