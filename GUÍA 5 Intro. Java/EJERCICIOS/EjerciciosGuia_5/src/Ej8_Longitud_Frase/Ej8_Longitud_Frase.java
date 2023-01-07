/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el 
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java*/
package Ej8_Longitud_Frase;

import java.util.Scanner;

public class Ej8_Longitud_Frase {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String frase = leer.nextLine();
        System.out.println("introduzca frase: " + frase);
        boolean longitud=frase.length()<=8;
        if (longitud){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }  
}
