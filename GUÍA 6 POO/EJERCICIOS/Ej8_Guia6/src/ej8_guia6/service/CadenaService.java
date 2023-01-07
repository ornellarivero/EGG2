/*
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase 
ingresada. 
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por 
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que 
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con 
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se 
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la 
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que 
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ej8_guia6.service;

import ej8_guia6.entidad.Cadena;
import java.util.Scanner;

public class CadenaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        Cadena cad = new Cadena();
        System.out.print("Ingrese frase o palabra: ");
        cad.setFrase(leer.next());
        cad.setLongitud(cad.getFrase().length());
        return cad;
    }

    public int mostrarVocales(Cadena cad) {
        String frase = cad.getFrase();
        int cont = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if ((frase.substring(i, i + 1).equals("a")) || (frase.substring(i, i + 1).equals("e")) || (frase.substring(i, i + 1).equals("i")) || (frase.substring(i, i + 1).equals("o")) || (frase.substring(i, i + 1).equals("u"))) {
                cont = cont + 1;
            }
        }
        return cont;
    }

    public void invertirFrase(Cadena cad) {
        String frase = cad.getFrase();
        System.out.println("Frase: " + frase);
        StringBuilder strBldr = new StringBuilder(frase);
        frase = strBldr.reverse().toString();
        System.out.println("Frase al revéz: " + frase);
    }

    public void vecesRepetido(Cadena cad) {
        String frase = cad.getFrase();
        System.out.print("Letra a buscar:");
        String letra = leer.next();
        int cont = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if ((frase.substring(i, i + 1).equals(letra))) {
                cont = cont + 1;
            }
        }
        if (cont == 0) {
            System.out.println("La letra " + letra + " no está.");
        } else {
            System.out.println("La letra " + letra + " está " + cont + " veces.");
        }
    }

    public void compararLongitud(Cadena cad) {
        System.out.println("Frase principal: " + cad.getFrase());
        int longFrase = cad.getFrase().length();

        System.out.print("Ingrese frase nueva.");
        String fraseNueva = leer.next();
        int longFNueva = fraseNueva.length();

        if (longFrase > longFNueva) {
            System.out.println("Ppal: " + longFrase + " vs " + "Nueva: " + longFNueva);
            System.out.println("La long. de la frase ppal es mayor.");
        } else {
            System.out.println("Ppal: " + longFrase + " vs " + "Nueva: " + longFNueva);
            System.out.println("La long. de la frase ppal es menor.");
        }
    }

    public void unirFrases(Cadena cad) {
        String frase = cad.getFrase();
        System.out.println("Frase actual: " + frase);
        System.out.println("Ingrese palabra o frase a concatenar.");
        String fraseNueva = leer.next();
        cad.setFrase(frase.concat(" " + fraseNueva)); 
        System.out.println(cad.getFrase());
    }

    public void reemplazar(Cadena cad) {
        String frase = cad.getFrase();
        System.out.println("El caracter que ingrese reemplazará a la 'a'.");
        System.out.print("Ingresar letra:");
        String letra = leer.next();
        for (int i = 0; i < cad.getLongitud(); i++) {
            if ((frase.substring(i, i + 1).equals("a"))) {
                frase = frase.replace("a", letra).toString();
                System.out.println(frase);
            }
        }
    }

    public boolean contiene(Cadena cad) {
        String frase = cad.getFrase();
        System.out.print("Ingrese letra buscar: ");
        String letra = leer.next();
        boolean contiene = false;

        for (int i = 0; i < cad.getLongitud(); i++) {
            if ((frase.substring(i, i + 1).equals(letra))) {
                contiene = true;
                return contiene;
            }
        }
        return contiene;
    }
}
