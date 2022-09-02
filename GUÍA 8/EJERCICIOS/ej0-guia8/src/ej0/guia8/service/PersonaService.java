
package ej0.guia8.service;

import ej0.guia8.entidad.Dni;
import ej0.guia8.entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(Dni dni){
        Persona p=new Persona();
        System.out.print("Nombre: ");
        p.setNombre(leer.next());
        
        System.out.print("Apellido: ");
        p.setApellido(leer.next());
        
        p.setDni(dni);
        return p;
    }
}
