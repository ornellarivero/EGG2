package ej0b.guia8.service;

import ej0b.guia8.entidad.Jugador;
import java.util.Scanner;

public class JugadorService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Jugador crearJugador() {
        Jugador j = new Jugador();
        System.out.print("\nNombre: ");
        j.setNombre(leer.next().toUpperCase());

        System.out.print("Apellido: ");
        j.setApellido(leer.next().toUpperCase());

        System.out.print("Número: ");
        j.setNum(leer.nextInt());

        System.out.print("Posición: ");
        j.setPosicion(leer.nextInt());

        return j;
    }
}
