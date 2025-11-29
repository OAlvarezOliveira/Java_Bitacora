package ud1_fundamentos.examen2.repaso.dia1;

/*
 EJERCICIO 9: Factura con columnas alineadas
Enunciado:
Crea un programa que muestre una factura de 4 productos con columnas alineadas.
Salida esperada:
========== FACTURA ==========
Producto              Cant.  Precio   Total
---------------------------------------------
Teclado mecánico         2   45,99   91,98
Ratón inalámbrico        1   29,99   29,99
Monitor 27"              1  299,99  299,99
Cable HDMI               3    8,50   25,50
---------------------------------------------
                              TOTAL: 447,46 €
Requisitos:

Producto: alineado a la izquierda, ancho 20 caracteres
Cantidad: alineado a la derecha, ancho 5
Precio: 2 decimales, ancho 8
Total: 2 decimales, ancho 8
 * */







public class Ejercicio09 {

	public static void main(String[] args) {

		// Producto 1
		String prod1 = "Teclado mecánico";
		int cant1 = 2;
		double precio1 = 45.99;

		// Producto 2
		String prod2 = "Ratón inalámbrico";
		int cant2 = 1;
		double precio2 = 29.99;

		// Producto 3
		String prod3 = "Monitor 27\""; // \" para escapar comillas
		int cant3 = 1;
		double precio3 = 299.99;

		// Producto 4
		String prod4 = "Cable HDMI";
		int cant4 = 3;
		double precio4 = 8.50;

		// CÁLCULOS
		double total1 = precio1 * cant1;
		double total2 = precio2 * cant2;
		double total3 = precio3 * cant3;
		double total4 = precio4 * cant4;

		double subtotal = total1 + total2 + total3 + total4;

		// SALIDA - Cabecera
        System.out.printf("========== FACTURA ==========%n");
        System.out.printf("%-20s %5s %8s %8s%n", "Producto", "Cant.", "Precio", "Total");
        System.out.printf("---------------------------------------------%n");
        System.out.printf("%-20s %5d %8.2f %8.2f%n", prod1, cant1, precio1, total1);
        System.out.printf("%-20s %5d %8.2f %8.2f%n", prod2, cant2, precio2, total2);
        System.out.printf("%-20s %5d %8.2f %8.2f%n", prod3, cant3, precio3, total3);
        System.out.printf("%-20s %5d %8.2f %8.2f%n", prod4, cant4, precio4, total4);
        System.out.printf("---------------------------------------------%n");
        System.out.printf("%38s %.2f €%n", "TOTAL:",subtotal,"€");






	}
}
