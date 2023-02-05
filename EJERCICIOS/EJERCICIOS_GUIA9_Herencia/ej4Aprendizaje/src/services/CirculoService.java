package services;

import entidades.Circulo;
import entidades.Forma;
import interfaces.calculosFormas;
import java.util.Scanner;

public class CirculoService implements calculosFormas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Forma c = new Circulo();

    public Forma crearCirculo(Forma c) {
        System.out.print("Ingrese Radio: ");
        c.setRadio(leer.nextFloat());
        return c;
    }

    @Override
    public void area(Forma c) {
        c.setArea((float) (PI * Math.pow(c.getRadio(), 2)));
        System.out.println("-Area Círculo= " + c.getArea());
    }

    @Override
    public void perimetro(Forma c) {
        System.out.println("-Perímetro Círculo= " + (PI * (2 * c.getRadio())));
    }
}
