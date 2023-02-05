/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes 
métodos: 
• Agregar un método de creación del objeto que respete la siguiente firma: 
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al 
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la 
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener 
en cuenta que para conocer la edad de la persona también se debe conocer la fecha 
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que 
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método 
anterior.

 */
package ej12_guia6;

import entidad.Persona;
import service.PersonaService;

public class Ej12_Guia6 {

    public static void main(String[] args) {
        PersonaService s = new PersonaService();
        Persona p1 = s.crearPersona();
        System.out.println("");
        Persona p2 = s.crearPersona();
        System.out.println("");

        System.out.println(p1.getNombre() + " tiene " + s.calcularEdad(p1) + " años.");
        System.out.println(p2.getNombre() + " tiene " + s.calcularEdad(p2) + " años.");
        System.out.println("");

        System.out.println(p1.getNombre() + " es menor que " + p2.getNombre() + "? " + s.menorQue(p1, p2));
        System.out.println("");

        s.mostrarPersona(p1);
        s.mostrarPersona(p2);

    }

}
