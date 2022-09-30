/*Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el 
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula 
try-catch para probar la nueva excepción que debe ser controlada*/
package ej1aprendizaje;

import service.PersonaService;

public class Ej1Aprendizaje {

    public static void main(String[] args) {
        PersonaService ps = new PersonaService();
        ps.mayor(ps.crearPersona());
        try {
            ps.mayor(ps.crearPersonaNull());
        } catch (NullPointerException e) {
            System.out.println("La clase es null: "+ e.toString());
        }

    }

}
