/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
package Ej3_Mayus_Minus;

import java.util.Scanner;

public class Ej3_Mayus_Minus {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Escribir frase: ");
        String frase = leer.nextLine();
        String mayus = frase.toUpperCase();
        String minus = frase.toLowerCase();
        System.out.println("Frase MAYUS: " + mayus);
        System.out.println("Frase minus: " + minus);
    }
}
