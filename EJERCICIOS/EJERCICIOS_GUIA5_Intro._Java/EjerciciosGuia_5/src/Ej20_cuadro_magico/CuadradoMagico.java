/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9.
 */
package Ej20_cuadro_magico;

import java.util.Scanner;

public class CuadradoMagico {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Num. <1-9>");
                int num = leer.nextInt();
                while ((num < 1) || (num > 9)) {
                    System.out.println("fuera de rango, vuelva a ingresar el num...");
                    num = leer.nextInt();
                    matriz[i][j] = num;
                }
                matriz[i][j] = num;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }
        
        int sumaF=0;
        for (int f = 0; f < 3; f++) {
            sumaF=sumaF+matriz[0][f];
        }
        int sumaC=0;
        for (int c = 0; c < 3; c++) {
            sumaC=sumaC+matriz[c][0];
        }
        int sumaDiagPosi=0;
        for (int d = 0; d < 3; d++) {
            sumaDiagPosi=sumaDiagPosi+matriz[d][d];
        }
        int sumaDiagNeg=0;
        int col=2;
        for (int f = 0; f < 3; f++) {
            sumaDiagNeg=sumaDiagNeg+matriz[col][f];
            col=col-1;
        }
        int sumaCuadrado=sumaF+sumaC+sumaDiagPosi+sumaDiagNeg;
     
        if(sumaCuadrado==60){
            System.out.println("Cuadro magico");
        }else if(sumaCuadrado!=60){
            System.out.println("No es un cuadrado magico");
        }
            
        System.out.println("suma Fila: " + sumaF);
        System.out.println("suma columna: " + sumaC);
        System.out.println("suma diagonal positiva: " + sumaDiagPosi);
        System.out.println("suma diagonal negativa: " + sumaDiagNeg);
        
    }
}
