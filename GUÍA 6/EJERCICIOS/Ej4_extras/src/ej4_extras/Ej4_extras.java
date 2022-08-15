
package ej4_extras;

import entidad.NIF;
import service.NIFService;


public class Ej4_extras {

    
    public static void main(String[] args) {
        NIFService s = new NIFService();
        NIF nif = s.crearNif();
        
        s.mostrar(nif);
        
    }

}
