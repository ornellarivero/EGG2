package services;

import entidades.Gato;

public class GatoService {

    public Gato crearGato() {
        Gato g = new Gato();
        g.setNombre("Mamau");
        g.setColor("negro");
        g.setEdad("1 año");
        g.setRaza("Bengala");
        return g;
    }
}
