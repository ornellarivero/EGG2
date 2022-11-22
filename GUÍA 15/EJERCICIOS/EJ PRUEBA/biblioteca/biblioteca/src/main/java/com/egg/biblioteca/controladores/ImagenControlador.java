package com.egg.biblioteca.controladores;

import com.egg.biblioteca.entidades.Usuario;
import com.egg.biblioteca.service.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/imagen")
public class ImagenControlador {
    
    @Autowired
    private UsuarioServicio usuService;
    
    //URL Q SE LLAMA DESDE LA URL INDEX PARA MOSTRAR IMG DE USUARIO LOGUEADO
    @GetMapping("/perfil/{id}")
    public ResponseEntity<byte[]> imgUsuario(@PathVariable Long id){
        Usuario u = usuService.getOne(id);
        
        //DEL USUARIO NECESITO QUE ME TRAIGA EL CONTENIDO DE LA IMAGEN
        byte[] imagen = u.getImagen().getContenido();
        
        //ESTA "cabecera" LE DICE AL NAVEGADOR QUE DEVOLVERÁ UNA IMAGEN
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);
   
        return new ResponseEntity<>(imagen, headers, HttpStatus.OK);
    }
}
