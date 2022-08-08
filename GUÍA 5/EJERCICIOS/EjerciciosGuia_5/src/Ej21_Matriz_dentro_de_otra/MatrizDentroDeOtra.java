/*
 Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que 
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una 
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de 
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package Ej21_Matriz_dentro_de_otra;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizDentroDeOtra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] m = new int[6][6];
        int[][] p = new int[3][3];

        

        System.out.println("M");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("F" + i + ".");
                m[i][j] = (int) (Math.random() * 11);
                System.out.print("C" + j + "=" + "[" + m[i][j] + "] ");
            }
            System.out.println(" ");
        }

        System.out.println("\n");

        System.out.println("P");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("F" + i + ".");
                p[i][j] = (int) (Math.random() * 11);
                System.out.print("C" + j + "=" + "[" + p[i][j] + "] ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ( (m[i][j] == p[0][0]) & (m[i][j+1] == p[0][1]) & (m[i][j+2] == p[0][2]) & (m[i+1][j] == p[1][0]) & (m[i+1][j+1] == p[1][1]) & (m[i + 1][j + 2] == p[1][2])&(m[i + 2][j] == p[2][0]) & (m[i + 2][j + 1] == p[2][1])&(m[i + 2][j + 2] == p[2][2]) )
                {
                System.out.println("La tabla grande contiene a la chica");
            }else{
                    System.out.println("No contiene");
                }

        }
    }

    

    }
}
