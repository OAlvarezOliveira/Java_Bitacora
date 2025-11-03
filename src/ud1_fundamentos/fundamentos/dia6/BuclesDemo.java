package ud1_fundamentos.fundamentos.dia6;

public class BuclesDemo {

    public static void main(String[] args) {

        // for clásico
        for (int i = 1; i <= 3; i++) {
            System.out.println("for → número " + i);
        }

        // while
        int j = 1;
        while (j <= 3) {
            System.out.println("while → número " + j);
            j++;
        }

        // do-while
        int k = 1;
        do {
            System.out.println("do-while → número " + k);
            k++;
        } while (k <= 3);

        // for-each
        String[] nombres = {"Selenium", "Java", "TestNG"};
        for (String nombre : nombres) {
            System.out.println("for-each → " + nombre);
        }
    }
}
