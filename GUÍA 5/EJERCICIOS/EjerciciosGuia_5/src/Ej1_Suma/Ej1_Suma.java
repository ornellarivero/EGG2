/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma*/
package Ej1_Suma;

import java.util.Scanner;

public class Ej1_Suma {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Num1: ");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese Num2: ");
        int num2 = leer.nextInt();
        int suma = num1 + num2;

        System.out.println(num1 + " + " + num2 + "= " + suma);
    }
}
