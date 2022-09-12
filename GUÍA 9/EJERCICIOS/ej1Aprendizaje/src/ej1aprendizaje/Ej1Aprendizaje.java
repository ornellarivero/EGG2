package ej1aprendizaje;

import services.CaballoService;
import services.GatoService;
import services.PerroService;

public class Ej1Aprendizaje {

    public static void main(String[] args) {
        PerroService ps = new PerroService();
        GatoService gs = new GatoService();
        CaballoService cs = new CaballoService();

        System.out.println(ps.crearPerro().toString() + ps.alimentarse());

        System.out.println(gs.crearPerro().toString() + gs.alimentarse());

        System.out.println(cs.crearPerro().toString() + cs.alimentarse());

    }

}
