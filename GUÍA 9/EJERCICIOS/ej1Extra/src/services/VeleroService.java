package services;

import entidades.Alquiler;
import entidades.Veleros;

public class VeleroService {

    public Veleros crearVelero() {
        Veleros v = c;
        Alquiler a=new Alquiler();
        v.crearBarco();
        float costoAlquiler = a.crearAlquiler(v) + v.getNumMastiles();
        System.out.println("\n-Alquiler para velero: $"+costoAlquiler);
        return v;
    }
}
