/*En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario 
todos sus datos y guardándolos en el objeto Pelicula.

Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere 
crear otra Pelicula o no.

Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en 
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en 
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla*/
package ej4.guia7.service;

import ej4.guia7.entidad.Pelicula;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PeliculaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList<>();

    public Pelicula crearPelicula() {
        Pelicula p = new Pelicula();
        System.out.print("Título Película: ");
        p.setTitulo(leer.next().toUpperCase());

        System.out.print("Director Película: ");
        p.setDirector(leer.next().toUpperCase());

        System.out.print("Duaración (hs) Película: ");
        p.setDuracionHoras(leer.nextDouble());

        return p;
    }

    public void agregarPeli() {
        System.out.println("\n^AGREGAR PELÍCULAS^");
        String sn;
        do {
            System.out.println("");
            peliculas.add(crearPelicula());
            System.out.print("\nDesea agregar otra peli? S/N >>> ");
            sn = leer.next();
        } while (sn.equalsIgnoreCase("si") || sn.equalsIgnoreCase("s"));
        mostrarPelis();
        pelisMasDeUnaHora();
        ordenarDeAcuerdoDuracion();
    }

    public void mostrarPelis() {
        System.out.println("\nPELÍCULAS");
        Iterator it = peliculas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void pelisMasDeUnaHora() {
        System.out.println("\nPELIS QUE DURAN MÁS DE 1H...");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracionHoras() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void ordenarDeAcuerdoDuracion() {
        System.out.println("\nDURACIÓN DE PELÍCULAS...");
        for (int i = 0; i < peliculas.size(); i++) {
            for (Pelicula pelicula : peliculas) {
                if (pelicula.getDuracionHoras() == i) {
                    System.out.println(pelicula);
                }
            }
        }
    }
}
