package ej0b.guia8;

import ej0b.guia8.service.EquipoService;
import ej0b.guia8.service.JugadorService;

public class Ej0bGuia8 {

    public static void main(String[] args) {
        JugadorService js=new JugadorService();
        EquipoService es=new EquipoService();
        
        es.crearEquipo(js.crearJugador());
        es.crearEquipo(js.crearJugador());
        
        System.out.println("\nJ U G A D O R E S\n");
        es.mostrarEquipo();                
                
    }

}
