/*Crear un programa que dado un numero determine si es par o impar*/
package Ej6_Par_Impar;;

import java.util.Scanner;

public class Ej6_Par_Impar {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Num: ");
        int num=leer.nextInt();
        boolean resto=num%2==0;
        
        if (resto){
            System.out.println(num + " es par.");
        }else{
            System.out.println(num + " es impar.");
        }
    }
}
