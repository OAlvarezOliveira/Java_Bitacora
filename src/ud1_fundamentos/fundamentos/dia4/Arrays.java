package ud1_fundamentos.fundamentos.dia4;

public class Arrays {

	public static void main(String[] args) {

		String[] lenguajes = {"Java", "Python", "C#"};
		System.out.println(lenguajes[0]); // Imprime "Java"
		
		for (int i = 0; i < lenguajes.length; i++) {
		    System.out.println("Lenguaje: " + lenguajes[i]);
		}
		
		for (String l : lenguajes) {
		    System.out.println("Lenguaje: " + l);
		}

	}

}
