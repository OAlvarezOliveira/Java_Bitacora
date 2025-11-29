package ud1_fundamentos.examen2.repaso.dia1;

/*
 EJERCICIO 11: Estadísticas de clase con porcentajes

**Enunciado:**
Tienes los resultados de un examen de 20 alumnos. Muestra estadísticas con porcentajes.

**Salida esperada:**
```
====== ESTADÍSTICAS EXAMEN ======
Aprobados:     15 (75,00%)
Suspensos:      5 (25,00%)
---------------------------------
Sobresalientes: 3 (15,00%)
Notables:       7 (35,00%)
Aprobados:      5 (25,00%)
Suspensos:      5 (25,00%)
---------------------------------
Total alumnos: 20 
 */

public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        // DATOS DEL EXAMEN
        final int TOTAL_ALUMNOS = 20;
        int sobresalientes = 3;
        int notables = 7;
        int aprobados = 5;
        int suspensos = 5;
        
        // CÁLCULOS
        int totalAprobados = sobresalientes + notables + aprobados;
        
        double porcAprobados = (totalAprobados * 100.0) / TOTAL_ALUMNOS;
        double porcSuspensos = (suspensos * 100.0) / TOTAL_ALUMNOS;
        double porcSobresalientes = (sobresalientes * 100.0) / TOTAL_ALUMNOS;
        double porcNotables = (notables * 100.0) / TOTAL_ALUMNOS;
        double porcAprobadosJusto = (aprobados * 100.0) / TOTAL_ALUMNOS;
        
        // SALIDA
        System.out.printf("====== ESTADÍSTICAS EXAMEN ======%n");
        System.out.printf("%-15s %2d (%4.2f%%)%n","Aprobados:",totalAprobados,porcAprobados);
        System.out.printf("%-15s %2d (%4.2f%%)%n","Suspensos:",suspensos,porcSuspensos);
        System.out.printf("---------------------------------%n");
        System.out.printf("%-15s %2d (%4.2f%%)%n","Sobresalientes:",sobresalientes,porcSobresalientes);
        System.out.printf("%-15s %2d (%4.2f%%)%n","Notables:",notables,porcNotables);
        System.out.printf("%-15s %2d (%4.2f%%)%n","Aprobados:",aprobados,porcAprobadosJusto);
        System.out.printf("%-15s %2d (%4.2f%%)%n","Suspensos:",suspensos,porcSuspensos);
        System.out.printf("---------------------------------%n");
        System.out.printf("%-14s %2d %n","Total alumnos:",TOTAL_ALUMNOS);

    }
    
}