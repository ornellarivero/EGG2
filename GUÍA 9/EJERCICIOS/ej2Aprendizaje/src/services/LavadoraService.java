package services;

import entidades.Lavadora;
import java.util.Scanner;

public class LavadoraService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Lavadora crearLavadora() {
        System.out.println("\nLAVADORA");
        Lavadora lav = new Lavadora();
        lav.crearElectr();
        lav.precioFinal();
        return lav;
    }

}
