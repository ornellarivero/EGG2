
package ej0.guia8;

import ej0.guia8.entidad.Dni;
import ej0.guia8.entidad.Persona;
import ej0.guia8.service.DniService;
import ej0.guia8.service.PersonaService;

public class Ej0Guia8 {

    public static void main(String[] args) {
        DniService sd=new DniService();
        PersonaService sp=new PersonaService();
      
        System.out.println(sp.crearPersona(sd.crearDni())+"\n"+"................");
        System.out.println(sp.crearPersona(sd.crearDni())+"\n"+"................");
        System.out.println(sp.crearPersona(sd.crearDni())+"\n"+"................");
        
        
        
    }

}
