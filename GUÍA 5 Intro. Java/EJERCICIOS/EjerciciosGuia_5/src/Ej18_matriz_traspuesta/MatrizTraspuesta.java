/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
cambiando sus filas por columnas (o viceversa).
 */
package Ej18_matriz_traspuesta;

import java.util.Scanner;

public class MatrizTraspuesta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz=new int[4][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=(int)(Math.random()*21);
            }
        }
        System.out.println("MATRIZ A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]"); 
            }
            System.out.println(" ");
        }
        System.out.println("\n");
         System.out.println("MATRIZ B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[j][i]+"]"); 
            }
            System.out.println(" ");
        }
    }
}
