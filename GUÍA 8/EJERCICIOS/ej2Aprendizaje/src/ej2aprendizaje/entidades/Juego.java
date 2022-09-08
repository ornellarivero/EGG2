/*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y 
Revolver*/
package ej2aprendizaje.entidades;

import java.util.ArrayList;

public class Juego {

    ArrayList<Jugador> jugadores = new ArrayList<>();
    private Revolver revolver;

    public Juego() {
    }

    public Juego(Revolver revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador jugador) {
        jugadores.add(jugador);
    }
    
    public void setConjuntoJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores=jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

    
}
