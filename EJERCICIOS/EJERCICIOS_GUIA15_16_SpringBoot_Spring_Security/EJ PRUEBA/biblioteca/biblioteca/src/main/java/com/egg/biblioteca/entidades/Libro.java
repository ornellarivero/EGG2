package com.egg.biblioteca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Libro {

    @Id
    private Long isbn;
    private String titulo;
    private Integer ejemplares;
    
    @ManyToOne
    private Autor autor;

    @ManyToOne
    private Editorial edit;

    public Libro() {
    }

    public Libro(String titulo, Integer ejemplares, Autor autor, Editorial edit) {
        this.titulo = titulo;
        this.ejemplares = ejemplares;
        this.autor = autor;
        this.edit = edit;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEdit() {
        return edit;
    }

    public void setEdit(Editorial edit) {
        this.edit = edit;
    }
    
    
}
