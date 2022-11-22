package com.eggPractica.noticia.repositorios;

import com.eggPractica.noticia.entidad.Periodista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodistaRepositorio extends JpaRepository<Periodista, Long>{

}
