package ud1_fundamentos.fundamentos.dia9;
import java.util.Scanner;

/**
Pide un número entero al usuario y muestra:
Si es múltiplo de 3 y de 5 a la vez → “Es múltiplo de 3 y 5”
Si es múltiplo de solo uno de ellos → “Es múltiplo de 3” o “Es múltiplo de 5”
Si no es múltiplo de ninguno → “No es múltiplo de 3 ni de 5”.
 */
public class MúltiplosCombinados {

    public static void main(String[] args) {

        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el numero a validar si es multiplo de 3 y/o 5: ");
        num = entrada.nextInt();

       
        if(num % 3 == 0 && num % 5 == 0  ) {System.out.println("Es múltiplo de 3 y 5");}
        
        else if(num % 3 == 0 && num % 5 != 0  ) {System.out.println("Es múltiplo de 3");}

        else if(num % 3 != 0 && num % 5 == 0  ) {System.out.println("Es múltiplo de 5");}
        
        else {System.out.println("No es múltiplo de 3 ni 5");}


        entrada.close();
    }
}
