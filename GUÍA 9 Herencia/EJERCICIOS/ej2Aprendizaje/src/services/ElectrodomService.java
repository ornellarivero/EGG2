package services;

import java.util.Scanner;

public class ElectrodomService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String comprobarConsumoEnergetico() {
        System.out.print("-Ingrese consumo A-F: ");
        String consumo = leer.next().toUpperCase();
        switch (consumo) {
            case "A":
            case "B":
            case "C":
            case "D":
            case "E":
            case "F":
                return consumo;
            default:
                return "F";
        }
    }

    public String comprobarColor() {
        System.out.println("-Ingrese color:\n(A).BLANCO\n(B).NEGRO\n(C).ROJO\n(D).AZUL\n(E).GRIS");
        String letra = leer.next().toUpperCase();
        switch (letra) {
            case "A":
                letra="BLANCO";
            case "B":
                letra="NEGRO";
            case "C":
                letra="ROJO";
            case "D":
                letra="AZUL";
            case "E":
                letra="GRIS";
                return letra;
            default:
                return "BLANCO";
        }
    }
}
