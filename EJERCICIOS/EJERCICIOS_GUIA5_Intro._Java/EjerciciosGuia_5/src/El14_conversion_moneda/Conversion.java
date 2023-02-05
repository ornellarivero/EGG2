/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package El14_conversion_moneda;

import java.util.Scanner;

public class Conversion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Euros: ");
        double euros = leer.nextDouble();
        System.out.println("Convertir a: libra, dolar o yen");
        String moneda = leer.next();
        dolares(euros, moneda);
    }

    public static void dolares(double euros, String moneda) {
        switch (moneda) {
            case "libra":
                System.out.println(euros + "€ " + "son " + (euros * 0.86) + " libras");
                break;
            case "dolar":
                System.out.println(euros + "€ " + "son " + (euros * 1.28611)+ " dólares ");
                break;
            case "yen":
                System.out.println(euros + "€ " + "son " + (euros * 129.852) + " yenes");
                break;
            default:
                System.out.println("Esa moneda aún no está en sistema");
        }
    }
}
