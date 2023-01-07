package Ej12B_EsMultiplo;

import java.util.Scanner;

public class EsMultiplo {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Num1: ");
        int num1=leer.nextInt();
        System.out.print("Num2: ");
        int num2=leer.nextInt();
        EsMultiplo(num1, num2);
    }
    public static void EsMultiplo(int num1, int num2){
        boolean multiplo=num1 % num2 ==0;
        if (multiplo){
            System.out.println("Son múltiplos");
        }else{
            System.out.println("No son múltiplos");
        }
    }
}
