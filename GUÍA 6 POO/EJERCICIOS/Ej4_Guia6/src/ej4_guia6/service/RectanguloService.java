
package ej4_guia6.service;

import ej4_guia6.entidad.Rectangulo;
import java.util.Scanner;

public class RectanguloService {
    public Rectangulo crearRectangulo(){
        Rectangulo rect=new Rectangulo();
        Scanner leer=new Scanner(System.in);
        System.out.print("Base: ");
        rect.setBase(leer.nextInt());
        System.out.print("Altura: ");
        rect.setAltura(leer.nextInt());
        return rect;
    }
    
    public int superficie(Rectangulo rect){
        System.out.print("La superficie es ");
        return rect.getBase()*rect.getAltura();
    }
    
    public int perimetro(Rectangulo rect){
        System.out.print("El perímetro es ");
        return (rect.getBase()+rect.getAltura())*2;
    }
    
    public void dibujarRectangulo(Rectangulo rect){
        int altura=rect.getAltura();
        int base=rect.getBase();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if ((i==0)||(j==0)||(i==altura-1 || j==base-1)) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
