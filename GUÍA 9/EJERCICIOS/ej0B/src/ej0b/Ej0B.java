package ej0b;

import services.LoroService;
import services.PerroService;

public class Ej0B {

    public static void main(String[] args) {
        PerroService ps = new PerroService();
        LoroService ls = new LoroService();

        System.out.println(ps.crearPerro().toString());
        ps.juega();
        ps.ladra();
        System.out.println(ps.comeEnElDia());
        System.out.println(ls.crearLoro().toString());
        ls.baila();
        ls.hablar();
        ls.cantiSemillas();
    }
}
