/*
 Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que 
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una 
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de 
la matriz M en la cual empieza el primer elemento de la submatriz P.

CORREGIR
 */
package Ej21_Matriz_dentro_de_otra;

public class MatrizDentroDeOtra {

    public static void main(String[] args) {

        int[][] m = new int[6][6];
        int[][] p = new int[3][3];

        System.out.println("RELLENO MATRIZ 'M'");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                //System.out.print("F" + i + ".");
                m[i][j] = (int) (Math.random() * 2);
                //System.out.print("C" + j + "=" + "[" + m[i][j] + "] ");
                System.out.print(m[i][j] + "  ");
            }
            System.out.println(" ");
        }

        System.out.println("\n");

        System.out.println("RELLENO MATRIZ 'P'");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //System.out.print("F" + i + ".");
                p[i][j] = (int) (Math.random() * 2);
                //System.out.print("C" + j + "=" + "[" + p[i][j] + "] ");
                System.out.print(p[i][j] + "  ");
            }
            System.out.println(" ");
        }

        int cont = 0;
        int x = 0;
        int y = 0;
        boolean b = false;

        System.out.println("\nBUSCANDO...");

        while (!b) {
            //Fila 1
            for (int i = x; i < 3; i++) {
                if (m[y][i] == p[y][i]) {
                    cont++;
                }
                //System.out.println("\nHay " + cont + " coincidencias.");
                System.out.print("M." + m[y][i] + "  ");
                System.out.print("P." + p[y][i] + "  ");
            }
            System.out.println("\n");
            y++;
            //Fila 2
            for (int i = x; i < 3; i++) {
                if (m[y][i] == p[y][i]) {
                    cont++;
                }
                //System.out.println("\nHay " + cont + " coincidencias.");
                System.out.print("M." + m[y][i] + "  ");
                System.out.print("P." + p[y][i] + "  ");
            }
            System.out.println("\n");
            y++;
            //Fila 3
            for (int i = x; i < 3; i++) {
                if (m[y][i] == p[y][i]) {
                    cont++;
                }
                //System.out.println("\nHay " + cont + " coincidencias.");
                System.out.print("M." + m[y][i] + "  ");
                System.out.print("P." + p[y][i] + "  ");
            }
            b = true;
            //RESULTADO
            if (cont == 9) {
                System.err.println("\nSe encontró");
                
            }
            System.out.println("\n-----------------------------");
                       
            
            
        }

        /*if (cont == 9) {
        System.out.println("\ncoincidencias");
        } else {
        System.out.println("\nninguna coincidencia");
        }*/
    }
}
