package com.eggPractica.noticia.repositorios;

import com.eggPractica.noticia.entidad.Noticia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface INoticiaRepositorio extends JpaRepository<Noticia, Long> {

    @Query("SELECT n FROM Noticia n WHERE n.titulo LIKE ?1")
    public List<Noticia> buscarPorTitulo(String titulo);

}
