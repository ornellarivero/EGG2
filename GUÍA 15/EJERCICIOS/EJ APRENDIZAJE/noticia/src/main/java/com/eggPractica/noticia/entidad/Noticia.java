package com.eggPractica.noticia.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Noticia {

    @Id
    @GeneratedValue()
    private Long id;

    private String titulo;
    private String cuerpo;
    private String foto;

    public Noticia(String titulo, String cuerpo, String foto) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.foto = foto;
    }

}
