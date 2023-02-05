/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con 
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la 
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la 
altura. Se deberán además definir los métodos getters, setters y constructores 
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ej4_guia6;

import ej4_guia6.entidad.Rectangulo;
import ej4_guia6.service.RectanguloService;

public class Ej4_Guia6 {

    public static void main(String[] args) {
        RectanguloService service=new RectanguloService();
        Rectangulo rect = service.crearRectangulo();
        
        System.out.println(service.superficie(rect));
        System.out.println(service.perimetro(rect));
        service.dibujarRectangulo(rect);
        
        
    }
    
}
