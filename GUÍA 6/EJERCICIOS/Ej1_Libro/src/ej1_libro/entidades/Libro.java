/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas*/
package ej1_libro.entidades;

import java.util.Scanner;

public class Libro {

    public int isbn;
    public String titulo;
    public String autor;
    public int numPag;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + isbn + ", Título=" + titulo + ", Autor=" + autor + ", num. de pág=" + numPag + '}';
    }
    
}
