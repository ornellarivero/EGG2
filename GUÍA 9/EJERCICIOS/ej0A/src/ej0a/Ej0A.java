/*EJERCICIO ANIMAL
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo 
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el 
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear 
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al 
método hacerRuido() de cada ítem.*/
package ej0a;

import entidades.Animal;
import java.util.ArrayList;
import services.GatoService;
import services.PerroService;

public class Ej0A {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        PerroService ps = new PerroService();
        GatoService gs = new GatoService();
        
        Animal animal = new Animal("Las siguientes mascotas ", "Todos los Colores.", "Todas las Razas.", "Todas las edades.");
        animales.add(animal);
        animales.add(ps.crearPerro());
        animales.add(gs.crearGato());

        for (Animal a : animales) {
            System.out.print(a.getNombre());
            a.hacerRuido();
        }
    }
}
