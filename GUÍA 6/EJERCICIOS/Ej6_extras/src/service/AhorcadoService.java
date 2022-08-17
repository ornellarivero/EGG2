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

    public void buscar(Ahorcado a, String letra) {
        int cont = 0;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (a.getPalabra()[i].equals(letra)) {
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("La letra " + "'" + letra.toUpperCase() + "'" + " no está.");
            a.setCantJugadas(a.getCantJugadas() - 1);
        } else {
            System.out.println("La letra " + "'" + letra.toUpperCase() + "'" + " forma parte de la palabra.");
        }
    }

    public boolean encontradas(Ahorcado a, String letra) {
        int cont = 0;
        boolean letraEsta = true;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (a.getPalabra()[i].equals(letra)) {
                cont++;
            }
        }
        a.setCantLetrasEncontradas(a.getCantLetrasEncontradas() + cont);

        if (cont > 0) {
            System.out.println("La letra " + letra.toUpperCase() + " está " + a.getCantLetrasEncontradas() + " vez/ces.");
            System.out.println("Faltan encontrar " + (a.getPalabra().length - a.getCantLetrasEncontradas()) + " letra/s.");
            System.out.print("Estado: ");
            return letraEsta;
        } else {
            System.out.print("Estado: ");
            return !letraEsta;
        }
    }

    public int intentos(Ahorcado a) {
        System.out.println("Quedan " + a.getCantJugadas() + " jugadas.");
        return a.getCantJugadas();
    }

    public void juego(Ahorcado a, String letra) {
        longitud(a);
        buscar(a, letra);
        while ((intentos(a) > 0) || (a.getCantLetrasEncontradas() == a.getPalabra().length)) {
            System.out.println("(buscar)");
            buscar(a, letra);
            System.out.println("(encontradas)");
            encontradas(a, letra);
            intentos(a);
            System.out.println("(Ingrese otra letra)");
            letra = leer.next();
        }
    }

    
    
    
    
    
}
