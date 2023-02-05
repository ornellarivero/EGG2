/*
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculará si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la 
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano.
 */
package ej7.guia6.service;

import ej7.guia6.entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        Persona perso = new Persona();
        System.out.print("Nombre: ");
        String name = leer.next();
        String primerLerta = name.substring(0, 1).toUpperCase();
        perso.setNombre(primerLerta + name.substring(1));
        System.out.print("Edad: ");
        perso.setEdad(leer.nextInt());
        System.out.print("Sexo(M, H, O): ");
        String sexo = leer.next().toLowerCase();
        if (!(sexo.equals("m")) & !(sexo.equals("h")) & !(sexo.equals("o"))) {
            while (!(sexo.equals("m")) & !(sexo.equals("h")) & !(sexo.equals("o"))) {
                System.out.println("Incorrecto, vuelva a ingresar el sexo...");
                sexo = leer.next().toLowerCase();
            }
            perso.setSexo(sexo);
        } else {
            perso.setSexo(sexo);
        }
        System.out.print("Peso: ");
        perso.setPeso(leer.nextFloat());
        System.out.print("Altura: ");
        perso.setAltura(leer.nextFloat());
        return perso;
    }
    
    public int calcularIMC(Persona perso) {
        float imc = perso.getPeso() / (perso.getAltura() * perso.getAltura());
        if (imc < 20) {
            return -1;
        } else if (imc > 25) {
            return 1;
        }
        return 0;
    }
    
    public boolean esMayorDeEdad(Persona perso) {
        if (perso.getEdad() > 18) {
            return true;
        } else {
            return false;
        }
    }
    
}
