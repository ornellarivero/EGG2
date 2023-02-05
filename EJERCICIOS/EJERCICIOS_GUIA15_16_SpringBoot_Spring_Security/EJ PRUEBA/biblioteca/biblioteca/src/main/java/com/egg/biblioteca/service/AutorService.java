package com.egg.biblioteca.service;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    @Autowired
    private AutorRepositorio autorRepo;

    @Transactional
    public void crearAutor(String nombre) throws MiException {

        validar(nombre);

        Autor a = new Autor();

        a.setNombre(nombre);

        autorRepo.save(a);
    }

    public List<Autor> listarAutores() {
        List<Autor> autores = new ArrayList<>();

        autores = autorRepo.findAll();

        return autores;
    }

    @Transactional
    public void modificarAutor(String id, String nombre) throws MiException {

        validar(nombre);

        Optional<Autor> respAutor = autorRepo.findById(id);

        if (respAutor.isPresent()) {
            Autor a = respAutor.get();

            a.setNombre(nombre);

            autorRepo.save(a);
        }
    }

    public Autor getOne(String id) {
        return autorRepo.getOne(id);
    }

    public void eliminar(String id){
        autorRepo.deleteById(id);
    }
    
    private void validar(String nombre) throws MiException {
        if (nombre == null || nombre.isEmpty()) {
            throw new MiException("El Nombre no puede ser nulo");
        }
    }

}
