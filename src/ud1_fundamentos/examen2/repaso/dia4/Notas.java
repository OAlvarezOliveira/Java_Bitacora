package ud1_fundamentos.examen2.repaso.dia4;

import java.util.Scanner;

/*
 Ejercicio: Estadísticas de notas con validación
Pide al usuario cuántos alumnos hay en clase (entre 5 y 30). Si no está en ese rango, muestra "Error: número de alumnos inválido" y termina.
Si es válido, lee las notas de cada alumno (0-10). Si una nota está fuera de rango, muestra "Nota inválida, introduce otra" y pide de nuevo la nota de ese mismo alumno sin avanzar al siguiente.
Al final muestra:

Número de aprobados (nota >= 5)
Número de suspensos (nota < 5)
Nota media de la clase (con 2 decimales)

Ejemplo de ejecución:
¿Cuántos alumnos hay? 3
Nota del alumno 1: 7.5
Nota del alumno 2: 12
Nota inválida, introduce otra
Nota del alumno 2: 4.0
Nota del alumno 3: 8.0

Aprobados: 2
Suspensos: 1
Nota media: 6.50
 * */

public class Notas {

	public static void main(String[] args) {

		// Declaracion Variables
		int cantAlumnos;
		int numeroAprobados;
		int numeroSuspensos;
		double nota;
		double sumaNotas;
		double notaMediaClase;
		String mensajeErrorCantAlumnos;
		String mensajeErrorValorNotas;
		Scanner entrada;

		// Inicializacion Varables
		mensajeErrorCantAlumnos = "Error: número de alumnos inválido";
		mensajeErrorValorNotas = "Nota inválida, introduce otra";
		numeroAprobados = 0;
		numeroSuspensos = 0;
		sumaNotas = 0;
		nota = -1;

		entrada = new Scanner(System.in);

		// Entrada de datos
		System.out.printf("¿Cuántos alumnos hay? %n");
		cantAlumnos = entrada.nextInt();

		// Operativa

		if (cantAlumnos >= 5 && cantAlumnos <= 30) {

			for (int i = 1; i <= cantAlumnos; i++) {
				System.out.printf("Nota del alumno %d: ", i);
				nota = entrada.nextDouble();

				// pide y valida notas
				while (nota < 0 || nota > 10) {
					System.out.printf("%s%n", mensajeErrorValorNotas);
					System.out.printf("Nota del alumno %d: ", i);
					nota = entrada.nextDouble();
				} // Fin While Notas Alumnos

				// Calculos con notas
					// Número de aprobados (nota >= 5) vs Número de suspensos (nota < 5)
					if (nota >= 5) {
						numeroAprobados++;
					} else {
						numeroSuspensos++;
					}
					// acumula media de la clase
					sumaNotas += nota;

			} 
			
			// Salida datos

			// Número de aprobados (nota >= 5)
			System.out.printf("%s%d %n", "Aprobados:", numeroAprobados);

			// Número de suspensos (nota < 5)
			System.out.printf("%s%d %n", "Suspensos:", numeroSuspensos);

			// Nota media de la clase (con 2 decimales)
			notaMediaClase = sumaNotas / cantAlumnos;
			System.out.printf("%s %2f %n", "Nota media:", notaMediaClase);

		} 
		else {

			System.out.printf("%s %n", mensajeErrorCantAlumnos);

		}

		entrada.close();
	}

}
