/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().s*/
package Ej5_Doble_Triple_RCuadrada;;

import java.util.Scanner;

public class Ej5_Doble_Triple_RCuadrada {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese num: ");
        int num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 2*2;
        int r_cuadrada = (int) Math.sqrt(num);//Raíz cuadrada
        System.out.println("El doble de " +num+ " es: " + doble);
        System.out.println("El triple de " +num+ " es: " + triple);
        System.out.println("R. Cuadrada de " +num +" es: " + r_cuadrada);
    }
}
