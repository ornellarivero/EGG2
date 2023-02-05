package ej2aprendizaje;

import entidades.Electrodomestico;
import java.util.ArrayList;
import services.LavadoraService;
import services.TelevisorService;

public class Ej2Aprendizaje {

    public static void main(String[] args) {
        LavadoraService ls = new LavadoraService();
        TelevisorService ts = new TelevisorService();
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(ls.crearLavadora());
        electrodomesticos.add(ts.crearTV());

        float precio=0;
        for (Electrodomestico elect : electrodomesticos) {
            System.out.println("\nPrecio Final: " + elect.getClass().getSimpleName());
            precio = precio + elect.getPrecio();
            System.out.println(elect + "\n------------------");
        }
        System.out.println("SUMA PRECIO ELECTRODOMÉSTICOS: $"+precio);
    }
}
