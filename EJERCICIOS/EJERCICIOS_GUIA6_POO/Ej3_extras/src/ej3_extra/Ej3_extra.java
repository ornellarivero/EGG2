package ej3_extra;

import entidad.Raiz;
import service.RaizService;


public class Ej3_extra {

    
    public static void main(String[] args) {
        RaizService s = new RaizService();
        Raiz r=s.crearRaiz();
        
        System.out.println("Discriminante= "+s.getDiscriminante(r));
        System.out.println("");
        
        System.out.println("Tiene Raíces? "+s.tieneRaices(r));
        System.out.println("Tiene Raíz? "+s.tieneRaiz(r));
        System.out.println("");
        
        System.out.println("Obtener Raíces= "+s.obtenerRaices(r));
        System.out.println("");
        
        System.out.println("Obtener Raíz= "+s.obtenerRaiz(r));
        System.out.println("");
        
        s.calcular(r);
    }

}
