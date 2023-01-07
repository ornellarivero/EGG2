/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList.*/
package service;

import java.util.ArrayList;
import java.util.Scanner;

public class PerroService {

    Scanner leer;
    ArrayList<String> razas;

    public PerroService() {
        this.razas = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearPerro() {
        String sn;
        do {
            System.out.print("Nombre: ");
            String nombre = leer.next();

            System.out.print("Raza: ");
            String raza = leer.next();

            razas.add("Nombre: " + nombre + ", Raza: " + raza+" / ");
            
            System.out.println("Desea agregar otro perro? S/N");
            sn = leer.next().toUpperCase();
        } while (sn.equals("S"));

        System.out.println("Razas de perros en la lista: ");
        for (String perro : razas) {
            System.out.print(perro);
        }
    }

    
    
}
