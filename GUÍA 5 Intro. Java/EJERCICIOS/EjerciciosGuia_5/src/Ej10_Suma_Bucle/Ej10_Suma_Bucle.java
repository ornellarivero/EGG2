/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
package Ej10_Suma_Bucle;

import java.util.Scanner;

public class Ej10_Suma_Bucle {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Valor límite:");
        int valor_limite = leer.nextInt();
        int sum = 0;
        while (sum < valor_limite) {
            System.out.println("Ingrese num:");
            int num = leer.nextInt();
            sum = sum + num;
            System.out.println("Resultado "+sum);
        }
    }
}
