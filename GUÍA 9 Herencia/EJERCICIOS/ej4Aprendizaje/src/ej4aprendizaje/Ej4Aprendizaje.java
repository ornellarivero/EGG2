/*Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas 
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las 
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los 
dos métodos para calcular el área, el perímetro y el valor de PI como constante. 
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se 
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el 
resultado final. 
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package ej4aprendizaje;

import entidades.Circulo;
import entidades.Forma;
import entidades.Rectangulo;
import services.CirculoService;
import services.RectanguloService;

public class Ej4Aprendizaje {

    public static void main(String[] args) {
        CirculoService cs = new CirculoService();
        RectanguloService rs = new RectanguloService();
        Forma c = new Circulo();
        Forma r = new Rectangulo();

        cs.crearCirculo((Forma) c);
        System.out.println("....................");
        rs.crearRectangulo((Rectangulo) r);
        System.out.println("....................");
        cs.area(c);
        cs.perimetro(c);
        System.out.println("....................");
        rs.area(r);
        rs.perimetro(r);

    }

}
