/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package Ej10B_num_asteriscos;

public class NumAsteriscos {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            int numAzar = (int) (Math.random() * 21);
            System.out.print(numAzar);
            for (int j = 0; j < numAzar; j++) {
                System.out.print(" *");
            }
            System.out.println("\n");
        }
    }

}
