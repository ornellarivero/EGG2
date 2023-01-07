package com.eggPractica.noticia.repositorios;

import com.eggPractica.noticia.entidad.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ImagennRepositorio extends JpaRepository<Imagen, Long>{

}
