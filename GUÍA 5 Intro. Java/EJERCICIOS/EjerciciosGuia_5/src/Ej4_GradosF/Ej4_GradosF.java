/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)*/
package Ej4_GradosF;

import java.util.Scanner;

public class Ej4_GradosF {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Grados C°: ");
        double gradosC=leer.nextFloat();
        double gradosF=32+(9*gradosC/5);
        System.out.println("Grados F°: " + gradosF);
    }
}
