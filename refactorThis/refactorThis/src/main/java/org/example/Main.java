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

class Saludo {
    void imprimirSaludo(Persona persona1) {
        if (persona1.edad < 18) {
            System.out.println("Hola, joven " + persona1.getNombre());
        } else {
            System.out.println("Hola, señor/a " + persona1.getNombre());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A.datos("Juan Perez", 45, 50000);
        A.mostrar();
        B b = new B();
        b.calcularBono();
        C c = new C();
        c.imprimirSaludo();
    }
}
