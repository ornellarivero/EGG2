package ej1aprendizaje.services;

import ej1aprendizaje.entidades.Perro;
import java.util.Scanner;

public class PerroService {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public Perro crearPerro(){
        Perro p=new Perro();
        System.out.print("Nombre de tu perro/a: ");
        p.setNombre(leer.next().toUpperCase());
        
        System.out.print("Raza: ");
        p.setRaza(leer.next().toUpperCase());
        
        System.out.print("Edad: ");
        p.setEdad(leer.nextInt());
        
        System.out.print("Tamaño: ");
        p.setTamanio(leer.next().toUpperCase());
        
        return p;
    }
}
