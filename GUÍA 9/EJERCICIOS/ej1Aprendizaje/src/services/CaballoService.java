package services;

import entidades.Caballo;
import java.util.Scanner;

public class CaballoService extends Caballo{

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Caballo crearPerro() {
        Caballo c = new Caballo();
        System.out.println("\nCABALLO\n¨¨¨¨¨¨¨");
        System.out.print("Nombre: ");
        c.setNombre(leer.next());
        c.setAlimento("Pasto");
        System.out.print("Edad: ");
        c.setEdad(leer.nextInt());
        System.out.print("Raza: ");
        c.setRaza(leer.next());
        return c;
    }
    
    @Override
    public String alimentarse() {
        return "\n-El caballo come alfalfa.";
    }
    
}
