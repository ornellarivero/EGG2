package services;

import entidades.Yates;

public class YateService {

    public Yates crearVelero() {
        Yates y = new Yates();
        y.crearBarco();
        float costoAlquiler = AlquilerService.crearAlquiler(y) + y.getPotenciaCV() + y.getCantCamarotes();
        System.out.println("\n-Alquiler para yates: $" + costoAlquiler);
        return y;
    }
}
