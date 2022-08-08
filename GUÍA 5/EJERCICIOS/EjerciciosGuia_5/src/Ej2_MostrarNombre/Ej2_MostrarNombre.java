/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
pantalla*/
package Ej2_MostrarNombre;

import java.util.Scanner;

public class Ej2_MostrarNombre {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre= leer.nextLine();
        System.out.println("El nombre es: " + nombre);
    } 
}
