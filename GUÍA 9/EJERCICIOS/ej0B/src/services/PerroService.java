package services;

import entidades.Perro;
import interfaces.PerroInterface;

public class PerroService implements PerroInterface{

    @Override
    public Perro crearPerro() {
        Perro p=new Perro();
        p.setNombre("Luna");
        p.setRaza("Callejerita");
        p.setEdad("13 años");
        return p;
    }

    @Override
    public void juega() {
        System.out.println("A Luna le gusta correr.");
    }

    @Override
    public boolean ladra() {
        boolean ladra=true;
        System.out.println("Luna ladra?: "+ladra);
        return ladra;
    }
    
}
