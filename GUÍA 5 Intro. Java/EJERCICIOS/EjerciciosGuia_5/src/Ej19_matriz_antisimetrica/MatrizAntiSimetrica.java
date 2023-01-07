/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Ej19_matriz_antisimetrica;

import java.util.Scanner;

public class MatrizAntiSimetrica {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
            System.out.println(" ");
        }
        System.out.println("Matriz A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println("\n");
        System.out.println("Matriz B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println(" ");
        }
        
        int contA = 0;
        int contB = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == (matriz[j][i])*-1) {
                    contA = contA + 1;
                } else {
                    contB = contB + 1;
                }
            }
        }
        System.out.println("\n");
        
        if (contA == 9) {
            System.out.println("Matriz Anti Simétrica");
        } else {
            System.out.println("No es Anti Simétrica");
        }
    }
}
