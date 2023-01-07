package services;

import entidades.Forma;
import entidades.Rectangulo;
import interfaces.calculosFormas;
import java.util.Scanner;

public class RectanguloService implements calculosFormas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Forma r = new Rectangulo();

    public Forma crearRectangulo(Forma r) {
        System.out.print("Ingrese Base: ");
        r.setBase(leer.nextFloat());

        System.out.print("Ingrese Altura: ");
        r.setAltura(leer.nextFloat());
        return r;
    }

    @Override
    public void area(Forma r) {
        r.setArea(r.getBase() * r.getAltura());
        System.out.println("-Area Rectangulo= " + r.getArea());
    }

    @Override
    public void perimetro(Forma r) {
        System.out.println("-Perímetro Rectangulo= " + (r.getBase() + r.getAltura()) * 2);
    }
}
