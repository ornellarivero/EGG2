/*Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, 
tendremos una clase Pelicula con el título, director y duración de la película (en horas). 
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo 
que se pide a continuación:*/
package ej4.guia7.entidad;

public class Pelicula {
private String titulo, director;
private double duracionHoras;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracionHoras) {
        this.titulo = titulo;
        this.director = director;
        this.duracionHoras = duracionHoras;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return "<" + "Título=" + titulo + ", Director=" + director + ", Duración=" + duracionHoras + '>';
    }
}
