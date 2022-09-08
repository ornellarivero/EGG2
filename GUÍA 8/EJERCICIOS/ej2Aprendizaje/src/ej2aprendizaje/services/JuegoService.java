/*Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/
package ej2aprendizaje.services;

import ej2aprendizaje.entidades.Juego;
import ej2aprendizaje.entidades.Jugador;
import ej2aprendizaje.entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class JuegoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Jugador> llenarJuego(Revolver r) {
        JugadorService js = new JugadorService();
        Juego juego = new Juego();

        juego.setRevolver(r);

        System.out.print("\nNúm. de jugadores (no más de 6): ");
        int jugadores = leer.nextInt();
        int cont = 0;
        if (jugadores > 6) {
            System.out.println("\nExcede el máx de jugadores. Se crearán 6.");
            while (cont < 6) {
                juego.setJugadores(js.crearJugador());
            }
        } else {
            System.out.println("\nSe crearán " + jugadores + " jugadores.");
            while (cont < jugadores) {
                juego.setJugadores(js.crearJugador());
            }
        }
        System.out.println("\nLista de jugadores: ");
        for (Jugador jugador : juego.getJugadores()) {
            System.out.println(jugador.getNombre());
        }
        return juego.getJugadores();
        //GUARDAR ARRAYLIST EN UNA VARIABLE
    }

    public void ronda(ArrayList<Jugador> varJugadores, JugadorService js, Revolver varRevolver, RevolverService rs) {
        Revolver varR = varRevolver;
        for (int i = 0; i < varJugadores.size(); i++) {
            for (Jugador jugador : varJugadores) {
                if (js.disparo(varR, jugador, rs)) {
                    varJugadores.remove(jugador);
                    System.out.println("\nFin juego.");
                } else {
                    System.out.println("\nNo se mojó ningún jugador.");
                }
            }
        }
    }

}
