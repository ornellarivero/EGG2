package com.eggPractica.noticia.servicios;

import com.eggPractica.noticia.entidad.Noticia;
import com.eggPractica.noticia.repositorios.INoticiaRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NoticiaServicio {

    @Autowired
    private INoticiaRepositorio notiRepo;

    public void crear(String titulo, String cuerpo) throws Exception {
        validar(titulo, cuerpo);

        Noticia noti = new Noticia();

        noti.setTitulo(titulo);
        noti.setCuerpo(cuerpo);

        notiRepo.save(noti);
    }
    
    public void modificar(Long id, String titulo, String cuerpo) throws Exception {
        validar(titulo, cuerpo);
        
//        Optional<Noticia> respuestaLibro= notiRepo.findById(id);

        Noticia noti = notiRepo.findById(id).get();

        noti.setTitulo(titulo);
        noti.setCuerpo(cuerpo);

        notiRepo.save(noti);
    }
    
    public List<Noticia> listar(){
        List<Noticia> noticias = notiRepo.findAll();
        
        return noticias; 
    }
    
    private Optional<Noticia> getById(Long id) {
        return notiRepo.findById(id);
        }
    
    public boolean existsById(Long id){
        return notiRepo.existsById(id);
    }
    
    public Noticia getOne(Long id){
        return notiRepo.getOne(id);
    }

    private List<Noticia> consultaNoticiaPorTitulo(String palabraABuscar) {
        if (palabraABuscar == null || palabraABuscar.isEmpty()) {
        } else {
            List<Noticia> noticia = notiRepo.buscarPorTitulo(palabraABuscar);
            return noticia;
        }
        return null;
    }

    public void eliminar(Long id){
       notiRepo.deleteById(id);
    }
    
    private void validar(String titulo, String cuerpo) throws Exception {

        if (titulo.isEmpty() || titulo == null) {
            throw new Exception("El Título no puede ser nulo");
        }

        if (cuerpo.isEmpty() || cuerpo == null) {
            throw new Exception("El cuerpo no puede ser nula");
        }
    }

}
