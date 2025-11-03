package ud1_fundamentos.serpiente;
import java.util.ArrayList;

public class SnakeRealTime {

    static volatile char tecla = 'd';  // Dirección inicial

    public static void main(String[] args) throws Exception {
        final int FILAS = 10, COLS = 20;
        char[][] tablero = new char[FILAS][COLS];
        int dirX = 0, dirY = 1;
        ArrayList<Integer> snakeX = new ArrayList<>();
        ArrayList<Integer> snakeY = new ArrayList<>();

        // Posición inicial
        snakeX.add(5);
        snakeY.add(5);

        // Comida inicial
        int comidaX = 3, comidaY = 10;
        boolean vivo = true;

        // Hilo para capturar teclas sin ENTER
        Thread inputThread = new Thread(() -> {
            try {
                while (true) {
                    int c = System.in.read();
                    if (c != -1) tecla = (char) c;
                }
            } catch (Exception e) {}
        });
        inputThread.setDaemon(true); // Finaliza al cerrar main
        inputThread.start();

        while (vivo) {
            // Cambiar dirección según tecla
            if (tecla == 'w') { dirX = -1; dirY = 0; }
            else if (tecla == 's') { dirX = 1; dirY = 0; }
            else if (tecla == 'a') { dirX = 0; dirY = -1; }
            else if (tecla == 'd') { dirX = 0; dirY = 1; }
            else if (tecla == 'q') break;

            // Limpiar tablero
            for (int i = 0; i < FILAS; i++)
                for (int j = 0; j < COLS; j++)
                    tablero[i][j] = '.';

            // Colocar comida
            tablero[comidaX][comidaY] = '*';

            // Colocar serpiente
            for (int i = 0; i < snakeX.size(); i++)
                tablero[snakeX.get(i)][snakeY.get(i)] = (i == 0) ? 'O' : 'o';

            // Dibujar tablero
            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLS; j++)
                    System.out.print(tablero[i][j]);
                System.out.println();
            }

            // Calcular nueva posición
            int nuevaX = snakeX.get(0) + dirX;
            int nuevaY = snakeY.get(0) + dirY;

            // Colisión con pared o consigo mismo
            if (nuevaX < 0 || nuevaX >= FILAS || nuevaY < 0 || nuevaY >= COLS) break;
            for (int i = 0; i < snakeX.size(); i++)
                if (snakeX.get(i) == nuevaX && snakeY.get(i) == nuevaY)
                    vivo = false;

            // Añadir nueva cabeza
            snakeX.add(0, nuevaX);
            snakeY.add(0, nuevaY);

            // Comer comida
            if (nuevaX == comidaX && nuevaY == comidaY) {
                comidaX = (int)(Math.random() * FILAS);
                comidaY = (int)(Math.random() * COLS);
            } else {
                // Quitar cola
                snakeX.remove(snakeX.size() - 1);
                snakeY.remove(snakeY.size() - 1);
            }

            Thread.sleep(150);
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        System.out.println("💀 ¡Has perdido!");
    }
}

