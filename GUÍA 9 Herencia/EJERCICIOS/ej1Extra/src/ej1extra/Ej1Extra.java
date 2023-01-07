package ej1extra;

import services.BarcoMotorService;
import services.VeleroService;
import services.YateService;

public class Ej1Extra {

    public static void main(String[] args) {
        VeleroService vs = new VeleroService();
        BarcoMotorService bms = new BarcoMotorService();
        YateService y = new YateService();

        System.out.println(vs.crearVelero());
    }

}
