package ej6_extras;

import entidad.Ahorcado;
import service.AhorcadoService;

public class Ej6_extras {

    public static void main(String[] args) {
        AhorcadoService s = new AhorcadoService();
        Ahorcado a = new Ahorcado();
        s.crearJuego(a);
    }

}
