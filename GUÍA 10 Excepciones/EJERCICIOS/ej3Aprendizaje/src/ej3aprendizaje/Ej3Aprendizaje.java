/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
una división con los dos numeros y mostrar el resultado. */
package ej3aprendizaje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3Aprendizaje {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("\nEXCEP: <<<NumberFormatException>>>");
        System.out.println("-Ingresar num 1: ");
        String num1=leer.next();
        System.out.println("-Ingresar num 2: ");
        String num2=leer.next();
        
        try {
            int convNum1 = Integer.parseInt(num1);
            int convNum2 = Integer.parseInt(num2);

            try {
                System.out.println("\nEXCEP: <<<ArithmeticException>>>");
                float division = convNum1 / convNum2;
                System.out.println(convNum1 + "/" + convNum2 + "=" + division);
            } catch (ArithmeticException e) {
                System.out.println("*Error, división por cero: " + e);
            }

        } catch (NumberFormatException e) {
            System.out.println("\n*El dato ingresado no puede convertirse a 'int': " + e);
        }
        
        System.out.println("\nEXCEP: <<<InputMismatchException>>>");
        try {
            System.out.print("-Ingresar dato 1: ");
            int n1 = leer.nextInt();
            System.out.print("-Ingresar dato 2: ");
            int n2 = leer.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Datos mal ingresado, tipos incompatibles: " + e);
        }

    }

}
