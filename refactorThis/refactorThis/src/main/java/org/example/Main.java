package org.example;

class A {
    static String nombre = "SinNombre";
    static int edad = 0;
    static double salario = 0.0;

    static void datos(String n, int e, double s) {
        nombre = n;
        edad = e;
        salario = s;
    }

    static void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}

class B {
    void calcularBono() {
        double bono = 0;
        if (A.edad > 50) {
            bono = A.salario * 0.10;
        } else {
            bono = A.salario * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}
/**
 * Clase Saludar, verifica si es mayor de edad y devuelve un saludo especifíco
 */
class Saludo {
    /**
     * @param persona1 que es un objeto de tipo Persona
     */
    void imprimirSaludo(Persona persona1) {
        if (persona1.edad < 18) {
            System.out.println("Hola, joven " + persona1.getNombre());
        } else {
            System.out.println("Hola, señor/a " + persona1.getNombre());
        }
    }
}
/**
 * Clase de prueba para ejecutar el programa
 */

public class Main {

    public static void main(String[] args) {
        Persona persona2=new Persona("Juan Perez", 45, 50000);
        persona2.mostrar();
    
        Bono bono = new Bono();
        System.out.println("Bono: "+bono.calcularBono(persona2));
        Saludar saludo = new Saludar();
        saludo.imprimirSaludo(persona2);
    }
}
