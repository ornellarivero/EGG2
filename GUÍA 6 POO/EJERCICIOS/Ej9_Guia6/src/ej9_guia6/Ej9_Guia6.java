
package ej9_guia6;

import ej9_guia6.entidades.Matematica;
import ej9_guia6.services.MatematicaService;

public class Ej9_Guia6 {

    public static void main(String[] args) {
        MatematicaService s = new MatematicaService();
        Matematica mat = s.crear();
        
        s.devolverMayor(mat);
        System.out.println("\n");
        s.calcularPotencia(mat);
        System.out.println("\n");
        s.calculaRaiz(mat);
    }
    
}
