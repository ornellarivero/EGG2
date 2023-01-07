/*Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o 
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero 
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna 
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y 
luego se llama al método, este no mostrara esa primera carta*/
package ej3aprendizaje.services;

import ej3aprendizaje.entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class BarajaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Carta> mostrarMazo(ArrayList<Carta> mazo) {

        for (Carta carta : mazo) {
            System.out.println(carta);
        }
        return mazo;
    }

    public ArrayList<Carta> barajar(ArrayList<Carta> mazo) {
        Collections.shuffle(mazo);
        return mazo;
    }

    public void siguienteCarta(ArrayList<Carta> mazo, ArrayList<Carta> aux) {
        String sn = "s";
        if (mazo.size() == 0) {
            System.out.println("NO HAY MÁS CARTAS QUE MOSTRAR.");
        } else {
            while (sn.equalsIgnoreCase("s")) {
                System.out.println(mazo.get(0));
                aux.add(mazo.get(0));
                mazo.remove(0);
                System.out.println("Ver siguieten carta? s/n");
                sn = leer.next();
            }
        }
    }

    public int cartasDisponibles(ArrayList<Carta> mazo) {
        System.out.print("\nCartas disponibles: " + mazo.size());
        return mazo.size();
    }

    public void darCartas(ArrayList<Carta> mazo, ArrayList<Carta> aux) {
        System.out.print("Num. de cartas: ");
        int numCartas = leer.nextInt();
        if (numCartas <= mazo.size()) {
            for (int i = 0; i < numCartas; i++) {
                System.out.println(mazo.get(0));
                aux.add(mazo.get(0));
                mazo.remove(0);
            }
        } else {
            System.out.println("\nPedís más cartas de las que hay.\nEl mazo tiene " + mazo.size() + " cartas.\n");
        }
    }

    public void cartasMonton(ArrayList<Carta> aux) {
        Iterator it = aux.iterator();
        System.out.println("\nCARTAS QUE YA SALIERON");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void mostrarBaraja(ArrayList<Carta> mazo) {
        Iterator it = mazo.iterator();
        System.out.println("\nCARTAS QUE QUEDAN EN EL MAZO");
        if (mazo.size() == 0) {
            System.out.println("NO QUEDAN MÁS CARTAS.");
        } else {
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }

}
