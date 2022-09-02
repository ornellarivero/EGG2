
package ej0.guia8.service;

import ej0.guia8.entidad.Dni;
import java.util.Scanner;

public class DniService {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public Dni crearDni(){
        Dni dni=new Dni();
        System.out.print("DNI: ");
        dni.setNum(leer.nextInt());
        return dni;
    }
}
