/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene 
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es 
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package ej7.guia6;

import ej7.guia6.entidad.Persona;
import ej7.guia6.service.PersonaService;

public class Ej7Guia6 {

    public static void main(String[] args) {
        PersonaService s = new PersonaService();
        Persona p = s.crearPersona();
        Persona p1 = s.crearPersona();
        Persona p2= s.crearPersona();
        Persona p3= s.crearPersona();

        Persona vector[] = new Persona[4];
        vector[0] = p;
        vector[1] = p1;
        vector[2] = p2;
        vector[3] = p3;
        System.out.println("\n");

        int bajoPeso = 0;
        int pesoIdeal = 0;
        int sobrepeso = 0;

        int mayores = 0;
        int menores = 0;

        int cantidadPersonas = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println(vector[i].getNombre());

            switch (s.calcularIMC(vector[i])) {
                case -1:
                    System.out.println("Bajo peso.");
                    bajoPeso = bajoPeso + 1;
                    break;
                case 0:
                    System.out.println("Peso ideal.");
                    pesoIdeal = pesoIdeal + 1;
                    break;
                case 1:
                    System.out.println("Sobrepeso.");
                    sobrepeso = sobrepeso + 1;
                    break;
                default:
                    throw new AssertionError();
            }

            if (s.esMayorDeEdad(vector[i])) {
                System.out.println("Mayor de edad.");
                mayores = mayores + 1;
            } else {
                System.out.println("Menor de edad.");
                menores = menores + 1;
            }
            System.out.println(".................");
            cantidadPersonas = cantidadPersonas + 1;
        }
        System.out.println("\n");

        System.out.println(bajoPeso + " personas están bajo de peso.");
        System.out.println(pesoIdeal + " personas están bien de peso.");
        System.out.println(sobrepeso + " personas tienen sobrepeso.");

        System.out.println("El " + (mayores * 100 / cantidadPersonas) + "% de las pesonas son mayores de edad.");
        System.out.println("El " + (menores * 100 / cantidadPersonas) + "% de las pesonas son menores de edad.");
    }

}
