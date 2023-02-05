package services;

import entidades.Televisor;
import java.util.Scanner;

public class TelevisorService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Televisor crearTV() {
        System.out.println("\nTELEVISOR");
        Televisor tv = new Televisor();
        tv.crearElectr();
        tv.precioFinal();
        return tv;
    }

}
