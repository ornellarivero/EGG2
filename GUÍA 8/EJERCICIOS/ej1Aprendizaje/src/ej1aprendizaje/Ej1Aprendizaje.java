
package ej1aprendizaje;

import ej1aprendizaje.services.PerroService;
import ej1aprendizaje.services.PersonaService;

public class Ej1Aprendizaje {

    public static void main(String[] args) {
        PersonaService persoS=new PersonaService();
        PerroService perroS=new PerroService();
        
        System.out.println("\nPERSONA 1");
        persoS.crearPersona(perroS.crearPerro());
        
        System.out.println("\nPERSONA 2");
        persoS.crearPersona(perroS.crearPerro());
        
        
    }
    
}
