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


    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }




    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}

class Bono {
   public double calcularBono(Persona persona1) {
        double bono = 0;
        if (persona1.getEdad() > 50) {
            bono = persona1.getSalario() * 0.10;
        } else {
            bono = persona1.getSalario() * 0.05;
        }
        return bono;
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
