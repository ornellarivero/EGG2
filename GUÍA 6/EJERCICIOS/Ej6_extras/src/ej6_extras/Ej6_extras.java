package ej6_extras;

import entidad.Ahorcado;
import java.util.Arrays;
import service.AhorcadoService;

public class Ej6_extras {

    public static void main(String[] args) {
        AhorcadoService s = new AhorcadoService();
        Ahorcado a = s.crearJuego();
//        System.out.println(a.toString());

        s.longitud(a);
        System.out.println("");
        s.buscar(a);

    }

}
