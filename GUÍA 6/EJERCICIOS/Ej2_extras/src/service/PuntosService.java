/*Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
los atributos del objeto. 
Después, a través de otro método calcular y devolver la distancia 
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como 
calcular la distancia entre dos puntos consulte el siguiente link: 
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html*/
package service;

import entidad.Punto;
import java.util.Scanner;


public class PuntosService {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public Punto crearPunto() {
        Punto p=new Punto();
        System.out.print("Valor x:");
        p.setX(leer.nextInt());
        System.out.print("Valor y: ");
        p.setY(leer.nextInt());
       
        return p;
    }
    
    public float distancia(Punto p1, Punto p2){
        return (float) Math.sqrt(Math.pow(p2.getX()-p1.getX(), 2)+Math.pow((p2.getY()-p1.getY()), 2));
    }
    
    
}
