package services;

import entidades.Perro;

public class PerroService {

    public Perro crearPerro() {
        Perro p = new Perro();
        p.setNombre("Luna");
        p.setRaza("Callejerita");
        p.setEdad("13 años");
        p.setColor("Blanca manchas negras");
        return p;
    }
}
