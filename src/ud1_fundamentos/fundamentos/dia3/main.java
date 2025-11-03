package ud1_fundamentos.fundamentos.dia3;



public class main {
    public static void websearch (String[] args) {
        busqueda b = new busqueda();

        System.out.println("¿Contiene Selenium? " + b.buscarPalabra("Selenium"));
        System.out.println("¿Contiene Python? " + b.buscarPalabra("Python"));
    }
}
