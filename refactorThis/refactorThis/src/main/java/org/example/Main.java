package org.example;
/**
 * Clase Persona con sus atributos de nombre,salario y edad
 */
class Persona {
    private String nombre = "SinNombre";
    private int edad = 0;
    private double salario = 0.0;

    public void datos(String n, int e, double s) {
        this.nombre = n;
        this.edad = e;
        this.salario = s;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}

class B {
    void calcularBono() {
        double bono = 0;
        if (Persona.edad > 50) {
            bono = Persona.salario * 0.10;
        } else {
            bono = Persona.salario * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}

class C {
    void imprimirSaludo() {
        if (Persona.edad < 18) {
            System.out.println("Hola, joven " + A.nombre);
        } else {
            System.out.println("Hola, señor/a " + A.nombre);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Persona.datos("Juan Perez", 45, 50000);
        Persona.mostrar();
        B b = new B();
        b.calcularBono();
        C c = new C();
        c.imprimirSaludo();
    }
}
