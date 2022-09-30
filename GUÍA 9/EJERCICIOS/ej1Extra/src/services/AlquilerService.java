package services;

import entidades.Alquiler;
import entidades.Barco;

public class AlquilerService {

    public static float crearAlquiler(Barco b) {
        Alquiler a = new Alquiler();
        return a.crearAlquiler(b);
    }

}
