package services;

import entidades.Perro;
import java.util.Scanner;

public class PerroService extends Perro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {
        Perro p = new Perro();
        System.out.println("\nPERRO\n¨¨¨¨¨");
        System.out.print("Nombre: ");
        p.setNombre(leer.next());
        p.setAlimento("Carnívoro");
        System.out.print("Edad: ");
        p.setEdad(leer.nextInt());
        System.out.print("Raza: ");
        p.setRaza(leer.next());
        return p;
    }

    @Override
    public String alimentarse() {
        return "\n-El perro come balanceado.";
    }

}
