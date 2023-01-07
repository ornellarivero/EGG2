/*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
la lista ordenada*/
package ej2.guia7.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PerroService {

    Scanner leer;
    ArrayList<String> razasPerros;

    public PerroService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.razasPerros = new ArrayList<>();
    }

    public void crearArray() {
        String sn;
        do {
            System.out.print("Raza Perro:");
            razasPerros.add(leer.next());
            System.out.print("Desea agregar otra raza? S/N: ");
            sn = leer.next().toUpperCase();
        } while (sn.equals("S"));
        System.out.print("RAZAS:");
        for (String raza : razasPerros) {
            System.out.print(raza.toUpperCase() + ", ");
        }
        System.out.println("");
    }

    public void buscarPerro() {
        System.out.print("Qué raza de perro quiere eliminar?");
        String raza = leer.next().toUpperCase();
        //Se crea el "Iterator" para recorrer el array 
        int longitud = razasPerros.size();
        Iterator it = razasPerros.iterator();

        while (it.hasNext()) {
            //El .next() retorna el siguiente elemento en la iteración
            if (it.next().equals(raza)) {
                it.remove();
                System.out.println("Raza '" + raza.toUpperCase() + "' eliminada.");
                break;
            }
//            else {
//                System.out.println("No se encontró la raza.");
//                break;
//            }
        }
//        int longActual = razasPerros.size();
        if (longitud==razasPerros.size()) {
            System.out.println("No se encontró la raza.");
        }
        Collections.sort(razasPerros);

        for (String r : razasPerros) {
            System.out.println(r.toUpperCase() + ", ");
        }
    }

}
