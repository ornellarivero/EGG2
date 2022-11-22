package com.eggPractica.noticia.repositorios;

import com.eggPractica.noticia.entidad.FotoPerfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotoPerfilRepositorio extends JpaRepository<FotoPerfil, Long>{

}
