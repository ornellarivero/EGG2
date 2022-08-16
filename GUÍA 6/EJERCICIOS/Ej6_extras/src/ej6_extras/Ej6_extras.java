package ej6_extras;

import entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
import service.AhorcadoService;

public class Ej6_extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AhorcadoService s = new AhorcadoService();
        Ahorcado a = s.crearJuego();
//        System.out.println("-----------------");
//        System.out.println(a.getPalabra().toString());
//        System.out.println("-----------------");
        
        s.longitud(a);
        System.out.println("");
        
        System.out.print("Ingrese letra: ");
        String letra=leer.next();
        System.out.println("");
        
        s.buscar(a, letra);
        System.out.println("");
        
        System.out.println(s.encontradas(a, letra));

    }

}
