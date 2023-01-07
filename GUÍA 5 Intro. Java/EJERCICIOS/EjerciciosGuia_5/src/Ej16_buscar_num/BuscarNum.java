/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido
 */
package Ej16_buscar_num;

import java.util.Scanner;

public class BuscarNum {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dimension = (int) (Math.random() * 7);
        int[] vector = new int[dimension];
        for (int i = 0; i < dimension - 1; i++) {
            int numAleatorio = (int) (Math.random() * 7);
            vector[i] = numAleatorio;
        }
        for (int i = 0; i < dimension - 1; i++) {
            System.out.println(vector[i] + ", ");
        }
        System.out.print("Buscar num: ");
        int buscarNum = leer.nextInt();
        int cont = 0;
        for (int i = 0; i < dimension - 1; i++) {
            if (vector[i] == buscarNum) {
                System.out.println("El num " + buscarNum + " está en la posición " + i);
                cont = cont + 1;
            }
        }
        if (cont > 0) {
            System.out.println("El num buscado se repite " + cont + " veces.");
        } else {
            System.out.println("El num buscado no se encuentra");
        }
    }
}
