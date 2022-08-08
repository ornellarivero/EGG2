/*
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada
 */
package ej6_guia6.service;

import ej6_guia6.entidades.Cafetera;
import java.util.Scanner;

public class CafeteraService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarCafetera(Cafetera caf) {
        caf.setCantidadActual(caf.getCapacidadMaxima());
    }

    public void servirTaza(Cafetera caf) {
        System.out.println("Contenido cafetera: " + caf.getCantidadActual() + " ml.");
        System.out.print("Tamaño taza a servir: ");
        float tamanioTaza = leer.nextFloat();
        if (tamanioTaza > caf.getCantidadActual()) {
            System.out.println("No alcanza para llenar la taza, se servirá lo que quede en la cafetera.");
            System.out.println("Para llenar la taza faltan " + (tamanioTaza - caf.getCantidadActual()) + " ml.");
            caf.setCantidadActual(0);
        } else {
            caf.setCantidadActual(caf.getCantidadActual() - tamanioTaza);
            System.out.println("A la cafetera le quedan " + caf.getCantidadActual() + " ml.");
        }
    }

    public void vaciarCafetera(Cafetera caf) {
        caf.setCantidadActual(0);
        System.out.print("La cafetera se vació.");
        System.out.println("Tiene " + caf.getCantidadActual() + " ml.");
    }

    public void agregarCafe(Cafetera caf) {
        System.out.println("La cafetera tiene " + caf.getCantidadActual() + " ml.");
        System.out.print("Cuántos ml de café ingresará?.");
        float litrosCafe = leer.nextFloat();
        float cantAct=caf.getCantidadActual();
        caf.setCantidadActual(caf.getCantidadActual()+litrosCafe);

        if (caf.getCantidadActual() > 1000) {
            System.out.println("La cafetera tiene 1L de capacidad máx.");
            System.out.println("Se agregarán solo "+(1000-cantAct)+" ml.");
            caf.setCantidadActual(1000);
            System.out.println("Ahora la cafetera tiene " + caf.getCantidadActual()+ " ml.");
        } else {
            caf.setCantidadActual(caf.getCantidadActual()+litrosCafe);
            System.out.println("A la cafetera se le agregaron " + litrosCafe+ " ml.");
            System.out.println("Ahora tiene " + caf.getCantidadActual()+ " ml.");
        }
    }

}
