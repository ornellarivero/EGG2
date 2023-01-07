/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*     *
*     *
* * * *

 */
package Ej13_cuadrados_asteriscos;

import java.util.Scanner;

public class CuadradosAsteriscos {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int numAzar=(int)(Math.random()*6);
        
        for (int f = 0; f < numAzar; f++) {
            for (int c = 0; c < numAzar; c++) {
                if((f==0 || c==0)||(f==numAzar-1 || c==numAzar-1)){
                    System.out.print("* ");
            }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
}
