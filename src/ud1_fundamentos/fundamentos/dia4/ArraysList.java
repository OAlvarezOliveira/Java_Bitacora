package ud1_fundamentos.fundamentos.dia4;


import java.util.ArrayList;

public class ArraysList {

	public static void main(String[] args) {
		
		ArrayList<String> tests = new ArrayList<>();

        tests.add("Login Test");
        tests.add("Search Product");
        tests.add("Checkout");

        for (String t : tests) {
            System.out.println("Ejecutando: " + t);
        }
    }
}
