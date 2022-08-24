/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList.*/
package ej1.guia7;

import service.PerroService;

public class Ej1Guia7 {
 
    public static void main(String[] args) {
        PerroService s = new PerroService();
        s.crearPerro();
    }

}
