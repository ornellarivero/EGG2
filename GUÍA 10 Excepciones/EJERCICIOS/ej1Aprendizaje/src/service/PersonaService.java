package service;

import entidad.Persona;

public class PersonaService {

    public Persona crearPersona() {
        Persona p = new Persona();
        p.setNombre("micaela");
        p.setApellido("bossio");
        p.setEdad(30);
        return p;
    }
    
    public Persona crearPersonaNull(){
        Persona p = new Persona();
        p.setNombre("micaela");
        p.setApellido("bossio");
        p.setEdad(30);
        return null;
    }
    
    public boolean mayor(Persona p){
        if (p.getEdad()>18) {
            System.out.println("Es mayor");
            return true;
        }else{
            System.out.println("no es mayor");
            return false;
        }
        
    }
}
