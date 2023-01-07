
package ej2_extras;

import entidad.Punto;
import service.PuntosService;


public class Ej2_extras {

    
    public static void main(String[] args) {
        PuntosService s= new PuntosService();
        System.out.println("VALORES X, Y SUB 1 DE P1:");
        Punto p1=s.crearPunto();
        System.out.println("");
        System.out.println("VALORES X, Y SUB 2 DE P2:");
        Punto p2=s.crearPunto();
        System.out.println("");
        
        System.out.println("La distancia entre P1 y P2 es "+s.distancia(p1, p2));
    }

}
