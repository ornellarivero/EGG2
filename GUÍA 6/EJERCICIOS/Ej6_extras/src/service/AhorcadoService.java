/*• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con 
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la 
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el 
valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: 
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca si la 
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre 
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá 
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se 
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
/////////////////////////////////////////////////////////////////////////////////////
• Método juego(): el método juego se encargará de llamar todos los métodos 
previamente mencionados e informará cuando el usuario descubra toda la palabra o 
se quede sin intentos. Este método se llamará en el main.

Un ejemplo de salida puede ser así:
Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
 */
package service;

import entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {
        Ahorcado a = new Ahorcado();
        System.out.println("Palabra: ");
        String palabra = leer.next();
        String[] splt = palabra.split("");
        a.setPalabra(splt);

        System.out.println("Cantidad de jugadas:");
        a.setCantJugadas(leer.nextInt());
        a.setCantLetrasEncontradas(0);
        return a;
    }

    public void longitud(Ahorcado a) {
        System.out.println("Longitud de la palabra: " + a.getPalabra().length);
    }

    public boolean buscar(Ahorcado a, String letra) {
        boolean esta = false;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (a.getPalabra()[i].equals(letra)) {
                a.setCantLetrasEncontradas(a.getCantLetrasEncontradas() + 1);
                esta = true;
            }
        }

        if (!esta) {
            System.out.println("La letra " + "'" + letra.toUpperCase() + "'" + " no está.");
            a.setCantJugadas(a.getCantJugadas() - 1);
        } else {
            System.out.println("La letra " + "'" + letra.toUpperCase() + "'" + " forma parte de la palabra.");
        }
        System.out.println("Faltan encontrar " + (a.getPalabra().length - a.getCantLetrasEncontradas()) + " letra/s.");
        return esta;
    }

    public void intentos(Ahorcado a) {
        System.out.println("Quedan " + a.getCantJugadas() + " jugadas.");
    }

    public void juego() {
        Ahorcado a = crearJuego();
        String letra;
        boolean usada;
        longitud(a);
        String[] letrasUsadas = new String[27];
        int cont = 0;
        do {
            usada = false;
            System.out.print("Ingrese letra: ");
            letra = leer.next();

            for (int i = 0; i < letrasUsadas.length; i++) {
                if (letra.equals(letrasUsadas[i])) {
                    usada = true;
                }
            }
            if (!usada) {
                buscar(a, letra);
                letrasUsadas[cont] = letra;
                cont++;
                longitud(a);
                intentos(a);
            }else{
                System.out.println("La letra "+letra+ " ya se usó.");
            }

            System.out.println("............................");
        } while (((a.getCantJugadas()) > 0 && (a.getCantLetrasEncontradas() != a.getPalabra().length)));
    }

}
