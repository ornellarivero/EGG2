/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del 
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el 
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break
 */
package Ej9B_El_cero_corta_bucle;

import java.util.Scanner;

public class ElCeroCortaBucle {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, cont=0;
        do {
            cont=cont+1;
            System.out.print("Ingrese "+cont+ "° num: ");
            num = leer.nextInt();
        } while (num != 0);
        System.out.println("El num es 0. Fin bucle.");
    }
}
