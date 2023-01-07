/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente.
 */
package Ej15_vector_cien_primeros;

import java.util.Scanner;

public class RellenarVector {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector=new int[101];
        int cont=100;
        for (int i = 100; i > 0; i--) {
            vector[i]=cont;
            cont=cont-1;
        }
        for (int i = 100; i > 0; i--) {
            System.out.print(vector[i] + ", ");
        }
       
    }
    
}
