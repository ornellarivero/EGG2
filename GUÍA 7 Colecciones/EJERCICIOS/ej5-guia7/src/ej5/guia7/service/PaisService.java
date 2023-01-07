/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos 
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el 
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir, 
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer 
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar 
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el 
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
al usuario.*/
package ej5.guia7.service;

import ej5.guia7.ListaPaises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashSet<String> agregarPaises() {
        ListaPaises lp = new ListaPaises();
        System.out.println("AGREGAR PAÍSES AL CONJUNTO");
        String sn;
        do {
            System.out.print("País: ");
            lp.setPais(leer.next().toUpperCase());
            System.out.print("\nDesea agregar otro país? S/N >>> ");
            sn = leer.next();
        } while (sn.equalsIgnoreCase("si") || sn.equalsIgnoreCase("s"));
        System.out.println("\nPAÍSES DEORDENADOS:");
        System.out.println(lp.toString());
        return lp.getPaises();
    }

    public TreeSet<String> listaOrdenada(HashSet<String> lp) {
        TreeSet<String> listaOrdenada = new TreeSet(lp);
        System.out.println("\nPAÍSES ORDENADOS:");
        System.out.println(listaOrdenada);
        return listaOrdenada;
    }

    public void eliminarPais(TreeSet<String> listaOrdenada) {
        Iterator it = listaOrdenada.iterator();
        int longitudLista = listaOrdenada.size();
        System.out.print("\nQUIERE ELIMINAR UN PAÍS DE LA LISTA? S/N >>>");
        String sn = leer.next();
        if (sn.equalsIgnoreCase("si") || sn.equalsIgnoreCase("s")) {
            System.out.print("Qué país quiere eliminar?: ");
            String pais = leer.next();
            while (it.hasNext()) {
                if (pais.equalsIgnoreCase((String) it.next())) {
                    it.remove();
                }
            }
            if (listaOrdenada.size() == longitudLista) {
                System.out.println("'"+pais.toUpperCase()+"' no está en la lista.");
            } else {
                System.out.println("El país '" + pais.toUpperCase() + "' se eliminó correctamente.");
            }
        } else {
            System.out.println("Ok. No se eliminó ningún país.");
        }
        System.out.println("PAÍSES: " + listaOrdenada);
    }

}
