/*Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho 
esto, desde el main recorreremos el equipo mostrando la información de cada jugador*/
package ej0b.guia8.entidad;

import java.util.ArrayList;

public class Equipo {

    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Jugador jugador;

    public Equipo() {
    }

    public Equipo(Jugador jugador) {
        this.jugador = jugador;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setRecibirJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Jugadores= " + jugadores;
    }

}
