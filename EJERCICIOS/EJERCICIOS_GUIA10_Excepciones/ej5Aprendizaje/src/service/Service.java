package service;

import java.util.Scanner;

public class Service {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public int asignarNum() {
        boolean datoCorrecto = false;
        int cont = 0;
        int numIngresado = 0;
        while (!datoCorrecto && cont < 2) {
            try {
                System.out.print("Ingrese num: ");
                numIngresado = Integer.parseInt(leer.next());
                datoCorrecto = true;
            } catch (NumberFormatException e) {
                System.out.println("ERROR, lo introducido no es valido: " + e.getMessage()+"\n>>>Núm=0 ");
                datoCorrecto = false;
                cont++;
            }
        }
        return numIngresado;
    }

    public void adivinarNum() {
        int numRandom = (int) (Math.random() * 600);
        System.out.println(numRandom);
        int numIngresado=-1;
        int cont = 0;
        while (numIngresado != numRandom && cont < 3) {
            numIngresado=asignarNum();
            if (numIngresado < numRandom) {
                System.out.println("Tu núm. es menor al random.");
            } else if (numIngresado > numRandom) {
                System.out.println("Tu núm. es mayor al random.");
            }
            cont++;
        }
        if (numIngresado == numRandom) {
            System.out.println("¡Adivinaste! El núm. es: " + numRandom);
        } else {
            System.out.println("Perdiste, el núm era: " + numRandom);
        }
    }

}
