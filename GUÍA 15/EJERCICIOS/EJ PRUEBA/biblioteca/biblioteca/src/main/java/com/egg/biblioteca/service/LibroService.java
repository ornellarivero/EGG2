package com.egg.biblioteca.service;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.excepciones.MiException;
import com.egg.biblioteca.repositorios.AutorRepositorio;
import com.egg.biblioteca.repositorios.EditorialRepositorio;
import com.egg.biblioteca.repositorios.LibroRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService {

    @Autowired
    private LibroRepositorio libroRepo;
    @Autowired
    private AutorRepositorio autorRepo;
    @Autowired
    private EditorialRepositorio editRepo;

    @Transactional
    public void crearLibro(Long isbn, String titulo, String idEditorial, String idAutor) throws MiException {

        validar(isbn, titulo, idEditorial, idAutor);

        Optional<Libro> respuesta = libroRepo.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepo.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editRepo.findById(idEditorial);

        Autor autor = new Autor();
        Editorial editorial = new Editorial();

        if (respuestaAutor.isPresent()) {

            autor = respuestaAutor.get();
        }

        if (respuestaEditorial.isPresent()) {

            editorial = respuestaEditorial.get();
        }

        if (respuestaEditorial.isPresent()) {
            Libro libro = respuesta.get();

            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setEdit(editorial);

            libroRepo.save(libro);
        }
    }

    public List<Libro> listarLibros() {
        List<Libro> libros = new ArrayList<>();

        libros = libroRepo.findAll();

        return libros;
    }

    @Transactional
    public void modificarLibro(Long isbn, String titulo, String idAutor, String idEditorial) throws MiException {

        validar(isbn, titulo, idEditorial, idAutor);

        Optional<Libro> respuestaLibro = libroRepo.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepo.findById(idAutor);
        Optional<Editorial> respuestaEdit = editRepo.findById(idEditorial);

        Autor a = new Autor();
        Editorial e = new Editorial();

        if (respuestaAutor.isPresent()) {
            a = respuestaAutor.get();
        }

        if (respuestaEdit.isPresent()) {
            e = respuestaEdit.get();
        }

        if (respuestaLibro.isPresent()) {
            Libro l = respuestaLibro.get();

            l.setTitulo(titulo);
            l.setAutor(a);
            l.setEdit(e);

            libroRepo.save(l);
        }
    }

    public Libro getOne(Long isbn) {
        return libroRepo.getOne(isbn);
    }

    private void validar(Long isbn, String titulo, String idEditorial, String idAutor) throws MiException {

        if (isbn == null) {
            throw new MiException("El ISBN no puede ser nulo");
        }

        if (titulo.isEmpty() || titulo == null) {
            throw new MiException("El Título no puede ser nulo");
        }

        if (idEditorial.isEmpty() || idEditorial == null) {
            throw new MiException("La Editorial no puede ser nula");
        }

        if (idAutor.isEmpty() || idAutor == null) {
            throw new MiException("El Autor no puede ser nulo");
        }
    }

}
