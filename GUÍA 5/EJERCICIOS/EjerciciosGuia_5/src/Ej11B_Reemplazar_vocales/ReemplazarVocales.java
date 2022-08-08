/*Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada 
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se 
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las 
vocales acentuadas) se mantienen sin cambios*/
package Ej11B_Reemplazar_vocales;

import java.util.Scanner;

public class ReemplazarVocales {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Frase: ");
        String frase = leer.nextLine();
        reemplazar(frase);
    }

    public static void reemplazar(String frase) {
        if ((frase.endsWith("."))) {
            System.out.println(frase.toLowerCase().replace("a", "@").replace("e", "#").replace("i", "$").replace("o", "%").replace("u", "*"));
        } else {
            System.out.println("La frase debe finalizar con punto (<.>)");
        }
    }
}
