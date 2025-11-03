package ud1_fundamentos.fundamentos.dia5;

//Clase Persona
public class Persona {
 String nombre;
 int edad;

 // Constructor
 public Persona(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
 }

 // Método
 public void saludar() {
     System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
 }
}
