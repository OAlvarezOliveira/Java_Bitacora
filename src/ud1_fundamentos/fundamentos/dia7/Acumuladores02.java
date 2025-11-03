/**
 * 
 */
package ud1_fundamentos.fundamentos.dia7;


/**
Calcula el producto (multiplicación) de los números del 1 al 5.
 */
public class Acumuladores02 {


	public static void main(String[] args) {
		
		int producto;
		producto = 1;
		
		for (int i = 1; i <= 5; i++) {

			producto = producto * i;

	}
	
    System.out.println("la suma total es: "	 + producto);


}
	
}
