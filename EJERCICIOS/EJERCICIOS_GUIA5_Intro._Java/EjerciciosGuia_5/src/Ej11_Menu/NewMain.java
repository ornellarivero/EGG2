/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú*/
package Ej11_Menu;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        boolean salir = false;
        while (salir == false) {
            System.out.println("ELIJA DOS NÚMEROS:\nNum 1: ");
            int num1 = leer.nextInt();
            System.out.println("Num 2: ");
            int num2 = leer.nextInt();
            System.out.println("\nMENÚ:");
            System.out.println("1)Sumar "
                    + "2)Restar "
                    + "3)Multiplicar "
                    + "4)Dividir "
                    + "5)Salir"
            );
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.err.println("SUMA: "+(num1 + num2)+"\n");
                    break;
                case 2:
                    System.err.println("RESTA: "+(num1 - num2)+"\n");
                    break;
                case 3:
                    System.err.println("MULTIPLICACIÓN: "+(num1 * num2)+"\n");
                    break;
                case 4:
                    System.err.println("DIVISIÓN: "+(num1 / num2)+"\n");
                    break;
                case 5:
                    System.err.println("Desea salir? si/no");
                    String sale=leer.next();
                    if (sale.equalsIgnoreCase("si")) {
                        salir=true;
                    }else{
                        salir=false;
                    }
                    break;
                default:
                    System.err.println("Esa opción no existe");
            }
        }

    }
}
