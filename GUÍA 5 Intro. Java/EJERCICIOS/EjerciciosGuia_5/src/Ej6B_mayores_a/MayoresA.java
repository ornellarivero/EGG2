/*Implementar un programa que le pida dos números enteros a usuario y determine si ambos o 
alguno de ellos es mayor a 25.*/
package Ej6B_mayores_a;

import java.util.Scanner;

public class MayoresA {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Num1");
        int num1=leer.nextInt();
        System.out.println("Num2");
        int num2=leer.nextInt();
        if((num1>25)&(num2>25)){
            System.out.println("ambos mayores a 25");
        } else if(num1>25){
            System.out.println("Num 1 mayor a 25");
        }else if(num2>25){
            System.out.println("Num 2 mayor a 25");
        }else{
            System.out.println("uno o ambos son menores a 25");
        }
        
    }
}
