package com.eggPractica.noticia.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Noticia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titulo;
    private String cuerpo;
    
    @ManyToOne
    private Periodista creador;
    
    @OneToOne
    private Imagen imagen;

    public Noticia(String titulo, String cuerpo, Imagen imagen) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.imagen = imagen;
    }

}
