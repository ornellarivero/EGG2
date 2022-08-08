/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
la función equals() en Java.*/
package Ej7_Eureka;

import java.util.Scanner;

public class Ej7_Eureka {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Frase: ");
        String frase = leer.nextLine();
        boolean f = frase.equalsIgnoreCase("eureka");
        if (f) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
