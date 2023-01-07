/*
 Métodos: 
• Agregar un método de creación del objeto que respete la siguiente forma: 
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
package service;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Date d = new Date(0, 0, 0);
        Persona p = new Persona(null, d);
        System.out.print("Nombre: ");
        String nombre = leer.next();
        String mayusc = nombre.substring(0, 1).toUpperCase();
        nombre = mayusc.concat(nombre.substring(1, nombre.length()));
        p.setNombre(nombre);

        System.out.println("Fecha de nacimiento.");
        System.out.print("Día: ");
        d.setDate(leer.nextInt());
        System.out.print("Mes: ");
        d.setMonth(leer.nextInt() - 1);
        System.out.print("Año: ");
        d.setYear(leer.nextInt() - 1900);

        return p;
    }

    public int calcularEdad(Persona p) {
        Date d = new Date();
        int mesActual = d.getMonth() + 1;
        int mesNac = p.getMesNacim() + 1;
        if ((d.getDate() >= p.getDiaNacim() & (mesActual == mesNac)) || (d.getDate() >= p.getDiaNacim() & mesActual > mesNac) || (d.getDate() <= p.getDiaNacim() & mesActual > mesNac)) {
            return (d.getYear()) - p.getAnioNacim();
        } else {
            return (d.getYear()) - p.getAnioNacim() - 1;
        }
    }

    public boolean menorQue(Persona p1, Persona p2){
        return calcularEdad(p1) < calcularEdad(p2); 
    }
    
    public void mostrarPersona(Persona p1){
        System.out.println(p1.toString()); 
    }
    
    
    
}
