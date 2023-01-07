/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se 
pedirá de nuevo hasta que la nota sea correcta. */
package Ej8B_nota_cero_y_dDiez;

import java.util.Scanner;

public class NotaEntre {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Nota: ");
        double nota = leer.nextDouble();
        boolean notaCorrecta = (nota >= 0) & (nota <= 10);
        if (!notaCorrecta) {
            while ((nota < 0) || (nota > 10)) {
                System.out.print("La nota es incorrecta, vuelva a ingresarla: ");
                nota = leer.nextDouble();
            }
            System.out.println("La nota es: " + nota);
        } else {
            System.out.println("La nota es: " + nota);
        }
    }

}
