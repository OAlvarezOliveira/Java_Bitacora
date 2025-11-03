package ud1_fundamentos.fundamentos.dia3;

public class busqueda {

    // Método que busca una palabra en un "sistema simulado"
    public boolean buscarPalabra(String palabra) {
        String[] baseDatos = {"Selenium", "Java", "JUnit", "TestNG"};

        for (String item : baseDatos) {
            if (item.equalsIgnoreCase(palabra)) {
                return true; // encontrada
            }
        }
        return false; // no encontrada
    }
}

