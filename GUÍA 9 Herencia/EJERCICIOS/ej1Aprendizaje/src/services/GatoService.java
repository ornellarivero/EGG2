package services;

import entidades.Gato;
import java.util.Scanner;

public class GatoService extends Gato {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Gato crearPerro() {
        Gato g = new Gato();
        System.out.println("\nGATO\n¨¨¨¨");
        System.out.print("Nombre: ");
        g.setNombre(leer.next());
        g.setAlimento("Galletas");
        System.out.print("Edad: ");
        g.setEdad(leer.nextInt());
        System.out.print("Raza: ");
        g.setRaza(leer.next());
        return g;
    }

    @Override
    public String alimentarse() {
        return "\n-El gato come atún.";
    }

}
