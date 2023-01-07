/*Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
package ej2aprendizaje.services;

import ej2aprendizaje.entidades.Jugador;
import ej2aprendizaje.entidades.Revolver;
import java.util.Scanner;

public class JugadorService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Jugador crearJugador() {
        Jugador j = new Jugador();
        j.setId((int) (Math.random() * 6 + 1));
        System.out.print("Nombre Jugador: ");
        j.setNombre(leer.next());
        j.setMojado(false);
        return j;
    }

    public boolean disparo(Revolver variable, Jugador j, RevolverService s) {
        boolean aux;
        if (s.gatillar(variable)) {
            j.setMojado(true);
            s.siguienteChorro(variable);
            System.out.println("Jugador "+j.getNombre()+" fuera de juego.");
            aux=true;
        }else{
            aux=false;
        }
        j.setMojado(false);
        return aux;
    }
    
    
    

}
