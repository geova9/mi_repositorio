package org.example;
/**
 * Clase Persona con sus atributos de nombre,salario y edad
 */
class Persona {
    private String nombre = "SinNombre";
    private int edad = 0;
    private double salario = 0.0;
/**
 * Constructor de la clase Persona
 * @param nombre Nombre de la persona
 * @param edad Edad de la persona
 * @param salario Salario de la persona
 */
    public void datos(String n, int e, double s) {
        this.nombre = n;
        this.edad = e;
        this.salario = s;
    }


   //Metodos Getters and Setters 

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


/**
 * Muestra todos los datos de la persona
 */

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}
/**
 * Calcula el bono basado en la edad del persona
 * @param persona1 Objeto de tipo Persona
 * @return Monto del bono
 */

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
            System.out.println("Hola, señor/a " + persona1.getNombre();
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
