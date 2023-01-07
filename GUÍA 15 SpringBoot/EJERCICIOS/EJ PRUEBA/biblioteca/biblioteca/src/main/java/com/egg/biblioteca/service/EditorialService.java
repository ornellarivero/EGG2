package com.egg.biblioteca.service;

import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.EditorialRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class EditorialService {

    @Autowired
    EditorialRepositorio editRepo;
    
    public void crearEditorial(String nombre)throws MiException{
        
        validar(nombre);
        
        Editorial e = new Editorial();
        
        e.setNombre(nombre);
        
        editRepo.save(e);
    }
    
    public List<Editorial> listarEditoriales(){
        
        List<Editorial> editoriales = new ArrayList<>();
        
        editoriales = editRepo.findAll();
        
        return editoriales;
    }
    
    
    public void modificarEditorial(String nombre, String id) throws MiException{
        
        validar(nombre);
        
        Optional<Editorial> respEdit= editRepo.findById(id);
        
        if (respEdit.isPresent()) {
            Editorial e = respEdit.get();
            
            e.setNombre(nombre);
            
            editRepo.save(e);
        }
    }
    
    public Editorial getOne(String id){
        return editRepo.getOne(id);
    }
    
    public void eliminar(String id){
        editRepo.deleteById(id);
    }
    
    private void validar(String nombre)throws MiException{
        if (nombre==null || nombre.isEmpty()) {
            throw new MiException("El nombre no puede ser nulo");
        }
    }
    
    
}
