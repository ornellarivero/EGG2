/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Ej17_cantidadDigitos;

import java.util.Scanner;

public class CantidadDigitos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dimension = (int) (Math.random() * 21);
        String[] vector = new String[dimension];

        for (int i = 0; i < dimension - 1; i++) {
            int relleno = (int) (Math.random() * 1000000);
            String rellenoCadena = String.valueOf(relleno);
            vector[i] = rellenoCadena;
        }
        for (int i = 0; i < dimension - 1; i++) {
            System.out.print("["+vector[i]+"]");
        }
        System.out.println("\n");
        int contA = 0;
        int contB = 0;
        int contC = 0;
        int contD = 0;
        int contE = 0;
        int contF = 0;

        for (int i = 0; i < dimension - 1; i++) {
            int longitudNum = vector[i].length();
            switch (longitudNum) {
                case 1:
                    contA = contA + 1;
                    break;
                case 2:
                    contB = contB + 1;
                    break;
                case 3:
                    contC = contC + 1;
                    break;
                case 4:
                    contD = contD + 1;
                    break;
                case 5:
                    contE = contE + 1;
                    break;
                default:
                    contF = contF + 1;
            }
        }
        System.out.println("Num de 1 dígito: " + contA);
        System.out.println("Num de 2 dígitos: " + contB);
        System.out.println("Num de 3 dígitos: " + contC);
        System.out.println("Num de 4 dígitos: " + contD);
        System.out.println("Num de 5 dígitos: " + contE);
        System.out.println("Num de más de 5 dígitos: " + contF);
    }
}
