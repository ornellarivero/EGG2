package ej0b.guia8.service;

import ej0b.guia8.entidad.Jugador;
import java.util.ArrayList;

public class EquipoService {

    ArrayList<Jugador> jugadores = new ArrayList<>();

    public ArrayList<Jugador> crearEquipo(Jugador j) {
        jugadores.add(j);
        return jugadores;
    }

    public void mostrarEquipo() {
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre()+" "+jugador.getApellido()+"\nNúmero: "+jugador.getNum()+"\nPosición: "+jugador.getPosicion()+"\n--------------");
        }
    }
}
