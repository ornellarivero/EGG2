/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú*/
package Ej11_Menu;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Num 1: ");
        int num1 = leer.nextInt();
        System.out.println("Num 2: ");
        int num2 = leer.nextInt();

        boolean fin = false;
        int opcion = 0;

        while (fin == false) {
            System.out.println("MENU");
            System.out.println("""
                                   1 Sumar 
                                   2 Restar 
                                   3 Multiplicar 
                                   4 Dividir 
                                   5 Salir""");
            System.out.println("Elija una opción...");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                    System.out.println("...............");
                    break;
                case 2:
                    System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                    System.out.println("...............");
                    break;
                case 3:
                    System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                    System.out.println("...............");
                    break;
                case 4:
                    System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                    System.out.println("...............");
                    break;
                case 5:
                    System.out.println("Está seguro de salir? S/N: ");
                    String salir = leer.next();
                    if (salir.contains("s")) {
                        fin = true;
                    }
                        break;
                default:
                    System.out.println("LA OPCIÓN " + opcion + " ES INCORRECTA...");
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
            }
        }
    }
}
