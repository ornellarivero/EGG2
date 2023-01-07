/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.
 */
package ej1_libro;

import ej1_libro.entidades.Libro;
import java.util.Scanner;

public class Ej1_Libro {

    public static void main(String[] args) {
        Libro libro = new Libro();
        cargarLibro(libro);
        informarLibro(libro);
    }

    public static void cargarLibro(Libro libro) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese ISBN: ");
        libro.isbn = leer.nextInt();
        System.out.print("Ingrese título: ");
        libro.titulo = leer.next();
        System.out.print("Ingrese autor: ");
        libro.autor = leer.next();
        System.out.print("Ingrese num. Pág: ");
        libro.numPag = leer.nextInt();
        System.out.println("\n");
    }
    public static void informarLibro(Libro libro) {
        System.out.println(libro.toString());
    }
    
}
