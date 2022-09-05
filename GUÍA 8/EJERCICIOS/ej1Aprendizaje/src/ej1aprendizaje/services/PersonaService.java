package ej1aprendizaje.services;

import ej1aprendizaje.entidades.Perro;
import ej1aprendizaje.entidades.Persona;
import java.util.Scanner;

public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona(Perro perro) {
        Persona p = new Persona();
        System.out.print("\nNombre dueño/a: ");
        p.setNombre(leer.next().toUpperCase());

        System.out.print("Apellido: ");
        p.setApellido(leer.next().toUpperCase());

        System.out.print("Edad: ");
        p.setEdad(leer.nextInt());

        System.out.print("DNI: ");
        p.setDocumento(leer.nextInt());

        p.setPerro(perro);

        System.out.println("\n" + p.toString() + "\n-----------------------------------------------------------------------");

        return p;
    }
}
